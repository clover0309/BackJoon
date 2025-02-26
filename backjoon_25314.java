import java.util.Scanner;

public class backjoon_25314 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = n / 4;

        for (int i = 0; i < result; i++) {
            System.out.println("long");
        }
        System.out.println("int");
    }
}
