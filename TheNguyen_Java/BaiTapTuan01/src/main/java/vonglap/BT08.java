/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vonglap;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class BT08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        int tong;

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so n:");
        n = sc.nextInt();

        tong = 0;

        for (int i = 1; i <= n; i++) {
            tong += i;
        }
        System.out.println("Tong cac so tu 1 den " + n + " là: " + tong);

    }
}
