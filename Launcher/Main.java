import javax.swing.*;  

public class Main {  
  
    public static void main(String[] args) {  
        JFrame f=new JFrame("BringOldMcLauncher");  
        JButton b=new JButton("Launch");  
        b.setBounds(50,100,95,30);  
        f.add(b);  
        f.setSize(400,400);  
        f.setLayout(null);  
        f.setVisible(true);   
    }  
  
} 
