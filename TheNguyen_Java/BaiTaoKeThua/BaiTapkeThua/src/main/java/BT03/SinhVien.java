/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT03;

/**
 *
 * @author ADMIN
 */
public abstract class SinhVien {

    public String hoten;
    public String nganh;

    public SinhVien(String hoten, String nganh) {
        this.hoten = hoten;
        this.nganh = nganh;
    }

    abstract public double getDiem();

    public String getHocLuc() {
        String kq = "";
        double dtb = getDiem();
        if (dtb < 5) {
            kq = "Yeu";
        } else if (dtb < 6.5) {
            kq = "Trung Binh";

        } else if (dtb < 7.5) {
            kq = "Kha";
        } else if (dtb < 9) {
            kq = "Xuat Sac";
        }
        return kq;
    }

    //phuong Phap Xuat thong tin sinh vien 
    public void Xuat() {
        System.out.println("Sinh Vien [ Ho Ten: " + hoten + "Nganh: " + nganh + "Diem trung binh: " + getDiem() + "Hoc Luc: " + getHocLuc());
    }
}
