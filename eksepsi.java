/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPraktikum;

/**
 *
 * @author KomangRyan
 */
import java.util.Arrays;

public class eksepsi {
    public static void main(String[]args) {
        int [] array1 = {1,2};
        System.out.println(Arrays.toString(array1));
        try{
           array1[0]= 1;
           array1[1]= 3;
           array1[2]= 2;
           System.out.println(Arrays.toString(array1));
        }
        catch(ArrayIndexOutOfBoundsException eksepsi1){
            System.out.println("Indeks di luar ruang");
        }
        finally{
            int [] array2 = Arrays.copyOf(array1,array1.length + 1);
            
           array2[0]=  array1[0];
           array2[1]= 3;
           array2[2]= 2;
           System.out.println(Arrays.toString(array2));
        }
    }
}
