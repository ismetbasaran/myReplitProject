import java.util.Scanner;

public class TR_For_while_4 {
    public static void main(String[] args) {
        /*
        Girdi olarak bir tamsayı kabul eden ve faktöriyel hesaplayan programi yazıniz.
        Input : 6
        Output: 6!=6*5*4*3*2*1=720
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen bir tamsayi giriniz : ");
        int sayi = scan.nextInt();
        int faktoriyel = 1;
        String acikFaktoriyel = "";

        for (int i = sayi; i >= 1; i--) {
            faktoriyel *= i;
            if (i == sayi) {
                acikFaktoriyel = acikFaktoriyel + i;
            } else {
                acikFaktoriyel = acikFaktoriyel + "*" + i;
            }
        }
        System.out.println(sayi + "!=" + acikFaktoriyel + "=" + faktoriyel);
    }
}







