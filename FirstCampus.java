import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class FirstCampus extends JFrame {
        JLabel j1, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12;
        JButton b1;

        FirstCampus() {
                setSize(600, 400);
                setTitle("Students Statistics");
                setLayout(null);

                Color code = new Color(2, 48, 32);
                getContentPane().setBackground(code);
                Color sadist_blue = new Color(196, 180, 84);

                int borderX = 60; // Adjust x position of the border
                int borderY = 40; // Adjust y position of the border
                int borderWidth = getWidth() - 150; // Adjust width of the border
                int borderHeight = getHeight() - 150; // Adjust height of the border
                LineBorder border = new LineBorder(Color.BLACK, 4);
                JPanel borderPanel = new JPanel();
                borderPanel.setBackground(sadist_blue);
                borderPanel.setBounds(borderX, borderY, borderWidth, borderHeight);
                borderPanel.setBorder(border);

                try {
                        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rajesh", "root",
                                        "24854");
                        Statement st = con.createStatement();
                        Statement st1 = con.createStatement();
                        Statement st2 = con.createStatement();
                        Statement st3 = con.createStatement();
                        Statement st4 = con.createStatement();
                        Statement st5 = con.createStatement();
                        ResultSet rs1 = st.executeQuery("select count(*) from Students_Statistics where college='AEC'");
                        ResultSet rs2 = st1
                                        .executeQuery("select count(*) from Students_Statistics where BRANCH='AIML' and college='AEC'");
                        ResultSet rs3 = st2
                                        .executeQuery("select count(*) from Students_Statistics where BRANCH='CSE' and college='AEC'");
                        ResultSet rs4 = st3
                                        .executeQuery("select count(*) from Students_Statistics where BRANCH='DS' and college='AEC'");
                        ResultSet rs5 = st4
                                        .executeQuery("select count(*) from Students_Statistics where BRANCH='IOT' and college='AEC'");
                        ResultSet rs6 = st5
                                        .executeQuery("select count(*) from Students_Statistics where BRANCH='IT' and college='AEC'");
                        rs1.next();
                        rs2.next();
                        rs3.next();
                        rs4.next();
                        rs5.next();
                        rs6.next();
                        int s1 = rs1.getInt(1);
                        int s2 = rs2.getInt(1);
                        int s3 = rs3.getInt(1);
                        int s4 = rs4.getInt(1);
                        int s5 = rs5.getInt(1);
                        int s6 = rs6.getInt(1);

                        j1 = new JLabel();
                        j1.setBounds(200, 70, 200, 30);
                        j1.setText("Total Students");
                        j1.setFont(new Font("Pacifico", Font.BOLD, 25));
                        j1.setForeground(Color.BLACK);

                        j2 = new JLabel();
                        j2.setBounds(270, 100, 50, 40);
                        j2.setText("" + s1);
                        j2.setFont(new Font("Pacifico", Font.BOLD, 25));
                        j2.setForeground(Color.BLACK);

                        j3 = new JLabel();
                        j3.setBounds(120, 170, 70, 30);
                        j3.setText("AIML");
                        j3.setFont(new Font("Pacifico", Font.BOLD, 20));
                        j3.setForeground(Color.BLACK);

                        j4 = new JLabel();
                        j4.setBounds(135, 205, 40, 30);
                        j4.setText("" + s2);
                        j4.setFont(new Font("Pacifico", Font.BOLD, 20));
                        j4.setForeground(Color.BLACK);

                        j5 = new JLabel();
                        j5.setBounds(200, 170, 70, 30);
                        j5.setText("CSE");
                        j5.setFont(new Font("Pacifico", Font.BOLD, 20));
                        j5.setForeground(Color.BLACK);

                        j6 = new JLabel();
                        j6.setBounds(210, 205, 40, 30);
                        j6.setText("" + s3);
                        j6.setFont(new Font("Pacifico", Font.BOLD, 20));
                        j6.setForeground(Color.BLACK);

                        j7 = new JLabel();
                        j7.setBounds(280, 170, 70, 30);
                        j7.setText("DS");
                        j7.setFont(new Font("Pacifico", Font.BOLD, 20));
                        j7.setForeground(Color.BLACK);

                        j8 = new JLabel();
                        j8.setBounds(290, 205, 40, 30);
                        j8.setText("" + s4);
                        j8.setFont(new Font("Pacifico", Font.BOLD, 20));
                        j8.setForeground(Color.BLACK);

                        j9 = new JLabel();
                        j9.setBounds(350, 170, 70, 30);
                        j9.setText("IOT");
                        j9.setFont(new Font("Pacifico", Font.BOLD, 20));
                        j9.setForeground(Color.BLACK);

                        j10 = new JLabel();
                        j10.setBounds(360, 205, 40, 30);
                        j10.setText("" + s5);
                        j10.setFont(new Font("Pacifico", Font.BOLD, 20));
                        j10.setForeground(Color.BLACK);

                        j11 = new JLabel();
                        j11.setBounds(430, 170, 70, 30);
                        j11.setText("IT");
                        j11.setFont(new Font("Pacifico", Font.BOLD, 20));
                        j11.setForeground(Color.BLACK);

                        j12 = new JLabel();
                        j12.setBounds(433, 205, 40, 30);
                        j12.setText("" + s6);
                        j12.setFont(new Font("Pacifico", Font.BOLD, 20));
                        j12.setForeground(Color.BLACK);

                        b1 = new JButton("View");
                        b1.setBounds(225, 300, 100, 30);
                        b1.setBackground(Color.WHITE);
                        b1.addActionListener(new ActionListener() {
                                public void actionPerformed(ActionEvent e) {
                                        new AECData();
                                }
                        });
                        b1.setFont(new Font("Pacifico", Font.BOLD, 20));
                        b1.setBackground(sadist_blue);
                        b1.setForeground(Color.BLACK);

                } catch (SQLException e) {

                }
                add(b1);
                add(j1);
                add(j2);
                add(j3);
                add(j4);
                add(j5);
                add(j6);
                add(j7);
                add(j8);
                add(j9);
                add(j10);
                add(j11);
                add(j12);
                setVisible(true);
                setResizable(false);
                setLocationRelativeTo(null);
                add(borderPanel);
                setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        }

}