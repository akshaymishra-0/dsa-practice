import java.util.Scanner;

public class VerticalLine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = input.nextInt();
        for (int i = 1; i <= rows; i++) {
            System.out.println("* ");
        }
        input.close();
    }
}
