import java.util.Scanner;
public class task112275 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = n;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = (int) Math.pow(2, k);
            k--;
            System.out.print(arr[i] + " ");
        }

    }
}
