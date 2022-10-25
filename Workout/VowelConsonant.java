import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the character: ");
        char ch = scan.nextLine().charAt(0);
        switch (ch){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("It is vowel");
                break;
            default:
                System.out.println("Not a Vowel");
        }


    }
}
