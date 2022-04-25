import java.util.Scanner;

public class TR_For_while_2 {
        public static void main(String[] args) {
        /*
        Kullanıcıdan 2 tamsayı girmesini ve ardından GCD (En Büyük Ortak Bölen)
        ve LCM'yi (En Küçük Ortak Kat) bulmasını isteyin.
        Input :
        30
        40
        Beklenen Cikti: 30 ve 40 icin GCD = 10
        Beklenen Cikti: 30 ve 40 icin LCM = 120
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen bir tamsayi giriniz : ");
        int sayi1 = scan.nextInt();
        System.out.print("Lutfen ikinci bir tamsayi giriniz : ");
        int sayi2 = scan.nextInt();
        int ebob = 0;
        int okek = 0;


        for (int i = 1; i < sayi1; i++) {
            if (sayi1 % i == 0 && sayi2 % i == 0) {
                ebob = i;
            }
                    }
        System.out.println("Girilen sayilar olan " + sayi1 + " ve " + sayi2 + " icin GCD = " + ebob);
            for (int i=sayi1*sayi2; i>=1; i--) {

                if (i%sayi1 == 0 && i%sayi2 == 0){
                    okek=i;
                                    }
            }

            System.out.println("Girilen sayilar olan " +sayi1+ " ve " +sayi2+ " icin LCM = " +okek);
        }
    }


