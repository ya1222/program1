package program1;

public class Program1 {
    public static void main(String[] args) {
        // First loop
        for (int i = 0; i < 10; i++) {
            System.out.println("First loop iteration: " + i);
        }

        // Second loop
        int j = 0;
        while (j < 5) {
            System.out.println("Second loop iteration: " + j);
            j++;
        }

        // Third loop
        int k = 0;
        do {
            System.out.println("Third loop iteration: " + k);
            k++;
        } while (k < 3);
    }
}