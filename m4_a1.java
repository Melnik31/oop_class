
public class m4_a1 {
    public static void main(String[] args) {
        m4_a1 obj = new m4_a1();
        obj.multiUse(10);
        obj.multiUse(10, 8);
        obj.multiUse(5, 7, 2);
    }




    // Method to print numbers from 1 to num
    public void multiUse(int num) {
        for (int i = 1; i <= num; i++) {
            System.out.println(i + " ");
        }
        System.out.println();
    }

    // Method to print average of x and y
    public void multiUse(int x, int y) {
        double avg = (x + y) / 2;
        System.out.println("Avarage of " + x +" and " + y + " = " + avg);
    } 
    
    //Method to fins the max
    public void multiUse(int x, int y, int c) {
        int max = x;
        if (y > max) max = y;
        if (c > max) max = c;
        System.out.println("Maximum: " + max);
    }
}
