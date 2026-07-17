package io.github.ritikdevlab.learning.Ch3.Arrays;
import java.util.Arrays;
public class ArrayDemo{
	public static void main(String[] args) {	
	  	//one dimentional array
	 	//This is Array Declaration + Allocation + Manual Initialization
	 	//The array starts from 0 and and the final value is (value-1)
	  	int[] month;
	  	month = new int[12]; 
	  	month[0] = 31;
	  	month[1] = 28;
	  	month[2] = 31;
	  	month[3] = 30;
	  	month[4] = 31;
	  	month[5] = 30;
	  	month[6] = 31;
	  	month[7] = 31;
	  	month[8] = 30;
	  	month[9] = 31;
	  	month[10] = 30;
	  	month[11] = 31;
	  	int num2 = Integer.parseInt(IO.readln("Name of the month from 1 to 12 is: "));
	  	String[] Month1 = {"January","February","March","April","May","June","July","August","September","Octcober","November","December"};
	  	if(num2 >= 1 && num2 <= month.length) { //Here this array.length() States the length of an array
	    	String month1 = Month1[num2 - 1];
	    	int Days = month[num2 - 1];
	    	IO.println("Month " + month1 + " has " + Days + " days");
	  	}
	  	else {
	    	IO.println("Invalid Month number!");
	  	}
	
	  	//This is Array declaration + initialization
	  	//In the String array the default result is null
	  	String[] class_moniter = new String[6];
	  	class_moniter[0] = "Kuna";
	  	class_moniter[1] = "Buna";
	  	class_moniter[2] = "Jagadish";
	  	class_moniter[3] = "Pradip";
	  	class_moniter[4] = "Dipak";
	  	class_moniter[5] = "Ritik";
	  	int Num = Integer.parseInt(IO.readln("The class name from 1 to 6: "));
	  	if(Num >= 1 && Num <= class_moniter.length) { //Here this array.length() States the length of an array
	    	int[] class1 = {1,2,3,4,5,6};
	    	int class2 = class1[Num - 1];
	    	String Name = class_moniter[Num - 1];
	    	IO.println("The moniter of the class " + class2 + " is " + Name);
	  	}
	  	else {
	    	IO.println("Invalid class number!");
	  	}
	
	  	//This is an array that gives the average value
	  	double[] PI = {3.14, 3.1416, 3.14159};
	  	int num = Integer.parseInt(IO.readln("Choose pi from Which is from 1 to 3: "));
	  	if(num < 1 || num > 3) {
	  		IO.println("Invalid choice");
	  		return;
	  	}
	  	double pi1 = PI[num - 1];
	  	String answer = IO.readln("The pi value is " + pi1 + " continue? y/n: ");
	  	if(answer.equals("y")) {
	    	double result = 1;
	    	for(int i = 12;i <= 18; i += 3) {
	      		result = result * (2 * pi1 * i); 
	    	}
	    	IO.println("The Final average is: " + result / 3);
	  	}
	  	else {
	    	IO.println("Please choose another one");
	  	}
	
      	//This is the Anonymous array
	  	int[] age;
	  	age = new int[] {5,6,9,10,32};
	  	IO.println("Age is " + age[2]);
	  	/*This mean 
	    	int[] anonymous = {5,6,9,10,32};
	    	age = anonymous;
	  	*/
	
	  	//Here in boolean the default is false
	  	boolean[] b = new boolean[2];
	  	IO.println(b.length);//Here this array.length() States the length of an array
	  	IO.println("The result is " + b[1]);
	
      	//This is enhance for loop and is called "for each" loop
      	int[] numbers = {2,4,5,6};
      	for(int num5 : numbers) {
        	IO.println(num5);
      	}
  
      	//It prints the entire array in a readable format but to use it we need to import first
      	IO.println(Arrays.toString(numbers));
  
      	//int[] luckyNumbers = smallPrimes;
      	//This does NOT copy the array values.It only copies the reference (address).Change in one → affects the other Because both are pointing to the same array
      	//This is real Array copying
      	int[] number2 = {2,5,8};
      	int[] copynumber2 = Arrays.copyOf(numbers ,number2.length);//it made the same length as first array
      	copynumber2[2] = 12;
      	IO.println(Arrays.toString(number2));
      	IO.println(Arrays.toString(copynumber2));
  
      	//if we Creates a bigger array->Copies old values->Extra space is filled with default values
      	int[] copynumber3 = Arrays.copyOf(numbers , 5);
      	IO.println(Arrays.toString(copynumber3));
  
      	//If new size is smaller->extra value are cut off
      	int[] copynumbers4 = Arrays.copyOf(numbers , 2);
      	IO.println(Arrays.toString(copynumbers4));
  
      	//Use of array shorting and it arrange elements of an array in order.
      	int[] numbers3 = {8,3,9,2};
      	int[] copynumbers3 = Arrays.copyOf(numbers3, numbers3.length);
      	Arrays.sort(copynumbers3);
      	IO.println(Arrays.toString(copynumbers3));

      	//Here are the some impotant method uses
      	//1.Use of toString(T[] a)
      	int[] a = {2,8,5,7};
      	IO.println(Arrays.toString(a));
  
      	//2.Use of copyOf(T[] a, int end)
      	int[] s = Arrays.copyOf(a , 2);
      	IO.println(Arrays.toString(s));
  	
      	//3.Use of copyOfRange(T[] a, int start, int end).Here start is inclusive and end is exclusive
      	int[] c = Arrays.copyOfRange(a, 1 ,3);
      	IO.println(Arrays.toString(c));
  
      	//4.Use of sort(T[] a).It arrange the elements in ascending order
      	double[] j = {2.1, 7.1, 4.9, 1.1};
      	Arrays.sort(j);
      	IO.println(Arrays.toString(j));
  
      	//Use of fill(T[] a, T v).It fills entire arrays with a single value
      	int[] l = new int[3];
      	Arrays.fill(l, 3);
      	IO.println(Arrays.toString(l));
  
      	//Use of equals(T[] a, T[] b).It cheaks if two array are equals if yes->true if no->false
      	int[] n = {2,5,8};
      	int[] m = {2,5,8};
      	IO.println(Arrays.equals(n , m));
  
      	//Allocate the array and fill it using loop
      	int[] num1 = new int[4];
      	for(int z = 0;z < num1.length;z++)  {
        	num1[z] = z + 2; 
      	}  
      	IO.println(Arrays.toString(num1));    
	}	  
}
