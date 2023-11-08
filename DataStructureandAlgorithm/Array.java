// package DataStructureandAlgorithm;

public class Array {
    int array[];

    Array(int size) {
        array = new int[size];
    }

    void insertionEnd(int element) {
        for (int i = 0; i < array.length; i++) {
            if(array[i] == 0){
                array[i] = element;
                break;
            }
        }
    }
    void traverseArray(){
        for(int i:array){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Array obj = new Array(6);
        obj.insertionEnd(4);
        obj.insertionEnd(3);
        obj.insertionEnd(3);
        obj.insertionEnd(1);
        obj.traverseArray();
        
        System.out.println(obj.array[0]);
        System.out.println();
    }
}
