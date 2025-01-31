import java.util.Scanner;

public class second_largest_arr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        int second_max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                second_max = max;
                max = arr[i];
            } else if (arr[i] > second_max && arr[i] != max) {
                second_max = arr[i];
            }
        }
        if (second_max == Integer.MIN_VALUE) {
            System.out.println("No second largest element found.");
        } else {
            System.out.println("The second largest element is: " + second_max);
        }
        sc.close();
    }
}
