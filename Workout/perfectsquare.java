import java.util.Scanner;

public class perfectsquare {
    public static void main(String[] args)  {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the starting and ending numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Perfect Numbers between "+a+ " and "+b);
        for (int i = a; i <= b; i++) {

            int number = i;

            int sqrt = (int) Math.sqrt(number);
            if (sqrt * sqrt == number) {
                System.out.println(number);
            }
        }
    }
}
