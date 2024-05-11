package quizzy.app;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {

    JTextField text;
    JButton Next, Back;
    //constructor
    Login(){
        getContentPane().setBackground(Color.GRAY);
        setLayout(null);
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/login.png"));
        Image i=i1.getImage().getScaledInstance(550,500,Image.SCALE_DEFAULT);
        ImageIcon i2=new ImageIcon(i);
        JLabel image=new JLabel(i2);
        image.setBounds(450,0,550,500);
        add(image);

        JLabel heading=new JLabel("QUIZZY TEST");
        heading.setBounds(100,60,300,45);
        heading.setFont(new Font("Viner Hand IT",Font.BOLD,40));
        heading.setForeground(Color.black);
        add(heading);

        JLabel name=new JLabel("ENTER YOUR NAME");
        name.setBounds(120,150,300,20);
        name.setFont(new Font("Mongolian baiti",Font.BOLD,18));
        name.setForeground(Color.black);
        add(name);

        text=new JTextField();
        text.setBounds(80,200,300,25);
        text.setFont(new Font("Times New Roman",Font.BOLD,15));
        add(text);

        Next=new JButton("Next");
        Next.setBounds(100,270,120,25);
        Next.setBackground(Color.black);
        Next.setForeground(Color.white);
        Next.addActionListener(this);
        add(Next);

        Back=new JButton("Back");
        Back.setBounds(250,270,120,25);
        Back.setBackground(Color.black);
        Back.setForeground(Color.white);
        Back.addActionListener(this);
        add(Back);




        setSize(1000,500);
        setLocation(250,150);
        setUndecorated(true);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() ==Next){
            String name=text.getText();
            setVisible(false);
            new Rules(name);

        } else if (e.getSource()==Back) {
            System.exit(100);
        }

    }

    public static void main(String[] args) {
        new Login();


    }
}
