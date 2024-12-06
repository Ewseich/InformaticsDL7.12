import java.util.Scanner;
public class task66 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), col = 0, last = Integer.MAX_VALUE;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] > last) {
                col++;
            }
            last = arr[i];
        }
        System.out.println(col);
    }
}