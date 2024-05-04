package beyond_classes.enums;

public enum Seasons {
        SUMMER, ATOM, WINTER,SPRING;
        // ; is optional


        Seasons() {
        }
}

/***
 * Test take aways
 * */
class Favorites {
        enum Flavors {
                VANILLA, CHOCOLATE, STRAWBERRY;
                //VANILLA, CHOCOLATE, STRAWBERRY  You need to specify the (;) if you have variables and constructor after
                static final Flavors DEFAULT = STRAWBERRY;
                }

        public static void main(String[] args) {
                for (final var e : Flavors.values())
                        System.out.print(e.ordinal() + " ");
        }
}