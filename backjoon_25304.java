import java.util.Scanner;

public class backjoon_25304 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int p = sc.nextInt();
        int n = sc.nextInt();

        int sum = 0;

        for(int i = 0; i < n; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            sum += sum+(a*b);
        }
        if(sum == p)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}

