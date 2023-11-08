package DynamicArrayandLinkedList;

import java.util.Scanner;

public class Array_2d {
    int[][] arr;
    int numRows;
    int numCols;

    Array_2d(int numRows, int numCols) {
        this.numRows = numRows;
        this.numCols = numCols;
        arr = new int[numRows][numCols];
    }

    boolean isEmpty() {
        return numRows == 0 || numCols == 0;
    }

    boolean isFound(int value) {
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                if (arr[i][j] == value) {
                    return true;
                }
            }
        }
        return false;
    }

    void find(int value) {
        if (isFound(value)) {
            System.out.println(value + " Element Found");
        } else {
            System.out.println("Not found");
        }
    }

    void insertElementAtEnd(int element) {
        if (numRows * numCols >= arr.length) {
            int newNumRows = numRows;
            int newNumCols = numCols;

            if (numCols >= arr[0].length) {
                newNumCols = numCols + 1;
            } else {
                newNumRows = numRows + 1;
            }

            int[][] newArr = new int[newNumRows][newNumCols];
            for (int i = 0; i < numRows; i++) {
                for (int j = 0; j < numCols; j++) {
                    newArr[i][j] = arr[i][j];
                }
            }
            arr = newArr;
        }

        arr[numRows - 1][numCols - 1] = element;
        System.out.println("Updated 2D Array:");
        traverseArray();
    }

    void traverseArray() {
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    void deleteElement(int value) {
        boolean found = false;
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                if (arr[i][j] == value) {
                    arr[i][j] = 0;
                    found = true;
                    System.out.println("Element " + value + " deleted.");
                }
            }
        }

        if (!found) {
            System.out.println("Element not found.");
        }
        System.out.println("Updated 2D Array:");
        traverseArray();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = input.nextInt();

        System.out.print("Enter the number of columns: ");
        int columns = input.nextInt();

        Array_2d obj = new Array_2d(rows, columns);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Enter element at position (" + i + ", " + j + "): ");
                obj.arr[i][j] = input.nextInt();
            }
        }

        System.out.println("Original 2D Array:");
        obj.traverseArray();

        // Find Element
        System.out.print("Element to Find: ");
        int valueFind = input.nextInt();
        obj.find(valueFind);

        // Insert Element
        System.out.print("Element to Insert at End: ");
        int elementToInsert = input.nextInt();
        obj.insertElementAtEnd(elementToInsert);

        // Delete Element
        System.out.print("Element to Delete: ");
        int elementToDelete = input.nextInt();
        obj.deleteElement(elementToDelete);

        input.close();
    }
}
