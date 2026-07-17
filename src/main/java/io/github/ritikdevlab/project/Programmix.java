package io.github.ritikdevlab.project;
public class Programmix {
	public static void main(String[] args) {
        enum Product{Banana,Potato,Onion,Car};
        Product b = Product.Banana;
        Product p = Product.Potato;
        Product o = Product.Onion;
        Product c = Product.Car;
        for(int i = 1; i <= 4; i++) {
            int input = Integer.parseInt(IO.readln("Choose from the 1,2,3,4 : "));
            if(input >= 1 && input <= 4) {
                switch(input) {
                case 1-> IO.println("The product is : " + b);
                case 2-> IO.println("The product is :" + p);
                case 3-> IO.println("The product is : " + o);
                case 4-> IO.println("The product is : " + c);
            }
        }
            else
                IO.println("Invalid number: " + input);
            }
    
	}
}
