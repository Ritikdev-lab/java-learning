package io.github.ritikdevlab.learning.Ch3.Operators;

public class ArithmeticOperator {
    public static void main(String[] args) {
        /**
         * 1. modulus/remainder = %. Ex-5 % 2 = 1.
         * 
         * 2. The remaining Math.asin(),Math.acos() and the cot,sec and cosec does not
         *      exit but we can derieve like Math.tan(angle) by dividing with 1.
         * 
         * 3. In the method Math.atan2(y, x) the y and x are the coordinate of
         *      the angle from the point of origin.
         * 
         * 4. When arithmetic(+, -, *, /, %) is performed by byte, short, char
         *      they autometically promoted to int.
         */

        float firstNumber = 12F;
        float secondNumber = 2F;
        float resultForPrecision = firstNumber + secondNumber;

        // Demonstration of floatToFloat16() method.
        short half = Float.floatToFloat16(resultForPrecision);
        IO.println("Half precision in short:-" + half);

        // Demonstration of float16ToFloat() method.
        float full = Float.float16ToFloat(half);
        IO.println("Full precision in float:- " + full);

        // Math.floorMod() uses floor division (division rounded toward −∞).
        int calculateMod = Math.floorMod(-13, 2);
        IO.println(calculateMod);

        // % uses truncating division (division rounded toward 0):
        var num1 = Integer.parseInt(IO.readln("First number:- "));
        var num2 = Integer.parseInt(IO.readln("Sencond number:- "));
        var remainderResult = num1 % num2;
        IO.println("Remainder = " + remainderResult);

        // Demonstrates method for calculation of squre root.
        double number = Double.parseDouble(IO.readln("Enter number:- "));
        double squreRootResult = Math.sqrt(number);
        IO.println("Squre Root = " + squreRootResult);

        // Demonstrates casting of double value into int and use of Math.sqrt method.
        int numb = Integer.parseInt(IO.readln("Enter number:- "));
        int squreRootResult2 = (int) Math.sqrt(numb);
        IO.println("Result Without Decimal = " + squreRootResult2);

        // Demonstrates method to calculate the exponent of a base. Ex-2² = 4.
        int base = Integer.parseInt(IO.readln("Enter base:- "));
        int exponent = Integer.parseInt(IO.readln("Enter exponent:- "));
        double result = Math.pow(base, exponent);
        IO.println("Result = " + result);

        // Demonstrates method to convert degree into radian.
        double degreeNumber = Double.parseDouble(IO.readln("Enter Degree:- "));
        var conversionResult = Math.toRadians(degreeNumber);
        double sinValue = Math.sin(conversionResult);
        IO.println("Sin Value = " + sinValue);

        // Demonstrates method to convert radian to cos value.
        double requiredNumber = Double.parseDouble(IO.readln("Enter the Degree: "));
        var radianConvert = Math.toRadians(requiredNumber);
        double cosResult = Math.cos(radianConvert);
        IO.println("Cos Value = " + cosResult);

        // Demonstrates method to convert radian to tan value.
        double numForTan = Double.parseDouble(IO.readln("Enter the Degree: "));
        var convertRadian = Math.toRadians(numForTan);
        double tanResult = Math.tan(convertRadian);
        IO.println("Tan Value = " + tanResult);

        // Demonstrates the method to convert tan back to radian.
        double reverseTan = Math.atan(1);
        IO.println("Radian For tan" + reverseTan);

        // Demonstrates the Math.atan2(y, x) method.
        double advanceReverse = Math.atan2(4, 3);
        IO.println("Radian For tan" + advanceReverse);

        // Demonstrates the method for eˣ. Where e ≈ 2.718281828459045.
        double ExponentForX = Math.exp(2);
        IO.println("e² = " + ExponentForX);

        // Demonstrates the method for getting natural logarithem or ln(x).
        double naturalLogResult = Math.log(10);
        IO.println("ln(10) = " + naturalLogResult);

        // Demonstrates the method for getting log of base 10 or log₁₀(x).
        double getLog10 = Math.log10(100);
        IO.println("log₁₀(100) = " + getLog10);

        // Demonstrates of Math.champ(value,min,max) method.
        int ExperimentNumber = Math.clamp(15, 0, 10);
        IO.println("Result = " + ExperimentNumber);

        // Demonstrates the the Math.Pi method.
        double constantPi = Math.PI;
        IO.println("PI Value = " + constantPi);

        // Demonstrates the Math.TAU method.
        double constantTau = Math.TAU;
        IO.println("Tau Value = " + constantTau);

        // Demonstrates the Math.E method.
        double constantE = Math.E;
        IO.println("E Value = " + constantE);

        int givenValue = Integer.parseInt(IO.readln("Give the value(degree):- "));
        IO.println("The Radian:- " + Math.toRadians(givenValue));

        // Demonstrates the method to convert radian to degree.
        double forConversion = Double.parseDouble(IO.readln("Give the value(radian):- "));
        IO.println("The Degree:- " + Math.toDegrees(forConversion));

        // StrictMath guarantees that every Java implementation produces the same result.
        double strictDegree = StrictMath.toDegrees(20);
        IO.println("20 radian into degree:- " + strictDegree);

        /*
         * 1. Demonstration of Math.multiplyExact() method.

         * 2. We use it because it has security for overflow.
         */
        int multiplyExact = Math.multiplyExact(100000, 20);
        IO.println("Multiply with security is " + multiplyExact);
    }
}
