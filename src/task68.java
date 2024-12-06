import java.util.Scanner;
public class task68 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n < 3) {
            System.out.println(0);
            System.exit(0);
        }
        int col = 0, last = sc.nextInt(), middle = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < (n - 2); i++) {
            arr[i] = sc.nextInt();
            if (arr[i]< middle && middle > last) {
                col++;
            }
            last = middle;
            middle = arr[i];
        }
        System.out.println(col);

    }
}
