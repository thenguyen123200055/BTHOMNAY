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
public class BT03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int so1, so2, so3;

        Scanner sc = new Scanner(System.in);
        System.out.println("Tim so nho nhat");
        System.out.println("Nhap so thu nhat:");
        so1 = sc.nextInt();
        System.out.println("Nhap so thu hai:");
        so2 = sc.nextInt();
        System.out.println("Nhap so thu ba:");
        so3 = sc.nextInt();

        int min = so1;
        if (so2 < so1) {
            min = so2;
        }
        if (so3 < min) {
            min = so3;
        }
        System.out.println("So nho nhat la " + min);
    }

}
