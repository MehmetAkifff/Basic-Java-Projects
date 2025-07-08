public class findingNumber {
    //That program is useful to find a number in an array

    public static void main(String[] args) {
        int[] numbers = new int[]{1, 2, 5, 7, 9, 0};
        int chosenNumber = 3;
        boolean found = false;
        
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == chosenNumber) {
                found = true;
                break;
            }
        }
        
        if (!found) {
            System.out.println(chosenNumber + " : not included");
        } else {
            System.out.println(chosenNumber + " : included");
        }
    }
}

