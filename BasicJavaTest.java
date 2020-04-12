public class BasicJavaTest {
    
        public static void main(String[] args) {
            BasicJava testNumber = new BasicJava();
        
            testNumber.print1To255();
        
            testNumber.printOdd1To255();

            testNumber.printSum();
        
            int[] testArr = {-9,-7,-5,-3,-1,0,1,3,5,7,9};
            testNumber.iterateArray(testArr);
        
            int[] testArr1 = {-9,-7,-5,-3,-1,0,1,3,5,7,9};
            testNumber.findMax(testArr);
        
            int[] testArr2 = {-9,-7,-5,-3,-1,0,1,3,5,7,9};
            testNumber.getAverage(testArr);
        
            testNumber.arrayOddNumbers();
        
            int[] testArr3 = {-9,-7,-5,-3,-1,0,1,3,5,7,9};
            testNumber.greaterThanY(testArr, 3);
        
            int[] testArr4 = {-9,-7,-5,-3,-1,0,1,3,5,7,9};
            testNumber.squareTheValues(testArr);
        
            int[] testArr5 = {-9,-7,-5,-3,-1,0,1,3,5,7,9};
            testNumber.eliminateNegativeNumbers(testArr);
        
            int[] testArr6 = {-9,-7,-5,-3,-1,0,1,3,5,7,9};
            testNumber.maxMinAvg(testArr);
        
            int[] testArr7 = {-9,-7,-5,-3,-1,0,1,3,5,7,9};
            testNumber.shiftingValues(testArr);
            }
        
    }



