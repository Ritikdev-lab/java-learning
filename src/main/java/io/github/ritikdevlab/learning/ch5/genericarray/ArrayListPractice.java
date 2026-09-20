package io.github.ritikdevlab.learning.ch5.genericarray;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<Integer> ar = new ArrayList<>(6);

        ar.add(12);
        ar.add(14);
        ar.add(15);

        //1. It replace the element from the specific index
        ar.set(1, 20);

        //2. It add the element in the middle and shift the rest of the element to the right
        ar.add(2, 50);
        
        //3. It remove the the element from the specific index
        ar.remove(2);

        //4. Here there will be extra Capacity so We need the trimToSize() method to srink the capacity
        ar.trimToSize();

        //5. This method used to get the element in a specific index
        var change = ar.get(1);
        String toString = ar.toString();
        int capacity = ar.size();

        IO.println("The ArrayList is " + toString + " ,The Size is " + capacity);
        IO.println("The changed element is " + change);

        // The Data type must be same as the ArrayList to store the elements in an array
        Integer[] arr = new Integer[ar.size()];
        ar.toArray(arr);

        IO.println(Arrays.toString(arr));
        
        char a = '-';
        IO.println(String.valueOf(a).repeat(10));

        var Arr = new ArrayList<String>();
        Arr.ensureCapacity(3);

        Arr.add("Ritik");
        Arr.add("Rabin");
        Arr.add("Kuni");
        Arr.add("Bharat");

        //1. It changes the specific element
        Arr.set(2, "Ranjit");

        //2. It add the element in the middle and shift the rest of the element to the right
        Arr.add(2, "Damayanti");

        //3. It remove the element in a specific index
        Arr.remove(2);

        //4. Here Size = Capacity so We do not need trimToSize() method

        //5. This method used to get element in a specific index
        String Change = Arr.get(2);

        IO.println("The ArrayList is " + Arr.toString() + " ,The Size is " + Arr.size());
        IO.println("The change is " + Change);

        String[] str = new String[Arr.size()];
        //6. This convert the arraylist into the array
        Arr.toArray(str);

        IO.println(Arrays.toString(str));
    }
}
