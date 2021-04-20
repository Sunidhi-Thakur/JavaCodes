package RecursionCodes;

import java.util.Scanner;

/**
 *
 * @author Sunidhi Thakur
 *
 * Gives maximum element in the array.
 *
 * First and last position of key element entered by the user.
 *
 * All indices where the key element is found.
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
        int lIndex = lastOccurence(A, size - 1, key);
        int[] aIndex = allOccurences(A, 0, key, 0);
        int m = max(A, 0);
        System.out.println("Element " + key + " occured first at index " + fIndex);
        System.out.println("Element " + key + " occured last at index " + lIndex);
        System.out.print("All indices of key element " + key + " = [");
        for (int i = 0; i < aIndex.length; i++) {
            System.out.print(aIndex[i]+" ");
        }
        System.out.println("]\nMaximum element = " + m);
    }

    private static int max(int[] A, int i) {
        if (i == A.length - 1) {
            return A[i];
        }
        return Math.max(A[i], max(A, i + 1));
    }

    private static int firstOccurence(int[] A, int i, int key) {
        if (i == A.length) {
            return -1;
        }
        if (A[i] == key) {
            return i;
        } else {
            return firstOccurence(A, i + 1, key);
        }
    }

    private static int lastOccurence(int[] A, int i, int key) {
        if (i == -1) {
            return -1;
        }
        if (A[i] == key) {
            return i;
        } else {
            return lastOccurence(A, i - 1, key);
        }
    }

    private static int[] allOccurences(int[] A, int i, int key, int f) {
        if (i == A.length) {
            return new int[f];
        }
        if (A[i] == key) {
            int[] arr = allOccurences(A, i + 1, key, f + 1);
            arr[f] = i;
            return arr;
        } else {
            int[] arr = allOccurences(A, i + 1, key, f);
            return arr;
        }

    }
}
