import java.util.Scanner;
public class task67 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), col = 0, last = 0;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] * last > 0) {
                col++;
            }
            last = arr[i];
        }
        if (col > 0) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}