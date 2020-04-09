
import java.util.*;

public class CodeExample{
    //  Create an array with the following values: 3,5,1,2,7,9,8,13,25,32.
    //  Print the sum of all numbers in the array. 
    //  Also have the function return an array that only includes numbers that are greater than 10 
    //  (e.g. when you pass the array above, it should return an array with the values of 13,25,32)
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
    // Create an array with the following values: Nancy, Jinichi, 
    // Fujibayashi, Momochi, Ishikawa. 
    // Shuffle the array and print the name of each person. 
    // Have the method also return an array with names that are longer than 5 characters.
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
    // Create an array that contains all 26 letters of the alphabet (this array must have 26 values). 
    // Shuffle the array and, after shuffling, display the last letter from the array.
    //  Have it also display the first letter of the array. 
    //  If the first letter in the array is a vowel, have it display a message.
    public void shuffleAlphabet(){
        ArrayList<String> AlphaArr = new ArrayList<String>();
        char c;

        for(c = 'A'; c <= 'Z'; c++){
            AlphaArr.add(Character.toString(c));
            System.out.print(c);
        }
        Collections.shuffle(AlphaArr);
        System.out.println(AlphaArr);
        System.out.println("Everyday is Shuffling: " + AlphaArr.get(0));
        System.out.println("Everyday is Shuffling: " + AlphaArr.get(17));
        String vowel = AlphaArr.get(0);

        if("AEIOU".indexOf(vowel) >= 0){
            System.out.println("OOPs! The first letter happens to be a vowel!");

            }   
    }
    // Generate and return an array with 10 random numbers between 55-100.
        public void randNumber(){
            Random r = new Random();
           ArrayList<Integer> randNums = new ArrayList<Integer>();
            for(int i = 0; i < arr.length; i++){
                for(int j = 0; j < arr[i].length; j++){
                
        //     }
            System.out.println(randNums);

        }
        

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                arr[i][j] = r.nextInt(55,100);

        // Create a random string that is 5 characters long.
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


        // Generate an array with 10 random strings that are each 5 characters long
        public void randomStringOfStrings(){
            Random rand = new Random();
            StringBuilder randString = new StringBuilder();
            ArrayList<String> randList = new ArrayList<String>();
            String alphaNumeric = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
            for(int i = 0; i < 10; i++){
                for(int j = 0; j < 5; j++){
                    randString.append(alphaNumeric.charAt(rand.nextInt(alphaNumeric.length())));
                }
                String finalString = randString.toString();
                randList.add(finalString);
            
            }
            System.out.println(randList);       
            }
    
}
