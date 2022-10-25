import java.util.Scanner;

public class FibRec {

    static int num1 =0 ;
    static int num2 =1;
    static int num3 =0;

    public  static  void  main(String[] args)
    {
        System.out.println("Enter the count : ");
        Scanner scan = new Scanner(System.in);
        int count = scan.nextInt();

        System.out.println(num1+ " " +num2);
        printfibo(count -2);
    }

    private static void printfibo(int count) {


        if(count>0){
            num3 = num1 +num2;
            System.out.print(" "+num3);
            num1 = num2;
            num2 = num3;

            printfibo(count -1);
        }
    }
}
