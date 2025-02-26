import java.util.Scanner;

public class backjoon_10871 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // N값으로 배열의 길이를 정함.
        int X = sc.nextInt(); // X는 비교하는 값으로 쓰임.

        int[] arr = new int[N]; // sc.nextInt로 받은 N의 값만큼 배열을 만듬.
        System.out.println(arr.length); //디버깅용 배열길이 체크

        for (int i = 0; i < arr.length; i++) { //반복문
            //정수 i는 0부터 시작, i는 arr의길이보다 작아야함, i는 후연산.
            arr[i] = sc.nextInt(); //여기에 배열이 들어갈 값들을 i칸수 만큼 입력가능.
        }

        for(int j=0; j< arr.length; j++){
            //반복문 정수 j는 0부터시작, j는 arr의 길이을 넘어서면 안되고, j는 후연산
            if(arr[j] < X){ //조건문, 만약 arr[j](위의 반복문에서 도는 j의 수)가 X보다 작으면
                System.out.print(arr[j] + " "); //출력해주고, 반복문으로 돌아가 J값이 +1되고 조건에 안맞을때 까지 반복.
            }
        }
    }
}
