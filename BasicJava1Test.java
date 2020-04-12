public class BasicJava1Test {
    public static void main(String[] args) {
        BasicJava bJ = new BasicJava();

        bJ.p1To255();
        bJ.pOdd1To255();
        bJ.p0To255AndSum();
        bJ.itThroughArray(new int[]{1,3,5,7,9,13});
        bJ.maxValueInArray(new int[]{-3,-5,-7});
        bJ.getAverageOfArray(new int[]{2,10,3});
        bJ.arrayWithOddNums();
        bJ.greaterThanY(new int[]{1,3,5,7},3);
        bJ.squareTheValues(new int[]{1,5,10,-2});
        bJ.eliminateNegNums(new int[]{1,5,10,-2});
        bJ.minMaxAvg(new int[]{1,5,10,-2});
        bJ.shiftArray(new int[]{1,5,10,-2});
    }

}

