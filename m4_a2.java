import javax.swing.JOptionPane;

public class m4_a2 {
    public static void main(String[] args) {
        String username = JOptionPane.showInputDialog("Enter your Username: ");
        String password = JOptionPane.showInputDialog("Enter your Password: ");

        if ("Hero".equals(username) && "Zero".equals(password)) {
            JOptionPane.showMessageDialog(null, "Access Granted");
        } else {
            JOptionPane.showMessageDialog(null, "Access Denied");
        }
    }
}
