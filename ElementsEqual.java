package Com.cg;

public class ElementsEqual {

    public static void main(String[] args) {

        int[] arr = {2, 4, 5, 67, 8};
        int n = arr.length;

        // Remove factors of 2 and 3
        for (int i = 0; i < n; i++) {
            while (arr[i] % 2 == 0) {
                arr[i] /= 2;
            }
            while (arr[i] % 3 == 0) {
                arr[i] /= 3;
            }
        }

        // Check if all elements are equal
        boolean equal = true;

        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[0]) {
                equal = false;
                break;
            }
        }

        if (equal) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
    }
}
