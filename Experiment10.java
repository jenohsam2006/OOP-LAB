import javax.swing.*;
import java.awt.event.*;   
import java.awt.*;         
public class LoginApp extends JFrame implements ActionListener {
    JLabel userLabel, passLabel;
    JTextField userText;
    JPasswordField passText;
    JButton loginButton;
    public LoginApp() {
        setTitle("Swing Application");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        userLabel = new JLabel("Username");
        userLabel.setBounds(80, 40, 80, 25);
        add(userLabel);
        userText = new JTextField();
        userText.setBounds(180, 40, 120, 25);
        add(userText);
        passLabel = new JLabel("Password");
        passLabel.setBounds(80, 80, 80, 25);
        add(passLabel);
        passText = new JPasswordField();
        passText.setBounds(180, 80, 120, 25);
        add(passText);
        loginButton = new JButton("Login");
        loginButton.setBounds(150, 120, 80, 25);
        add(loginButton);
        loginButton.addActionListener(this);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        String username = userText.getText();
        String password = new String(passText.getPassword());
        if (username.equals("Karunya") && password.equals("Karunya")) {
            JOptionPane.showMessageDialog(this, "Login Successful", "Message", JOptionPane.INFORMATION_MESSAGE);
        } 
        else {
            JOptionPane.showMessageDialog(this, "Login Failed", "Message", JOptionPane.ERROR_MESSAGE);
        }
    }
    public static void main(String[] args) {
        new LoginApp();
    }
}




import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class RadioButtonDemo extends JFrame implements ActionListener {
    JRadioButton javaBtn, aspBtn, sqlBtn;
    ButtonGroup group;
    public RadioButtonDemo() {
        setTitle("JRadioButton Demo");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        JLabel label = new JLabel("Please choose your favorite language:", JLabel.CENTER);
        label.setFont(new Font("Arial", Font.PLAIN, 14));
        add(label, BorderLayout.NORTH);
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 10));
        javaBtn = new JRadioButton("Java");
        aspBtn = new JRadioButton("ASP.Net");
        sqlBtn = new JRadioButton("SQL");
        group = new ButtonGroup();
        group.add(javaBtn);
        group.add(aspBtn);
        group.add(sqlBtn);
        buttonPanel.add(javaBtn);
        buttonPanel.add(aspBtn);
        buttonPanel.add(sqlBtn);
        add(buttonPanel, BorderLayout.CENTER);
        javaBtn.addActionListener(this);
        aspBtn.addActionListener(this);
        sqlBtn.addActionListener(this);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == javaBtn) {
            JOptionPane.showMessageDialog(this, "The Java option has been selected", "Message", JOptionPane.INFORMATION_MESSAGE);
        } else if (e.getSource() == aspBtn) {
            JOptionPane.showMessageDialog(this, "The ASP.Net option has been selected", "Message", JOptionPane.INFORMATION_MESSAGE);
        } else if (e.getSource() == sqlBtn) {
            JOptionPane.showMessageDialog(this, "The SQL option has been selected", "Message", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    public static void main(String[] args) {
        new RadioButtonDemo();
    }
}


