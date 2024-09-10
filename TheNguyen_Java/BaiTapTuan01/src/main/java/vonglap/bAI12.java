/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vonglap;

/**
 *
 * @author ADMIN
 */
public class bAI12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //khởi tạo mảng số:
        int numbers[] = new int[]{1,2,3,4,5,6,7,8,0};
            
        //Giá trị đầu tiên nhỏ nhất:
                int min = numbers[0];
        //Giá trị đầu tiên lớn nhất:
                int max = numbers[0];
         //Thực hiện vòng lập for 
            for (int i = 0; i < numbers.length;i++){
               //tìm gt min
                if (numbers [i]<min){
                    min = numbers[i];
                }
                //Tìm giá trị max
                if (numbers [i]>max){
                    max = numbers[i];
                }
            }
            System.out.println("Gia tri nho nhat la: " + min);
            System.out.println("Gia tri lon nhat la: " + max);
    }
    
   
    
}
