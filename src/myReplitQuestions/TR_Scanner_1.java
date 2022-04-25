import java.util.Scanner;

public class TR_Scanner_1 {
    /*
       Kullanıcıdan bir sayı alın ve sayının küpünün yarısını
       konsola yazdıran bir program yazın.

     */
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.print("Lutfen bir sayi giriniz : ");
        double sayi=scan.nextDouble();
        System.out.println("Girilen sayının küpünün yarısı : " +(sayi*sayi*sayi)/2);
    }
}
