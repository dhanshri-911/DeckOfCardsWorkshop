import java.util.Scanner;

public class Players {
    int p;

    public void getPlayers() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Players betn 2 and 4");
        p = sc.nextInt();
        if (p <=4 || p <= 2) {
            getPlayers();
        } else{
            sequenceOfPlayers();
        }
    }
    public void sequenceOfPlayers(){
        System.out.println("Sequence of players");
        for(int i =0;i<p;i++){
            System.out.println("Sequence is " +(i+i) +"\n");
        }
    }
}