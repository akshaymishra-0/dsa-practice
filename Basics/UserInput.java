import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        System.out.print("Please Enter Your Name: ");
        Scanner input = new Scanner(System.in);
        String msg = "Nice "+input.nextLine() +"!, you are learning Java Quite first";
        System.out.println(msg);
    }
}
