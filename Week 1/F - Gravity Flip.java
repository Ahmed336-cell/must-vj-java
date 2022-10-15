import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      int n ;
      n = input.nextInt();
      int [] i = new int[n];
      for (int j = 0 ; j<n ; j++){
          i[j] = input.nextInt();

      }

        Arrays.sort(i);
      for (int  w = 0 ; w<n ;w++){
          System.out.println(i[w]+" ");
      }

    }

}
