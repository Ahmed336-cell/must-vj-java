import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n , counter =1 ;
        n = input.nextInt();
        int [] arr = new int[n];
        for (int i =0 ; i < n ; i++){
            arr[i] = input.nextInt();
        }

        for (int i = 1 ; i <n ; i++){
            if (arr[i-1]!= arr[i]){
                counter++;
            }
        }
        System.out.println(counter);

    }

}
