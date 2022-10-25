import java.util.Scanner;

public class FahCelsius {
    public static void main(String[] args)
    {
        float temp ;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the temperature : ");
        temp = scan.nextFloat();
        temp = ((temp - 32)*5)/9;
        System.out.println("The Celsius temperature is : "+temp);
    }
}
