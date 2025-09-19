import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] n = new int[10];
        for (int i =0; i<10;i++){
            n[i] = in.nextInt();
            if (n[i] <= 0){n[i] = 1;}
        }
        for (int v = 0; v < 10; v++){
            System.out.println("X[" + v + "] = "+ n[v]);
        }


    }
}
