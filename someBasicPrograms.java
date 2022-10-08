import java.util.Scanner;

public class Exercise01_20210808045 {

    public static void main(String[] args) {
        System.out.println("a  a^2  a^3");
        for (int i = 1; i < 5; i++) {
            System.out.print(i);
            System.out.print("  " + i * i);
            System.out.println("    " + i * i * i);
        }
        System.out.println("----First task over----");
        System.out.println((9.5 * 4.5 - 2.5 * 3) / (45.5 - 3.5));
        System.out.println("----Second task over----");
        double piSayisi = 4.0 * (1.0 - (1.0 / 3.0) + (1.0 / 5.0) - (1.0 / 7.0) + (1.0 / 9.0) - (1.0 / 11.0));
        double piSayisi2 = 4.0 * (1.0 - (1.0 / 3.0) + (1.0 / 5.0) - (1.0 / 7.0) + (1.0 / 9.0) - (1.0 / 11.0) + (1.0 / 13.0));
        System.out.println(piSayisi);
        System.out.println(piSayisi2);
        System.out.println("----Third task over---- ");
        double radius = 5.5;
        System.out.println("Area of the circle = " + piSayisi2 * radius * radius);
        System.out.println("----Fourth task over----");


        double a = 3.4;
        double b = 50.2;
        double c = 2.1;
        double d = 0.55;
        double e = 44.5;
        double f = 5.9;
        double x = ((e * d) - (b * f)) / ((a * d) - (b * c));
        double y = ((a * f) - (e * c)) / ((a * d) - (b * c));
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        double eSonuc = (a * x) + (b * y);
        System.out.println("e = " + eSonuc);
        double fSonuc = (c * x) + (d * y);
        System.out.println("f = " + Math.nextUp(fSonuc));
        System.out.println("----Fifth task over----");


        Scanner scanner1 = new Scanner(System.in);
        System.out.println("please type celcius");
        double celcius = scanner1.nextDouble();
        double Fahrenheit = ((9.0 / 5.0) * celcius) + 32.0;
        System.out.println("Fahrenheit = " + Fahrenheit);
        System.out.println("----Sixth Task over----");


        System.out.println("please type radius of the circle");
        double radiusCy=scanner1.nextDouble();
        System.out.println("please type length of the circle");
        double lengthCy=scanner1.nextDouble();
        double areaCy = radiusCy * radiusCy * Math.PI;
        double volume = areaCy * lengthCy ;
        System.out.println("Volume of th3e Cylinder = " + volume);
        System.out.println("----Seventh task over----");

        System.out.println("type a number between 1-1000");
        int number1=scanner1.nextInt();
        int number2 = number1 / 10;
        int number3 = number2 / 10;
        int digit1, digit2, digit3;
        digit1 = number1 % 10;
        digit2 = number2 % 10;
        digit3 = number3 % 10;
        System.out.print("Sum of all digits of your number is = ");
        System.out.println(digit1 + digit2 + digit3);
        System.out.println("----Eighth task over----");

        System.out.println("Type a number of minutes as an integer");
        double minute=scanner1.nextDouble();
        double years, days;
        days = minute/ 60.0 / 24;
        years = days / 360.0;
        System.out.println(days + " Days");
        System.out.println(years + " Years");
        System.out.println("----Ninth Task over----");

        double annualRate = (1 + (0.05 / 12));
        System.out.println("Type your monthly saving amount");
        double amount = scanner1.nextDouble();
        double total = amount * annualRate;
        for (int h = 0; h < 5; h++) {
            total = (amount + total) * annualRate;
        }
        System.out.println(total);
        System.out.println("---tenth task over");


        System.out.println("Please type your height and weight");
        double pound = scanner1.nextDouble();
        double inches = scanner1.nextDouble();
        double kg = 0.45359237 * pound;
        double mt = 0.0254 * inches;
        double BMI = kg / (mt * mt);
        System.out.println("Your BMI is = " + BMI);
        System.out.println("----eleventh task over");

        System.out.println("Please type your points like x1 y1 x2 y2");
        double x1 = scanner1.nextDouble();
        double y1 = scanner1.nextDouble();
        double x2 = scanner1.nextDouble();
        double y2 = scanner1.nextDouble();
        double e1 = Math.pow((x1 - x2), 2);
        double e2 = Math.pow((y1 - y2), 2);
        System.out.println("Distance between x1,y1 and x2,y2 is = " + Math.pow((e1 + e2), 0.5));
        System.out.println("----12th task over----");

        System.out.println("please type three points in this forma x1 y1 x2 y2 x3 y3");
        double x3, x4, x5, y3, y4, y5, side1, side2, side3, s, area;
        x3 = scanner1.nextDouble();
        y3 = scanner1.nextDouble();
        x4 = scanner1.nextDouble();
        y4 = scanner1.nextDouble();
        x5 = scanner1.nextDouble();
        y5 = scanner1.nextDouble();
        side1 = Math.pow(Math.pow((x3 - x4), 2) + Math.pow((y3 - y4), 2), 0.5);
        side2 = Math.pow(Math.pow((x3 - x5), 2) + Math.pow((y3 - y5), 2), 0.5);
        side3 = Math.pow(Math.pow((x4 - x5), 2) + Math.pow((y4 - y5), 2), 0.5);
        s = (side1 + side2 + side3) / 2;
        area = Math.pow((s * (s - side1) * (s - side2) * (s - side3)), 0.5);
        System.out.println("area of your triangle is = " + area);
        System.out.println("last task is over");


    }
}






