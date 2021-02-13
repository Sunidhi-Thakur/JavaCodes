/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RecursionCodes;

import java.util.Scanner;

/**
 *
 * @author sunid
 */
public class ArrayMax {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        System.out.println("Enter the elements:");
        int A[] = new int[size];
        for (int i = 0; i < size; i++) {
            A[i] = sc.nextInt();
        }
        System.out.print("Enter element whose first and last occurence is to be found: ");
        int key = sc.nextInt();
        int fIndex = firstOccurence(A, 0, key);
        int lIndex = lastOccurence(A, size-1, key);
        int m = max(A,0);
        System.out.println("Element " +key+" occured first at index "+fIndex);
        System.out.println("Element " +key+" occured last at index "+lIndex);
        System.out.println("Maximum element = " +m);
    }

    private static int max(int[] A, int i) {
        if(i == A.length-1)
            return A[i];
        return Math.max(A[i], max(A,i+1));
    }

    private static int firstOccurence(int[] A,int i, int key) {
        if(i == A.length)
            return -1;
        if(A[i] == key)
            return i;
        else
            return firstOccurence(A,i+1,key);   
    }

    private static int lastOccurence(int[] A, int i, int key) {
        if(i == -1)
            return -1;
        if(A[i] == key)
            return i;
        else
            return lastOccurence(A,i-1,key);
    }
}
