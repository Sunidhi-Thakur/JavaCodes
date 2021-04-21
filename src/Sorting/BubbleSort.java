package Sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Sunidhi Thakur
 */
public class BubbleSort {
    public static void main(String args[]) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader (System.in));
        System.out.print("Enter the length of array: ");
        int N = Integer.parseInt(br.readLine());
        System.out.println("\nEnter the elements");
        int[] A = new int[N];
        for(int i=0; i<N; i++)
            A[i] = Integer.parseInt(br.readLine());
        System.out.print("The Sorted Array is: [");
        bubbleSort(A, N);
        for(int i=0; i<N; i++){
            if(i<N-1)
                System.out.print(A[i]+", ");
            else
                System.out.print(A[i]+"]\n\n");
        }
    }

    private static void bubbleSort(int[] A, int N) {
        int temp;
        for(int i=0; i<N; i++){
            for(int j=0; j<N-i-1; j++){
                if(A[j] > A[j+1]){
                    temp = A[j];
                    A[j] = A[j+1];
                    A[j+1] = temp;
                }
            }
        }
    }
}

/**
 * output:
 * 
 * Enter the length of array: 5
 * 
 * 
 * Enter the elements
 * 
 * 9
 * 
 * 3
 * 
 * 0
 * 
 * -1
 * 
 * 6
 * 
 * The Sorted Array is: [-1, 0, 3, 6, 9]
 * 
 */