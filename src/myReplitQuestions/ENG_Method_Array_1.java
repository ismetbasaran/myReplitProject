import java.util.Arrays;

public class ENG_Method_Array_1 {
    /*
    Write a return method to reverse number.
    Input : 12345
    Output : 54321

     */
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};

        terseCevir(arr);


    }

    private static void terseCevir(int[] arr) {
        for(int i=arr.length-1; i>=0; i--){
            System.out.print(arr[i]);
        }

    }


}
