package response;

import burrows.apps.ci.rest.model.travisci.Annotation;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.List;

/**
 * @see <a href="https://docs.travis-ci.com/api#annotations">https://docs.travis-ci.com/api#annotations</a>
 */
@Generated("org.jsonschema2pojo")
public class AnnotationsResponse {
  @SerializedName("annotations") @Expose private List<Annotation> annotations = new ArrayList<>();

  public AnnotationsResponse() { }
  public AnnotationsResponse(List<Annotation> annotations) { this.annotations = annotations; }

  public List<Annotation> getAnnotations() { return annotations; }
  public void setAnnotations(List<Annotation> annotations) { this.annotations = annotations; }
  public AnnotationsResponse withAnnotations(List<Annotation> annotations) { this.annotations = annotations; return this; }
}
