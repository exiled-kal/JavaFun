
import java.util.*;

public class CodeExample{
    public void sumAndGreaterThan10(int[] arr){
        ArrayList<Integer> newArr = new ArrayList<Integer>();
        int sum = 0;
        //int[] arr = { 3, 5, 1, 2, 7, 9, 8, 13, 25, 32 };
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            
            if (arr[i] > 10) {
                newArr.add(arr[i]);
            }
        }
        System.out.println(sum);
        System.out.println(newArr);
    }
    public void shuffleStrings(String[] arr){
        ArrayList<String> newList = new ArrayList<String>();
        ArrayList<String> newList5 = new ArrayList<String>();
        for(int i = 0; i < arr.length; i++){
            if(arr[i].length() > 5){
                newList5.add(arr[i]);
            }
            newList.add(arr[i]);
        }
        Collections.shuffle(newList);
        System.out.println(newList);
        System.out.println(newList5);
    }
    public void shuffleAlphabet(){
        ArrayList<String> AlphaArr = new ArrayList<String>();
        char c;

        for(c = 'A'; c <= 'Z'; c++){
            AlphaArr.add(Character.toString(c));
            System.out.print(c);
        }
        Collections.shuffle(AlphaArr);
        System.out.println(AlphaArr);
        System.out.println("First letter of shuffled array: " + AlphaArr.get(0));
        System.out.println("Last letter of shuffled array: " + AlphaArr.get(25));
        String vowel = AlphaArr.get(0);

        if("AEIOU".indexOf(vowel) >= 0){
            System.out.println("OOPs! The first letter happens to be a vowel!");

            }   
    }
        //public void randNumber(){
          //  ArrayList<Integer> randNums = new ArrayList<Integer>();
            //for(int i = 0; i < 10; i++){
              //  int val =random.nextInt(55,101);
                //randNums.add();
            //}
            //System.out.println(randNums);

        //}
        public void randomString(){
            Random rand = new Random();
            StringBuilder randString = new StringBuilder();
            String alphaNumeric = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
            for(int i = 0; i < 5; i++){
                randString.append(alphaNumeric.charAt(rand.nextInt(alphaNumeric.length())));
            }
            String finalString = randString.toString();
            System.out.println(finalString);
        

        }
        public void randomStringOfStrings(){
            Random rand = new Random();
            StringBuilder randString = new StringBuilder();
            ArrayList<String> randList = new ArrayList<String>();
            String alphaNumeric = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
            for(int i = 0; i <10; i++){
                for(int j = 0; j < 5; j++){
                    randString.append(alphaNumeric.charAt(rand.nextInt(alphaNumeric.length())));
                }
                String finalString = randString.toString();
                randList.add(finalString);
            
            }
            System.out.println(randList);       
            }
    
}
