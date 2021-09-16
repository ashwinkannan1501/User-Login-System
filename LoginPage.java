// Import the necessary packages
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.HashMap;

public class LoginPage extends JFrame implements ActionListener {
    JPanel panel = new JPanel();
    JLabel usernameLabel = new JLabel("Username : ");
    JLabel passwordLabel = new JLabel("Password : ");
    JLabel messageLabel = new JLabel();
    JTextField usernameTextField = new JTextField();
    JTextField passwordTextField = new JTextField();
    JPasswordField passwordField = new JPasswordField();
    JCheckBox passwordCheckBox = new JCheckBox("Show Password", false);
    JButton loginButton = new JButton("Login");
    JButton resetButton = new JButton("Reset");

    Font font = new Font("Times new roman", Font.BOLD, 25);

    HashMap<String, String> loginInfo = new HashMap<String, String>();
    LoginPage(HashMap<String, String> loginInfoOriginal){
        loginInfo = loginInfoOriginal;

        usernameLabel.setBounds(50, 60, 140, 35);
        usernameLabel.setFont(font);

        passwordLabel.setBounds(50, 120, 140, 35);
        passwordLabel.setFont(font);

        usernameTextField.setBounds(220, 60, 300, 35);
        usernameTextField.setFont(font);

        passwordField.setBounds(220, 120, 300, 35);
        passwordField.setFont(font);

        passwordCheckBox.setBounds(50, 200, 200, 30);
        passwordCheckBox.setFont(font);
        passwordCheckBox.setFocusable(false);
        passwordCheckBox.addActionListener(this::actionPerformed);

        loginButton.setBounds(280, 200, 100, 30);
        loginButton.setFont(font);
        loginButton.setFocusable(false);
        loginButton.addActionListener(this::actionPerformed);

        resetButton.setBounds(400, 200, 130, 30);
        resetButton.setFont(font);
        resetButton.setFocusable(false);
        resetButton.addActionListener(this::actionPerformed);

        panel.setSize(550, 650);
        panel.setLayout(null);
        panel.add(usernameLabel); panel.add(passwordLabel);
        panel.add(usernameTextField);
        panel.add(passwordField);
        panel.add(passwordTextField);
        panel.add(passwordCheckBox);
        panel.add(loginButton); panel.add(resetButton);
        panel.add(messageLabel);

        this.setTitle("Login Systems");
        this.setSize(600, 350);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setResizable(false);
        this.add(panel);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource() == loginButton) {
            String username = usernameTextField.getText();
            String password = String.valueOf(passwordField.getPassword());
            String textPassword = passwordTextField.getText();

            messageLabel.setBounds(200, 250, 300, 50);
            messageLabel.setFont(font);

            if (loginInfo.containsKey(username)){
                if ((loginInfo.get(username).equals(password)) || (loginInfo.get(username).equals(textPassword))) {
                    messageLabel.setText("Login Successful");
                    messageLabel.setForeground(Color.GREEN);

                    new WelcomeScreen();

                    this.dispose();
                }
                else {
                    messageLabel.setText("Password doesn't match");
                    messageLabel.setForeground(Color.RED);
                }
            }
            else {
                messageLabel.setText("Username not found");
                messageLabel.setForeground(Color.RED);
            }
        }
        if (actionEvent.getSource() == resetButton) {
            usernameTextField.setText("");
            passwordField.setText("");
            passwordTextField.setText("");
        }

        if (actionEvent.getSource() == passwordCheckBox) {
            if (passwordCheckBox.isSelected()) {
                passwordTextField.setBounds(passwordField.getBounds());
                passwordTextField.setText(passwordField.getText());
                passwordTextField.setFont(font);
                passwordTextField.setVisible(true);
                passwordField.setVisible(false);
            } else if (! passwordCheckBox.isSelected()) {
                passwordTextField.setVisible(false);
                passwordField.setVisible(true);
                passwordField.setText(passwordTextField.getText());
            }
        }
    }
}
