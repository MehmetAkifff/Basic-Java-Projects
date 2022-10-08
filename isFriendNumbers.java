import java.util.Scanner;

public class isFriendNumbers {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter two numbers");
        int number1 =scan.nextInt();
        int number2=scan.nextInt();
        int total1=0;
        int total2=0;
        for (int i=1;i<number1;i++){
            if (number1%i==0){
                total1=total1+i;
            }
        }
        for (int b=1;b<number2;b++){
            if (number2%b==0){
                total2=total2+b;
            }
        }
        if (total1==number2&&total2==number1){
            System.out.println("They are friend numbers ");
        }
        else
            System.out.println("They are not friend numbers");

    }
}
