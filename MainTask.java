import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class MainTask extends JFrame implements ActionListener {
    JButton b1, b2;

    MainTask() {
        setSize(450, 120);
        setTitle("Students Statistics");
        setResizable(false);
        setLayout(null);

        Color code = new Color(2, 48, 32);
        getContentPane().setBackground(code);
        Color sadist_blue = new Color(196, 180, 84);

        b1 = new JButton("Insert a new Student");
        b1.setBounds(20, 20, 250, 50);
        b1.setFont(new Font("Pacifico", Font.BOLD, 20));
        b1.addActionListener(this);
        b1.setBackground(sadist_blue);
        b1.setForeground(Color.BLACK);

        b2 = new JButton("Statistics");
        b2.setBounds(285, 20, 125, 50);
        b2.setFont(new Font("Pacifico", Font.BOLD, 20));
        b2.addActionListener(this);
        b2.setBackground(sadist_blue);
        b2.setForeground(Color.BLACK);

        add(b1);
        add(b2);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1)
            new Insert();
        if (e.getSource() == b2)
            new Statistics();
    }
}