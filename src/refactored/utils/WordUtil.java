package refactored.utils;

import java.util.Arrays;
import java.util.Locale;

public class WordUtil {

  private WordUtil() {
  }

  public static String[] getWords(String content) {
    if (content == null || content.isEmpty()) {
      return new String[0];
    }

    return Arrays.stream(cleanText(content).split(" +"))
        .filter(s -> !s.isBlank())
        .map(String::trim)
        .toArray(String[]::new);
  }

  private static String cleanText(String text) {
    return text.replaceAll("[^A-Za-z ]", " ").toLowerCase(Locale.ROOT);
  }
}
