import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class S22 {
    public static void main(String[] args) {

        String str = "Javaisalsoeasy";
        str = str.toLowerCase();


        List<String> karakterleri = new ArrayList<String>();
        String strArr[] = str.split("");

        Arrays.sort(strArr);
        System.out.println(Arrays.toString(strArr)); // [a, a, a, a, e, i, j, l, o, s, s, s, v, y]

        for (int i = 0; i < strArr.length; i++) {
            for (int j = i+1; i < strArr.length; j++){
                if (strArr[i].equals(strArr[j])){
                    karakterleri.add(strArr[i]);

                }
            }

        }
        System.out.println(karakterleri);
    }
}
