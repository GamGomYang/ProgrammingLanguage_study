import javax.swing.*;
import java.awt.event.*;
import java.awt.*;




public class IndepClassLister extends JFrame{

    
    public IndepClassLister(){
        setTitle("event listener");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        JButton btn = new JButton("Action");
       c.add(btn);

        btn.addActionListener(new MyActionListener(){
            public void actionPerformed(ActionEvent e){
                JButton b = (JButton)e.getSource();
                if(b.getText().equals("Action"))
                    b.setText("액션");
                else
                    b.setText("Action");
            }
        });
        



        setSize(300,150);
        setVisible(true);


    }

    private class MyActionListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            JButton b = (JButton)e.getSource();
            if(b.getText().equals("Action"))
                b.setText("액션");
            else
                b.setText("Action");
        }
    }
    public static void main(String[] args){
        new IndepClassLister();
    }    }

    
    class MyActionListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            JButton b = (JButton)e.getSource();
            if(b.getText().equals("Action"))
                b.setText("액션");
            else
                b.setText("Action");
        }
    }
    

