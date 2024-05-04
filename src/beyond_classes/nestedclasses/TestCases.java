package beyond_classes.nestedclasses;

public class TestCases {
}

class Ostrich {
    private  int count;
    private static int count2;

    static class OstrichWrangler {
        public int stampede() {
//            return count;  count not accessible only if marked static
                return count2;
        }
    }
}