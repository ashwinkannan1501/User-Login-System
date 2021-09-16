// Import the necessary packages
import javax.swing.*;
import java.awt.*;

public class WelcomeScreen extends JFrame {
    public WelcomeScreen () {
        JLabel label = new JLabel("Welcome to the home page of my application");
        label.setFont(new Font("Consolas", Font.BOLD, 50));
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);

        this.setTitle("Home Page");
        this.setSize(550, 650);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocation(100, 50);
        this.setLayout(new BorderLayout());
        this.add(label);
        this.setVisible(true);
        this.pack();
    }
}
