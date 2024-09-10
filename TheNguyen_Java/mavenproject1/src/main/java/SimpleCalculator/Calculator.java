/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package SimpleCalculator;

import java.awt.Frame;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import javax.swing.JTextField;

/**
 *
 * @author ADMIN
 */
public class Calculator extends Frame {

    private JLabel lbNum1, lbNum2, lbResuft;
    private JTextField txtNum1, txtNum2, txtResuft;
    private JButton btSub, btAdd, btMul, btDiv;

    public Calculator(String title) {
        super(title);

        JPanel p = new JPanel();
        p.setLayout(new GridLayout(3, 2, 10, 10));

        p.add(lbNum1 = new JLabel("Num 1"));
        p.add(txtNum1 = new JTextField(10));
        p.add(lbNum2 = new JLabel("Num 1"));
        p.add(txtNum2 = new JTextField(10));
        p.add(lbResuft = new JLabel("Num 1"));
        p.add(txtResuft = new JTextField(10));

        p.add(btSub = new JButton("Sub"));
        p.add(btAdd = new JButton("Add"));
        p.add(btMul = new JButton("Mul"));
        p.add(btDiv = new JButton("Div"));

        add(p);
        setSize(325, 150);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    
    
    
    

    public static void main(String[] args) {

    }

}
