import java.util.Scanner;
public class task112271 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(), k = 0;
        int d = sc.nextInt();
        int n = sc.nextInt();
        x = x - d;
        int[] mass = new int[n];
        for (int i = 0; i < n; i++) {
            mass[i] = x + d;
            x = mass[i];
            k++;
            System.out.print(mass[i] + " ");
        }

    }

}
