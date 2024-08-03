import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Font;

public class Statistics extends JFrame implements ActionListener {
    JButton b1, b2, b3, b4;

    Statistics() {
        setSize(640, 200);
        setTitle("Students Statistics");
        setLayout(null);
        setResizable(false);
        setLocationRelativeTo(null);

        Color code = new Color(2, 48, 32);
        getContentPane().setBackground(code);
        Color sadist_blue = new Color(196, 180, 84);

        b1 = new JButton("ALL COLLEGES");
        b1.setBounds(220, 20, 180, 50);
        b1.setFont(new Font("MV Boly", Font.BOLD, 18));
        b1.addActionListener(this);
        b1.setForeground(Color.BLACK);
        b1.setBackground(sadist_blue);

        b2 = new JButton("AEC");
        b2.setBounds(20, 90, 180, 50);
        b2.setFont(new Font("MV Boly", Font.BOLD, 20));
        b2.addActionListener(this);
        b2.setForeground(Color.BLACK);
        b2.setBackground(sadist_blue);

        b3 = new JButton("ACET");
        b3.setBounds(220, 90, 180, 50);
        b3.setFont(new Font("MV Boly", Font.BOLD, 20));
        b3.addActionListener(this);
        b3.setForeground(Color.BLACK);
        b3.setBackground(sadist_blue);

        b4 = new JButton("ACOE");
        b4.setBounds(420, 90, 180, 50);
        b4.setFont(new Font("MV Boly", Font.BOLD, 20));
        b4.addActionListener(this);
        b4.setForeground(Color.BLACK);
        b4.setBackground(sadist_blue);

        add(b1);
        add(b2);
        add(b3);
        add(b4);
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1)
            new AllCampuses();
        if (e.getSource() == b2)
            new FirstCampus();
        if (e.getSource() == b3)
            new SecondCampus();
        if (e.getSource() == b4)
            new ThirdCampus();
    }
}