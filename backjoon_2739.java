import java.util.Scanner;

public class backjoon_2739 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 0;
        for(int i = 1; i<=9; i++){
            result = n*i;
            System.out.println(n+" * "+i+" = "+result);
        }
    }
}
