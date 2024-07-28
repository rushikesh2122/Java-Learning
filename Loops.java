// public class Loops {
//     public static void main (String[] args){
        // for (int count =0;count<=10;count++){
        //     System.out.print(count+" ");
        // }
        // int i=0;
        // while (i<=10){
        //     System.out.println(i);
        //     i++;
        // }
        // int i = 0;
        // do {
        //     System.out.println(i);
        //     i++;
        // }while(i<=10);
        
//     }
// }
import java.util.*;

public class Loops{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int sum = 0;
        // for (int i = 1; i<=n; i++){
        //     sum = sum + i;
        // }
        // System.out.println(sum);
        int x =1 ;
        for (int i=1;i<=10;i++){
            x = n*i;
        System.out.println(n+"*"+i+"="+ x);
        }

    }
}
