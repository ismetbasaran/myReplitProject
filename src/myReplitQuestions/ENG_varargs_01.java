import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ENG_varargs_01 {
    static int toplam=0;
           /*
        Write a return method that accepts more than one integer
         as parameter and prints the sum of integers
         Method name = sum if you call method like that
         sum(1,2,3) output =6 sum(1,2,3,4,5) output =15 sum(1,2) output=3

         */

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num=1;
        while(num>0){
            System.out.println("lutfen bir sayi girin");
            num= scan.nextInt();
            topla(num);
        } System.out.println(toplam);
    }
    private static void topla( int...num) {
        for (int each:num
        ) {
            toplam+=each;
        }
    }
}