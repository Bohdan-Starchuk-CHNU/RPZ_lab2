package refactored.utils;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.function.Consumer;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MeasureTimeUtil {

  static Logger logger = Logger.getLogger(MeasureTimeUtil.class.getName());

  private MeasureTimeUtil() {
  }

  public static <T> void measureTime(Consumer<T> methodToMeasure, T value) {
    var start = LocalDateTime.now();
    methodToMeasure.accept(value);
    var finish = LocalDateTime.now();

    if (logger.isLoggable(Level.INFO)) {
        logger.info("------");
        logger.info(String.valueOf(ChronoUnit.MILLIS.between(start, finish)));
    }
  }
}
