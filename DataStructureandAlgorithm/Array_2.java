import java.util.Scanner;

public class Array_2 {
    int[] arr;
    int size;

    Array_2(int size) {
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

    void search(int value) {
        if (isFound(value)) {
            System.out.println(value + " found in the array!");
        } else {
            System.out.println("The number doesn't exist!!!");
        }
    }

    void insertAtEnd(int element) {
        if (size >= arr.length) {
            int newArr[] = new int[arr.length + 1];
            for (int i = 0; i < arr.length; i++) {
                newArr[i] = arr[i];
            }
            arr = newArr;
        }
        arr[size] = element;
        size++;
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
    }

    void deleteFromBeginning(int value) {
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
            } else {
                System.out.println("Value not found in the array.");
            }
        } else {
            System.out.println("Array is empty.");
        }
    }

    void deleteFromEnd(int value) {
        if (!isEmpty()) {
            int index = -1;
            for (int i = size - 1; i >= 0; i--) {
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
            } else {
                System.out.println("Value not found in the array.");
            }
        } else {
            System.out.println("Array is empty.");
        }
    }

    void traverse_array() {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Array_2 obj = new Array_2(6);
        obj.insertAtEnd(4);
        obj.insertAtEnd(3);
        obj.insertAtEnd(2);
        obj.insertAtEnd(7);
        obj.insertAtEnd(8);
        obj.insertAtEnd(9);

        obj.insertAtEnd(23);
        obj.insertAtEnd(15);

        obj.insertAtBeginning(2);

        System.out.println(obj.size);

        System.out.print("Enter the element you want to search for: ");
        int N = scan.nextInt();

        obj.search(N);

        System.out.print("Enter the element you want to delete from beginning: ");
        int X = scan.nextInt();

        obj.deleteFromBeginning(X);

        System.out.print("Enter the element you want to delete from end: ");
        int Y = scan.nextInt();

        obj.deleteFromEnd(Y);

        obj.traverse_array();

        scan.close(); 
    }
}
