public class findingNumber {

    public static void main(String[] args) {
        int[] numbers = new int[]{1, 2, 5, 7, 9, 0};
        int chosenNumber = 3;
        int final1 = 0;
        for (int i = 0; i < numbers.length; i++) {
            final1 = chosenNumber - numbers[i];
            if (final1==0){
                break;
            }
        }
            if (final1 != 0) {
                System.out.println(chosenNumber + " : not included");
            } else
                System.out.println(chosenNumber + " :  included ");


    }
}

