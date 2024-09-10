/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT01;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class SanPham {
    String maso;
    String ten;
    float gia;
    
    Scanner sc = new Scanner (System.in);

    public SanPham(String maso, String ten, float gia) {
        this.maso = maso;
        this.ten = ten;
        this.gia = gia;
    }

    public String getMaso() {
        return maso;
    }

    public String getTen() {
        return ten;
    }

    public float getGia() {
        return gia;
    }

    public Scanner getSc() {
        return sc;
    }

    public void setMaso(String maso) {
        this.maso = maso;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setGia(float gia) {
        this.gia = gia;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }
    
}

