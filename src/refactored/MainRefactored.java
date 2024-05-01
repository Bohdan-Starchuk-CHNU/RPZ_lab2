package refactored;

import refactored.utils.AnalyticsUtil;
import refactored.utils.MeasureTimeUtil;

public class MainRefactored {

    public static final String FILE_PATH = "src/assets/harry.txt";

    public static void main(String[] args) {
        MeasureTimeUtil.measureTime(AnalyticsUtil::generateAnalytic, FILE_PATH);
    }
}
