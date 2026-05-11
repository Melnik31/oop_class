import java.util.Scanner;
public class m_3_a_1 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int x = 0, y = 0, choice;

       // Display menu
       do {
            System.out.println("\n--- Menu: ---");
            System.out.println("1 - Enter two numbers (x and y)");
            System.out.println("2 - Print all nymbers between x to y");
            System.out.println("3 - Find the avarage of all numbers between x and y");
            System.out.println("4 - Fund all prime numbers between x and y");
            System.out.println("5 - Exit");
            System.out.print("Select an option: ");
            choice = input.nextInt();

// Determine min and max to ensure the loops work even if x > y
            int start = Math.min(x, y);
            int end = Math.max(x, y);

            // handle menu options
            switch (choice) {
                case 1:
                    System.out.print("Enter X: ");
                    x = input.nextInt();
                    System.out.print("Enter Y: ");
                    y = input.nextInt();
                    break;

                case 2:
                    System.out.println("Numbers between " + x + " and " + y + ":");
                    for (int i = start; i <= end; i++) {
                        System.out.print(i + " ");
                    }
                    System.out.println();
                    break;

                case 3:
                    int sum = 0, count = 0;
                    for (int i = start; i <= end; i++) {
                        sum += i;
                        count++;
                    }
                    // Handle division by zero just in case
                    double avg = (count > 0) ? (double) sum / count : 0;
                    System.out.println("Average: " + avg);
                    break;

                case 4:
                    System.out.println("Prime numbers between " + x + " and " + y + ":");
                    for (int i = start; i <= end; i++) {
                        if (isPrime(i)) {
                            System.out.print(i + " ");
                        }
                    }
                    System.out.println();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        } while (choice != 5);

        input.close();
    }

    //methode to check if a number is prime
    private static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
