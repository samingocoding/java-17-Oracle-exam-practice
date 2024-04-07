package class_design.enums;

public enum SpecialEnum implements Methods{
    //Enum can implement an interface
    //You cant extend an interface  Eg class Sam  extends Seasons
    WINTER {
        @Override
        public int getTemperature() {
            return 4;
        }

        public String getHours() { return "10am-3pm"; } },
    SPRING {
        public String getHours() { return "9am-5pm"; }
        @Override
        public int getTemperature() {
            return 9;
        }
    }, SUMMER {
        public String getHours() { return "9am-7pm"; }

    },

//    FALL{
//        //Required to implement abstract method Hence won't compile
//    }
    ;
    public abstract String getHours();


    //You can define a global method
    public String getEnumMotive(){
     return "I am an enum that can be used by all enum in here";
    }

    /**
     * For a base method override use a global implementation
     * */
    @Override
    public int getTemperature() {
        return 5;
    }
}

interface Methods{
    int getTemperature();
}

