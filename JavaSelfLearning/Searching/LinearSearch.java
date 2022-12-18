package JavaSelfLearning.Searching;

public class LinearSearch {
    public int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return 1;
            }
        }
        return -1;
    }

    public int binarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length-1;
        int mid = (low + high) / 2;
        System.out.println("mid : " + mid);
        while (arr[mid] != key) {
            if (key < arr[mid]) {
                high = mid - 1;
                System.out.println("high " + high);
            } else {
                low = mid + 1;
                System.out.println("low " + low );
            }
            mid = (low + high) / 2;
            System.out.println("mid : " + mid);
        }
        return mid;
    }
    public int binarySearch_2(int[] arr, int key) {
        int low = 0;
        int high = arr.length-1;
        int mid = (low + high) / 2;
        System.out.println("mid : " + mid);
        while (arr[mid] != key) {
            if (key < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
            mid = (low + high) / 2;
            System.out.println("mid : " + mid);
        }
        return mid;
    }
}
