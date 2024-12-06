import java.util.Scanner;
import java.lang.Math;

public class task112279 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), n = sc.nextInt();
        int[] arr = new int[n];
        int counter = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = (int) Math.round (Math.random() * (b - a)) + a;
            if (arr[i] % 2 == 0) {
                counter++;
            }
            System.out.print(arr[i] + " ");
        }
        System.out.println(counter + " " + (n - counter));
    }
}
