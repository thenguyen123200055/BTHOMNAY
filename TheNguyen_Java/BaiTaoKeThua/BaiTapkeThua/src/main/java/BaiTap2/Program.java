package BaiTap2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HinhTron c1 = new HinhTron(5.0);
        System.out.println("hinh Tron[Ban kinh: " + c1.getBankinh() + ",dien tich: " + c1.tinhDienTich() + ", chu vi: " + c1.tinhChuVi());
        
        HinhTru c2 = new HinhTru(5.0, 3.0);
        System.out.println("Hinh Tru[ban kinh: " + c2.getBankinh() + ",chieu cao: " + c2.getChieuCao() + ",dien tich: " + c2.tinhDienTich() + ",the tich: " + c2.tinhTheTich());
        
       
    }
    
}
