import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;



public class CodeJava {
    public static void main(Integer[] arr) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();

       int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
            if(arr[i] > 10){
                newArray.add(arr[i]);
            }
        
        Collections.shuffle(numbers);
        System.out.println(sum);
        System.out.println(newArray);
                
        
    }
}
