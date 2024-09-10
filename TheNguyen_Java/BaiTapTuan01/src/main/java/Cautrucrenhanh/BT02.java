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
public class BT02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double Toan, Van, Anh;
        double dtb;
        
        //Buoc1. nhap diem toan van anh
        Scanner sc = new Scanner(System.in);
        System.out.println("====Xet hoc luc====");
        System.out.print("Cho biet diem toan: ");
        Toan = sc.nextDouble();
        System.out.print("Cho biet diem van: ");
        Van = sc.nextDouble();
        System.out.print("Cho biet diem anh: ");
        Anh = sc.nextDouble();
        
        //B2. Tinh DIem trung binh
        dtb = (Toan+Van+Anh)/3;
        //B3.Xet Hoc Luc
        String kq="";
        if (dtb<=4){
            kq="Yeu";
        }else if(dtb <=6.5){
            kq="Trung Binh";
        }else if(dtb<=9){
            kq ="Kha";
        }else{
            kq ="Gioi";
        }
        //B4.Xuat ket qua
        System.out.println("DTB " + dtb + " - Hoc luc: " + kq);
    }
    
}
