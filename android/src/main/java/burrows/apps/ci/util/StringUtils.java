package burrows.apps.ci.util;

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
public final class StringUtils {
  private StringUtils() { }

  public static boolean isEmpty(String string) { return string == null || string.trim().isEmpty(); }
}
