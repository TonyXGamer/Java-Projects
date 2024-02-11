import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class ValentineProgram extends JFrame {

    public ValentineProgram() {
        setTitle("Happy Valentine's Day!");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(true);

        JLabel label = new JLabel("Will you be my Valentine?");
        label.setFont(new Font("Garamond", Font.BOLD, 24));
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setVerticalAlignment(SwingConstants.CENTER);

        JButton button1 = new JButton("YES");
        JButton button2 = new JButton("NO");


        getContentPane().setBackground(new Color(255, 204, 204)); // Light pink background

        JPanel inputPanel = new JPanel(new FlowLayout());
        inputPanel.add(button1);
        inputPanel.add(button2);

        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(label, BorderLayout.CENTER);
        getContentPane().add(inputPanel,BorderLayout.SOUTH);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Aww Thank you! I love you!");
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Oh, another year alone then.");
            }
        });

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                ValentineProgram valentineProgram = new ValentineProgram();
                valentineProgram.setVisible(true);
            }
        });
    }
}
