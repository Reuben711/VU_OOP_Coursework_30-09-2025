
package vu.exhibitionsystem;

/**
 *
 * @author Muhindo Reuben
 */
public class ExhibitionSystem {
    
    // Main methd for displaying the GUI in the application
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            RegistrationForm form = new RegistrationForm();
            form.setResizable(false); // Prevent user from resizing window to maintain layout
            form.setLocationRelativeTo(null); // Center window on screen
            form.setVisible(true); // Display form
        });
    }
}
