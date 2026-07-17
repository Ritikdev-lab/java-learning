package io.github.ritikdevlab.learning.Ch3.Arrays;
import java.util.Arrays;
public class RaggedDemo {
    public static void main(String[] args) {
        //This is Ragged array
        //This is Array Declaration + Allocation + fulll Manual Initialization
        int[][] matrix;
        matrix = new int[2][];
        //This matrix[0] and matrix[1] is rows
        matrix[0] = new int[2];
        matrix[1] = new int[4];
        //This are 2 elements in matrix[0] this are assigned here 
        matrix[0][0] = 12;
        matrix[0][1] = 3;
        //There are 4 elements Here so this is assigned here
        matrix[1][0] = 2;
        matrix[1][1] = 8;
        matrix[1][2] = 4;
        matrix[1][3] = 5;
        //This is used to print the multidimention arrays  
        IO.println(Arrays.deepToString(matrix));
    
        //This is Array Declaration + Allocation + Manual Initialization
        int[][] matrix1 = new int[3][];
        //This matrix1[0],matrix1[1] and matrix1[2] is rows and 'new int[]' is required here because the assignment happens after declaration.    
        matrix1[0] = new int[]{2,5};
        matrix1[1] = new int[]{3,6,9};
        matrix1[2] = new int[]{71,3,5,9};
        //This is used to print the multidimention arrays  
        IO.println(Arrays.deepToString(matrix1));
    
        //This is like aninomous array in Ragged array
        int[][] box1 = new int[][]{{2,3},{1,2,7},{21,43,71,3}};
        IO.println(Arrays.deepToString(box1));
    
        //This is the array which combine the Array declaration,allocation,and initialization
        int[][] box = {{31,21,45},{2,1,7,3},{1,5}};
        IO.println(Arrays.deepToString(box));
    
        //Here we use loop to declare the Ragged arrays
        int[][] kit = new int[3][];
        for(int a = 0;a < kit.length;a++) {
            kit[a] = new int[a + 2];
            for(int z = 0;z < kit[a].length;z++) {
                kit[a][z] = z+3;          
            }
        }
        IO.println(Arrays.deepToString(kit));
    
    }
}
