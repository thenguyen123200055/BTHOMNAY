/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cautrucrenhanh;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class BT01 {
    public static void main(String[] args) {
        // TODO code application logic here
        double a,b ; 
        String kq="";
        Scanner sc = new Scanner(System.in);
        //b1. nhap he so a,b
        System.out.print("========Giai Phuong Trinh bat 1=======");
        System.out.println("Cho biet he so a");
        a = sc.nextDouble();
        System.out.print("Cho biet he so a:");
        a = sc.nextDouble();
        System.out.print("Cho biet he so b:");
        b = sc.nextDouble();
        
        //B2. Giai phuong trinh
        if(a==0)
        {
            if(b==0)
            {
                kq="Phuong trinh vo so nghiem";
                
            }else {
                kq= "phuong trinh vo nghiem";
            }
        }else {
            kq = "Phuong trinh co nghiem x = " + (-b/a);
        }
        //b3. Xuat ket qua
        System.out.print(kq);
    }
    
}

