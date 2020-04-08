

public class CodeExampleTest {

    public static void main(String[] args){
        CodeExample runData = new CodeExample();
        
        int[] testArr = {3,5,1,2,7,9,8,13,25,32};
        runData.sumAndGreaterThan10(testArr);
    
        String[] testList = {"Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa"};

        runData.shuffleStrings(testList);
    
        runData.shuffleAlphabet();
        
        // runData.randNumber();

        //runData.randNumber2();

        runData.randomString();

        runData.randomStringOfStrings();
    
    }
}