/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT03;

/**
 *
 * @author ADMIN
 */
public class  SinhVienIT extends SinhVien{
    public double diemjava;
    public double diemCSS;
    public double diemHTML;
    
    public SinhVienIT(String hoten, double diemjava, double diemCSS, double diemHTML){
       super(hoten, "IT");
       this.diemjava = diemjava;
       this.diemCSS = diemCSS;
       this.diemHTML = diemHTML;
    }

    @Override
    public double getDiem() {
        return (diemjava *2 + diemCSS + diemHTML)/4;
    }
}
