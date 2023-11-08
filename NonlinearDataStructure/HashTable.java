public class HashTable {
    int size;
    int[] hashTable;

    HashTable(int size) {
        this.size = size;
        this.hashTable = new int[size];
    }

    void insert(int element, int hashValue) {
        if (hashValue >= 0 && hashValue < size) {
            hashTable[hashValue] = element;
        } else {
            System.out.println("Error");
        }
    }

    void displayTable() {
        for (int i = 0; i < size; i++) {
            System.out.println("Index " + i + ": " + hashTable[i]);
        }
    }

    int get(int hashValue) {
        if (hashValue >= 0 && hashValue < size) {
            return hashTable[hashValue];
        } else {
            throw new IllegalArgumentException("Hash value is out of bounds");
        }
    }

    public static void main(String[] args) {
        HashTable hashTable = new HashTable(5);
        hashTable.insert(4, 0);
        hashTable.insert(5, 1);
        hashTable.insert(6, 2);
        hashTable.insert(7, 3);
        hashTable.insert(8, 4);
        hashTable.displayTable();

        System.out.println(hashTable.get(3));
        System.out.println(hashTable.get(4));
    }
}
