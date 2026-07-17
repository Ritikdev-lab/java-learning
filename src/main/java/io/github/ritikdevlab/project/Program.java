package io.github.ritikdevlab.project;
public class Program {
	public static void main(String[] args) {
        String Name = IO.readln("What ");
        switch(Name) {
            case "Hi":IO.println("Hello sir");
            break;
            case "What are you":IO.println("I am a program sir");
            break;
            case "Is this program successful":IO.println("Yes sir");
            break;
            default:IO.println("Sorry this sentence is not in my database");
        }

	}
}
