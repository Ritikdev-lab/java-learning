package io.github.ritikdevlab.learning.Ch5.Reflection;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ReflectionArray {
	public static void main(String[] args) {
		int[] arr = {2, 5, 17, 18};
		
		Class<?> obj = arr.getClass();
		IO.println(obj.getName());
		
		
		Class<?> componentType = obj.getComponentType();
		IO.println(componentType.getName());
		

		Class<?> arrType = componentType.arrayType();
		IO.println(arrType.getName());
		

		Object getArr = Array.get(arr, 0);
		IO.println(getArr.toString());
		

		Array.set(arr, 0, 14); 
		IO.println(arr[0]);
		

		Object array = Array.newInstance(int.class, 3);
		
		for (int i = 0; i < 3; i++) {
			int value = i * 10;
			Array.setInt(array, i, value);
		}
		IO.println("The Length of array = " + Array.getLength(array));
		IO.println(Arrays.toString((int[])array));
		

        Object multiArray = Array.newInstance(int.class, new int[]{2, 3});

        Array.setInt(Array.get(multiArray, 0), 0, 10);
        Array.setInt(Array.get(multiArray, 0), 1, 20);
        Array.setInt(Array.get(multiArray, 0), 2, 30);

        Array.setInt(Array.get(multiArray, 1), 0, 40);
        Array.setInt(Array.get(multiArray, 1), 1, 50);
        Array.setInt(Array.get(multiArray, 1), 2, 60);

        IO.println("Multidimensional array:");

        IO.println(Arrays.deepToString((int[][]) multiArray));
		
	}
}
