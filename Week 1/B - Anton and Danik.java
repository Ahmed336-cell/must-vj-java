import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       int n , d=0,a=0;
       String i;
       Scanner input = new Scanner(System.in);

       n = input.nextInt();
       input.nextLine();
       i = input.next();

       for (int  j = 0 ; j<n ; j++){
           if (i.charAt(j) == 'A'){
               a++;
           }else{
               d++;
           }
       }

       if (a>d){
           System.out.println("Anton");
       }else if (a<d){
           System.out.println("Danik");
       }else{
           System.out.println("Friendship");
       }

    }

}
