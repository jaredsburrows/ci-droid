package burrows.apps.ci.di.module;


import android.app.Application;
import burrows.apps.ci.BuildConfig;
import burrows.apps.ci.rest.service.TravisCiApiService;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import dagger.Module;
import dagger.Provides;
import okhttp3.Cache;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

import javax.inject.Named;
import javax.inject.Singleton;
import java.util.concurrent.TimeUnit;

@Module
public class NetModule {
  public final static String OK_HTTP_CLIENT_CACHE = "OK_HTTP_CLIENT_CACHE";
  public final static String OK_HTTP_CLIENT_NO_CACHE = "OK_HTTP_CLIENT_NO_CACHE";
  private static String TRAVIS_CI_BASE_URL = "https://api.travis-ci.org/";
  private static int CLIENT_TIME_OUT = 10;
  private static String DATE_FORMAT = "yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'SSS'Z'"; // Eg. 2016-06-19T13:07:45.139Z
  private static int CACHE_SIZE = 10 * 1024 * 1024; // 10 MB

  @Provides @Singleton public Gson provideGson() {
    return new GsonBuilder()
      .disableHtmlEscaping()
      .excludeFieldsWithoutExposeAnnotation()
      .setDateFormat(DATE_FORMAT)
      .create();
  }

  @Provides @Singleton public Cache provideOkHttpCache(Application application) {
    return new Cache(application.getApplicationContext().getCacheDir(), CACHE_SIZE);
  }

//  @Provides @Singleton @Named(OK_HTTP_CLIENT_CACHE) public OkHttpClient provideOkHttpClient( Cache cache) {
//    return getOkHttpClient()
//      .cache(cache)
//      .build();
//  }

  @Provides @Singleton @Named(OK_HTTP_CLIENT_NO_CACHE) public OkHttpClient provideOkHttpClient() {
    return getOkHttpClient()
      .build();
  }

  @Provides @Singleton public Retrofit.Builder provideRetrofitBuilder(
    Gson gson, @Named(OK_HTTP_CLIENT_NO_CACHE) OkHttpClient client) {
    return new Retrofit.Builder()
      .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
      .addConverterFactory(GsonConverterFactory.create(gson))
      .client(client);
  }

  // TODO spilt up server to have some cached calls
  @Provides @Singleton public TravisCiApiService provideRetrofit(Retrofit.Builder builder) {
    return builder.baseUrl(TRAVIS_CI_BASE_URL).build().create(TravisCiApiService.class);
  }

  private static OkHttpClient.Builder getOkHttpClient() {
    return new OkHttpClient.Builder()
      .addInterceptor(new HttpLoggingInterceptor()
        .setLevel(BuildConfig.RETROFIT_LOG_LEVEL))
      .connectTimeout(CLIENT_TIME_OUT, TimeUnit.SECONDS)
      .writeTimeout(CLIENT_TIME_OUT, TimeUnit.SECONDS)
      .readTimeout(CLIENT_TIME_OUT, TimeUnit.SECONDS);
  }
}
