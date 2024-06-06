package streams_intro;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class Statistics {
    public static void main(String[] args) {
        var stream = IntStream.of(1,2,3,4,5);
        IntSummaryStatistics intSummaryStatistics = stream.summaryStatistics();
        
    }
}
