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
public class BT05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      double soKm;
      double tongtien;
      
       Scanner sc =new Scanner(System.in);
        System.out.println("Nhap so Km");
        soKm=sc.nextDouble();
      
       
           if (soKm <= 1) {
            tongtien = soKm * 15000;
        } else if (soKm <= 5) {
            tongtien = 15000 + (soKm - 1) * 13500;
        } else  {
            tongtien = 15000 + 4 * 13500 + (soKm - 5) * 11000;
        }
       
        // Áp dụng giảm giá 10% nếu số km trên 120
        if (soKm > 120) {
            tongtien *= 0.9;
        }
         System.out.println("So tien phai tra la:"+tongtien+"VNĐ");
    }
}