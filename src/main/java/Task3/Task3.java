package Task3;

import java.util.Scanner;
public class Task3 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        int length = x2 - x1;
        int width = y1 - y2;

        int s = length * width;
        int p = 2 * (length + width);

        System.out.println("s = " + s);
        System.out.println("p = " + p);
    }
}