import java.util.Scanner;

public class TR_Scanner_4 {
    /*
       Kullanıcıya günde ne kadar çay içtiğini ve ne kadar şeker kullandığını sorun.
       Yılda kaç kg şeker kullandığını hesaplayın ve yazdırın.
       1 şeker = 1.7 gr
        Örnek Çıktı:
        Yılda 12.41 kg şeker kullanıyor.

     */
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.print("Gunde kac bardak cay ictiginizi giriniz : ");
        double caySayisi=scan.nextDouble();
        System.out.print("Cayinizda kac seker kullandiginizi giriniz : ");
        double sekerSayisi=scan.nextDouble();
        System.out.println("Bir yildaki seker kullamininiz : " +(caySayisi*sekerSayisi*1.7*365/1000) +" kg");

    }
}
