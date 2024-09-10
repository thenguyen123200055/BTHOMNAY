/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Cautrucrenhanh;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class BT04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Tim 1 so chan");
        System.out.println("Nhap so N: ");
        n=sc.nextInt();
        
        if(n%2==0){
            System.out.println("La So chan");
        }else{
            System.out.println("La so le");
        }
    }
    
}
