import java.util.Scanner;

public class backjoon_9086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //이것을 몇번 이행할 것인가에 대한 스캔값.
        int a = sc.nextInt();

        //안에 String형으로 자료를 저장해주는 배열.
        String name[] = new String[a];

        //a만큼 반복하고 i값이 후연산으로 올라가서 반복해줌.
        for(int i=0; i<a; i++){
            //str은 배열에 저장할 값들이 각각 들어옴.
            String str = sc.next();
            //각 배열마다, 첫번째 글자와 마지막 글자를 추출해옴.
            name[i] = str.substring(0,1)+str.substring(str.length()-1,str.length());
        }
        //i를 a보다 크기전까지 반복하여 name배열안에 있는 값들을 출력해줌.
        for(int i=0; i<a; i++){
            System.out.println(name[i]);
        }

    }
}
