import java.util.Scanner;
public class m_1_a_2 {
    public static void main(String[] args) {
        int x, y, sum, sub, mult; 
        double div;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first integer value: ");
        x = input.nextInt();
        System.out.println("Enter the secont integer value: ");
        y = input.nextInt();
        sum = x + y;
        sub = x - y;
        mult = x * y;
        div = (double) x / y;
        System.out.println(x + " + " + y + " = " + sum );
        System.out.println(x + " - " + y + " = " + sub );
        System.out.println(x + " * " + y + " = " + mult );
        System.out.println(x + " / " + y + " = " + div );
    }
}