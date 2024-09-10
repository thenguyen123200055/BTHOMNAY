/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiTapKeThua;

/**
 *
 * @author ADMIN
 */
public class HinhVuong {
    public double canh;
    
    public HinhVuong(double canh){
    this.canh = canh;
}
        public double getChuVi(){
            return canh*4;
        }
        public double getDienTich(){
            return canh*canh;
        }
        public void xuat(){
            System.out.println("Vuong[canh=" + canh + ", dien tich: " + getDienTich() + ", chu vi: " + getChuVi() );
        }
}
