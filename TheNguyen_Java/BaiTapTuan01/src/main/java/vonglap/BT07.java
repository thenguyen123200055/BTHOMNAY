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
public class BT07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int thang, nam;
        int songay = 0;
        Scanner sc = new Scanner(System.in);
//b1.Đọc tháng, năm từ người dùng
        System.out.println("====CHUONG TRINH TINH SO NGAY CUA THANG====");
        System.out.print("Cho biet thang:");
        thang = sc.nextInt();
        System.out.print("Cho biet nam:");
        nam = sc.nextInt();
//b2.Xét tháng của năm để tính số ngày
        switch (thang) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                songay = 31;
                break;
            case 2:
                if (nam % 4 == 0) {
                    songay = 29;
                } else {
                    songay = 28;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                songay = 30;
                break;
            default:
                System.out.println("Thang khong hop le");
        }
//b3. Xuất kết quả
        System.out.println("Thang " + thang + " co " + songay + " ngay");
    }
}
