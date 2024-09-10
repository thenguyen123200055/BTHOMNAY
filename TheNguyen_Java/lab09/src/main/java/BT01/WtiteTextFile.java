/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT01;
import java.io.FileWriter;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class WtiteTextFile {
    public static void main(String[] args) {
        ArrayList<SanPham> ds = new ArrayList<>();
        //b1. nhap danh sach co it nhat 3 san pham
        ds.add(new SanPham ("SP01", "Lua" , 50000));
        ds.add(new SanPham ("SP02", "Thit" , 20000));
        ds.add(new SanPham ("SP03", "Ca Chep" , 30000));
        
        try {
            //b2. ghi danh sach san pham ra san pham.txt
            //b2.1. tao doi tuong va lien ket nguon du lieu
            FileWriter fw = new FileWriter("sanpham.txt");
            //b2.2.Ghi du lieu
            for(SanPham x : ds)
            {
                fw.write(x.getMaso()+ ";" + x.getTen() +";" + x.getGia() + "\n");
                //b2.3 dong luong
            }
                fw.close();
                System.out.println("Da Ghi Xong:");
                
            } catch (Exception ex){
                    System.out.println(ex.toString()   );
                    System.out.println("Thao tac that bai");
                    }
        }
    }   

