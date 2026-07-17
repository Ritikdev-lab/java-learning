package io.github.ritikdevlab.project;
public class Program1 {
	public static void main(String[] args) {
        for(int i = 1; i <= 3;i++) {
            enum size{SMALL,MEDIUM,LARGE}; //now enum can be only access inside it
            size s = size.SMALL;
            size p = size.MEDIUM;
            size q = size.LARGE;
            String input = IO.readln("Type from the s, p or q: ");
            if(input.equalsIgnoreCase("s")) {
                IO.println(s);
            }  
            else if(input.equalsIgnoreCase("p")) {
                IO.println(p);
            }
            else if(input.equalsIgnoreCase("q")) {
                IO.println(q);
            }
            else {
                IO.println("invalid input");break;
            }
        }
   
	}
}

