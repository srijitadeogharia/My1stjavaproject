package UNIVERSITYMANG;
import java.awt.Image;

import javax.swing.*;
public class Splash extends JFrame implements Runnable{
    Thread t1;
    Splash(){

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/first.png"));
        Image i2=i1.getImage().getScaledInstance(500,700,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel img=new JLabel(i3);
        add(img);

        t1=new Thread(this);
        t1.start();
        setVisible(true);

        int x=1;
        for(int i=2;i<=600;i+=4,x+=1){
            setLocation(600-((i+x)/2),350-(i/2));
            setSize(300,500);

            try{
                Thread.sleep(10);
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
    
    public  void run (){
        try{
            Thread.sleep(7000);
            setVisible(false);
           new Login();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String args[]){
        new Splash(); 
    }
}
