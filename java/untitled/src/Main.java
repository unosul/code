import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sc;
        sc = scanner.nextInt();
        int t = 0;
        int f = 1;
        int l = 0;
        for (int i = f ; i <= sc ; i ++){
            for (int y = t; y <= i ; y++) {
                l = l + i * y;
            }
        }
        System.out.println(l);
    }
}