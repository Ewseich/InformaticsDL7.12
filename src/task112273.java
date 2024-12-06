import java.util.Scanner;
public class task112273 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(), k = 0;
        int n = sc.nextInt();
        x += n - 1;
        int[] mass = new int[n];
        for (int i = 0; i < n; i++) {
            mass[i] = x - k;
            k++;
            System.out.print(mass[i] + " ");
        }

    }
}
