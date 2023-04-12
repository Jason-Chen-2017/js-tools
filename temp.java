import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int d = Math.abs(a * a - b * b);
        int f = Math.abs(a * a + b * b);

        int r = (int) Math.sqrt(d);
        int s = (int) Math.sqrt(f);

        if (r * r == d) {
            System.out.println(r);
        } else if (s * s == f) {
            System.out.println(s);
        } else {
            System.out.println(-1);
        }
    }
}