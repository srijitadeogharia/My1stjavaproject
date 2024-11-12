package UNIVERSITYMANG;
import javax.swing.*;

import javafx.event.ActionEvent;

import java.awt.*;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {
    JTextField textFieldName;


    JPasswordField PasswordField;

    JButton login,back;


    Login(){

        JLabel labelname=new JLabel("Username");
        labelname.setBounds(40,20,100,20);
        add(labelname);

        textFieldName=new JTextField();
        textFieldName.setBounds(150,20,150,20);
        add(textFieldName);


        JLabel labelpass=new JLabel("password");
        labelpass.setBounds(40,70,100,20);
        add(labelpass);


        PasswordField=new JPasswordField();
        PasswordField.setBounds(150,70,150,20);
        add(PasswordField );

        login=new JButton("login");
        login.setBounds(40,140,120,30);
        login.setBackground(Color.black);
        login.setForeground(Color.white);
        login.addActionListener(this);
        add(login);


        back=new JButton("Back");
        back.setBounds(180,140,120,30);
        back.setBackground(Color.black);
        back.setForeground(Color.white);
        back.addActionListener(this);
        add(back);

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/second.png"));
        Image i2=i1.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel img= new JLabel(i3);
        img.setBounds(350,20,200,200);
        add(img);


        ImageIcon i11=new ImageIcon(ClassLoader.getSystemResource("icon/loginback.png"));
        Image i22=i11.getImage().getScaledInstance(600,300,Image.SCALE_DEFAULT);
        ImageIcon i33=new ImageIcon(i22);
        JLabel image= new JLabel(i33);
        image.setBounds(0,0,600,300);
        add(image);


        setSize(600,300);
        setLocation(500,250);
        setLayout(null);
        setVisible(true);


    }
    
    @Override

    public void actionPerformed(ActionEvent e){
        
        if(e.getSource()==login){

        }else{
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new Login();
    }
}
