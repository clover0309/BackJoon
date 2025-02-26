import java.util.Arrays;

public class backjoon_2480 {
    public static void main(String[] args) {
        int dice1 = (int)(Math.random()*6+1);
        int dice2 = (int)(Math.random()*6+1);
        int dice3 = (int)(Math.random()*6+1);
        int prize = 0;

        if(dice1==dice2 && dice1==dice3){
            prize = 10000+dice1*1000;
            } else if (dice1==dice2 || dice1==dice3){
            prize = 1000+dice1*100;
        } else {
            int maxDice = Math.max(dice1, Math.max(dice2,dice3));
            prize = maxDice*100;
        }

        System.out.println(prize);
    }
}
