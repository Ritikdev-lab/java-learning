package io.github.ritikdevlab.learning.ch5.enumerated;

import static io.github.ritikdevlab.learning.ch5.enumerated.Enumdemo.Size.*;

public class EnumeratedMain {
    /* The enum can also be written here */
    public static void main(String[] args) {
        // 1.This method give all the constant name of Enum
        Type[] types = Type.values();
        for (Type e : types) {
            IO.println("-> " + e);
        }

        //2. It give the enum constant of a specified enum to a variable
        Type type = Type.valueOf(Type.class, "HEAVY");
        IO.println("The name is " + type);

        //3. This gives the name of a enum constant and it is final
        IO.println("Name of a enumerated constant " + Type.NORMAL.name());

        //4. Give the index of the enum constant
        IO.println("The index of enum MIDLE is " + Type.MIDLE.ordinal());

        Type type2 = Type.NORMAL;

        //5. We can use the names of the constant directly in switch statement
        switch (type2) {
            case SUPER_NORMAL -> IO.println("SUPER_NORMAL");
            case NORMAL -> IO.println("NORMAL");
            case MIDLE -> IO.println("MIDLE");
            case HEAVY -> IO.println("HEAVY");
            case SUPER_HEAVY -> IO.println("SUPER_HEAVY");
            default -> IO.println("Not found");
        }

        IO.println("Size from Enumdemo is " + SMALL.name());

        //6. This method compare the two constant of same enum and give if one come after another
        int result = Type.MIDLE.compareTo(Type.HEAVY);
        IO.println("MIDLE comes before HEAVY so it is negetive " + result);
    }

    enum Type {
        SUPER_NORMAL("SN"),
        NORMAL("N"),
        MIDLE("M"),
        HEAVY("H"),
        
        //7. Here the method of the specified constant are overridden but others are same
        SUPER_HEAVY("SH") {
            public String toString() {
                return "XL";
            }
        };

        private final String abbreviation;
        
        //The constructor of enum class is always private
        Type(String abbreviation) {
            this.abbreviation = abbreviation;
        }

        public String getAbbreviation() {
            return abbreviation;
        }

        //8. Inside the enum we can use Constant directly
        public String getNormal() {
            return NORMAL.name();
        }
    }
}
