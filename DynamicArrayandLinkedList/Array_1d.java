package DynamicArrayandLinkedList;

import java.util.Scanner;

public class Array_1d {
    int[] arr;
    int size;

    Array_1d(int size) {
        this.size = 0;
        arr = new int[size];
    }

    boolean isEmpty() {
        return size == 0;
    }

    boolean isFound(int value) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == value) {
                return true;
            }
        }
        return false;
    }

    void find(int value) {
        if (isFound(value)) {
            System.out.println(value + " " + "Element Found");
        } else {
            System.out.println("Not found");
        }
    }

    void insertElementAtEnd(int element) {
        if (size >= arr.length) {
            int newArr[] = new int[arr.length + 1];
            for (int i = 1; i < arr.length; i++) {
                newArr[i] = arr[i];
            }
            arr = newArr;
        }
        arr[size] = element;
        size++;
        System.out.println("Updated Array:");
        traverse_array();
    }

    void insertAtBeginning(int element) {
        if (size >= arr.length) {
            int newArr[] = new int[arr.length + 1];
            for (int i = 0; i < arr.length; i++) {
                newArr[i + 1] = arr[i];
            }
            arr = newArr;
        } else {
            for (int i = size; i >= 1; i--) {
                arr[i] = arr[i - 1];
            }
        }
        arr[0] = element;
        size++;
        System.out.println("Updated Array:");
        traverse_array();
    }

    void deleteElement(int value) {
        if (!isEmpty()) {
            int index = -1;

            for (int i = 0; i < size; i++) {
                if (arr[i] == value) {
                    index = i;
                    break;
                }
            }

            if (index != -1) {
                for (int i = index; i < size - 1; i++) {
                    arr[i] = arr[i + 1];
                }
                size--;

                // Print the updated array after deletion
                System.out.println("Array after deletion: ");
                traverse_array();
            } else {
                System.out.println("Not found");
            }
        } else {
            System.out.println("Array is empty");
        }
    }

    void traverse_array() {
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] myArray = { 1, 2, 3, 4, 5, 6 };
        Array_1d obj = new Array_1d(myArray.length);
        for (int i = 0; i < myArray.length; i++) {
            obj.arr[i] = myArray[i];
            obj.size++;
        }
        System.out.println("Original Array:");
        obj.traverse_array();

        // Find Element
        Scanner input = new Scanner(System.in);
        System.out.print("Element to Find:");
        int valueFind = input.nextInt();
        obj.find(valueFind);

        // Delete Element
        Scanner inputDelete = new Scanner(System.in);
        System.out.print("Element to Delete:");
        int deleteValue = inputDelete.nextInt();
        obj.deleteElement(deleteValue);

        // Insert Element
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Element to Insert at Beginning: ");
        int elementToInsert = inputScanner.nextInt();
        obj.insertAtBeginning(elementToInsert);

        Scanner endInput = new Scanner(System.in);

        System.out.print("Element to Insert at End: ");
        int elementToInsertEnd = endInput.nextInt();
        obj.insertElementAtEnd(elementToInsertEnd);

        inputDelete.close();
        input.close();
        inputScanner.close();
        endInput.close();

    }

}
