import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class swingex extends JFrame{
    public swingex(){
        setTitle("FlowLayoutSample");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();

        c.setLayout(new FlowLayout(FlowLayout.LEFT,30,20));

        c.add(new JButton("add"), BorderLayout.CENTER);
        c.add(new JButton("sub"), BorderLayout.NORTH);
        c.add(new JButton("mul"), BorderLayout.SOUTH);
        c.add(new JButton("div"), BorderLayout.EAST);
        c.add(new JButton("Calculate"), BorderLayout.WEST);

        setSize(300,200);
        setVisible(true);
    }

    public static void main(String[] args){
        new swingex();
    }

}