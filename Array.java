public class Array {
    public static void main(String[] args) {
        int[] numbersArray = new int[4];
        numbersArray[0] = 2;
        numbersArray[1] = 3;
        numbersArray[2] = 4;
        numbersArray[3] = 5;
        for (int i = numbersArray.length-1; i >= 0; i--) {
            System.out.println(numbersArray[i]);
        }
    }
}
