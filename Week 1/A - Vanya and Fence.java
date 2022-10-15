import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n, h, tall,w=0;

        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        h= input.nextInt();
        for (int i = 0 ; i < n ; i++){
            tall = input.nextInt();
            if (tall>h){
                w+=2;
            }else{
                w++;
            }
        }

        System.out.println(w);

    }

}
