import java.util.Scanner;

public class ENG_For_while_1 {
    /*
      Ask user to enter a name and a character,
      then check how many times the character
      is repeated in the name using loops in the name
      e.g:
      char ch1= 'a' ;
      String name =“John came late"
      Expected Output: Number of a = 2
     */
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.print("Bir kelime giriniz : ");
        String kelime=scan.nextLine();
        System.out.print("Bir karakter giriniz : ");
        String karakter=scan.next();
        if (karakter.length() != 1){
            System.out.println("Lutfen bir karakter giriniz");
        }
        else {
            char ch1 = karakter.charAt(0);
            int counter = 0;

            for (int i = 0; i < kelime.length(); i++) {
                if (kelime.charAt(i) == ch1) {
                    counter++;
                }
            }
            System.out.println("Girilen kelimede " + counter + " tane " + ch1 + " karakteri vardir");

        }
    }
}
