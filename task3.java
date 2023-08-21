import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
public class task3 {
public static void main(String[] args){
JLabel jLabel = new JLabel("ATM INTERFACE");
jLabel.setFont(new Font("Arial", Font.BOLD, 20));
jLabel.setBorder(new EmptyBorder(20, 0, 10, 0));
jLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
JLabel jLabel1 = new JLabel("Welcome to ATM INTERFACE");
jLabel1.setFont(new Font("Arial", Font.BOLD, 20));
jLabel1.setBorder(new EmptyBorder(50, 0, 0, 0));
jLabel1.setAlignmentX(Component.CENTER_ALIGNMENT);
JFrame jFrame = new JFrame("ATM INTERFACE");
jFrame.setSize(700, 500);
jFrame.setLayout(new BoxLayout(jFrame.getContentPane(), BoxLayout.Y_AXIS));
jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
JPanel jPanel = new JPanel();
jPanel.setBorder(new EmptyBorder(75, 0, 10, 0));
JButton jButton1 = new JButton("Withdraw");
jButton1.setPreferredSize(new Dimension(150, 75));
jButton1.setFont(new Font("Arial", Font.BOLD, 20));
JButton jButton2 = new JButton("Deposit");
jButton2.setPreferredSize(new Dimension(150, 75));
jButton2.setFont(new Font("Arial", Font.BOLD, 20));
JButton jButton3 = new JButton("Check Balance");
jButton3.setPreferredSize(new Dimension(200, 75));
jButton3.setFont(new Font("Arial", Font.BOLD, 20));
jPanel.add(jButton1);
jPanel.add(jButton2);
jPanel.add(jButton3);
jButton1.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            JFrame jFrame1 = new JFrame("Withdraw");
            jFrame1.setSize(700, 500);
            jFrame1.setLayout(new BoxLayout(jFrame1.getContentPane(), BoxLayout.Y_AXIS));
            jFrame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            JTextField jTextField = new JTextField();
            jTextField.setBounds(50, 100, 200, 30);
            JButton jButton = new JButton("Withdraw");
            jButton.setPreferredSize(new Dimension(200, 75));
            jButton.setFont(new Font("Arial", Font.BOLD, 20));
            JLabel jLabel3 = new JLabel("Welcome to Withdraw Section");
            jButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    double Balance = 654131664.45;
                    try {
                        double withdrawalAmount = Double.parseDouble(jTextField.getText());
                        if (withdrawalAmount <= Balance) {
                            Balance -= withdrawalAmount;
                            jLabel.setText("Please collect your cash and take your card.");
                            jLabel1.setText("Your updated balance is: " + Balance);
                        } else {
                            jLabel.setText("Insufficient balance. Please enter a valid amount.");
                        }
                    } catch (NumberFormatException ex) {
                        jLabel.setText("Please enter a valid amount.");
                    }
                }
            });

            jFrame1.add(jButton);
            jFrame1.add(jLabel3);
            jFrame1.add(jTextField);
            jFrame1.setVisible(true);
        } catch (Exception error) {
            error.printStackTrace();
        }
    }
});
jButton2.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            JFrame jFrame2 = new JFrame("Deposit");
            jFrame2.setSize(700, 500);
            jFrame2.setLayout(new BoxLayout(jFrame2.getContentPane(), BoxLayout.Y_AXIS));
            jFrame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            JTextField jTextField = new JTextField();
            jTextField.setBounds(50, 100, 200, 30);
            JButton jButton = new JButton("Deposit");
            jButton.setPreferredSize(new Dimension(200, 75));
            jButton.setFont(new Font("Arial", Font.BOLD, 20));
            JLabel jLabel3 = new JLabel("Welcome to Deposit Section");
            jButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    double Balance = 654131664.45;
                    try {
                        double depositAmount = Double.parseDouble(jTextField.getText());
                        if (depositAmount > 0) {
                            Balance += depositAmount;
                            jLabel.setText("Deposit successful.");
                            jLabel1.setText("Your updated balance is: " + Balance);
                        } else {
                            jLabel.setText("Please enter a valid deposit amount.");
                        }
                    } catch (NumberFormatException ex) {
                        jLabel.setText("Please enter a valid amount.");
                    }
                }
            });

            jFrame2.add(jButton);
            jFrame2.add(jLabel3);
            jFrame2.add(jTextField);
            jFrame2.setVisible(true);
        } catch (Exception error) {
            error.printStackTrace();
        }
    }
});
jButton3.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e){
       double Balance = 654131664.45;
       jLabel1.setText("your balance is "+Balance);
    }
});
jFrame.add(jLabel);
jFrame.add(jPanel);
jFrame.add(jLabel1);
jFrame.setVisible(true);
}
}


