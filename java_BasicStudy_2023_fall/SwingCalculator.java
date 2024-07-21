import javax.swing.*;
import java.awt.*;
import javax.swing.*;
import java.awt.*;
import javax.swing.JTextField;


public class SwingCalculator extends JFrame {
    public SwingCalculator() {
        setTitle("계산기");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container insert = getContentPane();
        insert.setLayout(new GridLayout(6, 4,5,5)); 

        insert.add(new JTextField(""));

        insert.add(new JButton("%"));
        insert.add(new JButton("CE"));
        insert.add(new JButton("C"));
        insert.add(new JButton("DEL"));
        insert.add(new JButton("1/x"));
        insert.add(new JButton("x^2"));
        insert.add(new JButton("√x"));
        insert.add(new JButton("%"));
        insert.add(new JButton("7"));
        insert.add(new JButton("8"));
        insert.add(new JButton("9"));
        insert.add(new JButton("/"));
        insert.add(new JButton("4"));
        insert.add(new JButton("5"));
        insert.add(new JButton("6"));
        insert.add(new JButton("*"));
        insert.add(new JButton("1"));
        insert.add(new JButton("2"));
        insert.add(new JButton("3"));
        insert.add(new JButton("+"));
        insert.add(new JButton("+/-"));
        insert.add(new JButton("0"));
        insert.add(new JButton("."));
        insert.add(new JButton("="));

        setSize(300, 200);
        setVisible(true);
    }
    public static void main(String[] args) {
        new SwingCalculator();
    }
}