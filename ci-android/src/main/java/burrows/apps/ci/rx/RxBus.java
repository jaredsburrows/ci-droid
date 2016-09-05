package burrows.apps.ci.rx;

import rx.Observable;
import rx.subjects.PublishSubject;
import rx.subjects.SerializedSubject;
import rx.subjects.Subject;

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
public final class RxBus {
  private final Subject<Object, Object> bus = new SerializedSubject<>(PublishSubject.create());

  public void send(final Object event) {
    this.bus.onNext(event);
  }

  public Observable<Object> toObservable() {
    return this.bus;
  }

  public boolean hasObservers() {
    return this.bus.hasObservers();
  }
}
