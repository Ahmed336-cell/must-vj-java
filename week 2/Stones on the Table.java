import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
     int n, c=0 ;
     String m;
     n = input.nextInt();
     m = input.next();
     char k= m.charAt(0);
     for (int i=1 ; i <n ;i++){
         if(m.charAt(i) == k){
             c++;
         }else {
             k = m.charAt(i);
         }
     }
        System.out.println(c);
    }

}
