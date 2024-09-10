/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
/**
 *
 * @author ADMIN
 */
public class Program {

    public static void main(String[] args) {
        JFrame f = new JFrame("Login System: ");
        
        //tạo thùng chứa các compoment
        
        JPanel p = new JPanel ();
        
       p.setLayout (null);
        JLabel jbUser = new JLabel("User");
        JLabel jbPass = new JLabel("Password");
        
        JTextField txtUser = new JTextField(10);
        JPasswordField txtPass = new JPasswordField(10);
        
        JButton btLogin = new JButton ("login: ");
        JButton btReset = new JButton ("reset: ");
        
        //
        p.add(jbUser);
        p.add(jbPass);
        p.add(txtUser);
        p.add(txtPass);
        p.add(btLogin);
        p.add(btReset);
       
        jbUser.setBounds(10, 10, 100, 30);
        jbPass.setBounds(10, 50, 100, 30);
       
        txtUser.setBounds(120, 10, 150, 30);
        txtPass.setBounds(120, 50, 150, 30);
       
        btLogin.setBounds(30, 90, 100, 30);
        btReset.setBounds(140, 90, 100, 30);
       
       
        //add các thùng chứa vào cửa sổ
       
        f.add(p);
       
        f.setSize(300,200);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);

        
    }
}
