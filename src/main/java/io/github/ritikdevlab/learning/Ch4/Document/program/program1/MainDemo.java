package io.github.ritikdevlab.learning.Ch4.Document.program.program1;
public class MainDemo {
    public static void main(String[] args) {
        int num1 = 15;
        int num2 = 12;
        int result = Tom.Add(num1, num2);
        //Here the name is object variable and the value is the the refreence of newly created object new scannerdemo1()
        Fix name = new Fix();
        int result2 = name.Minus(num1, num2);
        IO.println(result);
        IO.println(result2);
        //In one file only one publc method is required
        //To compile all file in one folder we need to run javac *.java
        //Then run java MainDemo
    }
}
class Tom {
    //Here we use int because it need paramitor and we do not use void because we need to return the value
    static int Add(int n1 , int n2) {
        int r = n1 + n2;
        return r;
    }
}
class Fix {
    //Here we use int because it need paramitor and we do not use void because we need to return the value
    int Minus(int a1 , int a2) {
        int b = a1 - a2;
        return b;
    }
}
//In one class only one public method is required and the name of the public class should be same as the name of the file.
