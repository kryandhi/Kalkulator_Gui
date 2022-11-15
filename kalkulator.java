/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPraktikum;

/**
 *
 * @author KomangRyan
 */
public class kalkulator {
   
    private int a;
    private int b;
    
    public kalkulator(){
       
        this.a= 0;
        this.b= 0;
    }
    
      int Penjumlahan (){
            return this.a+this.b;
      }
            
      int Pengurangan (){
            return this.a-this.b;
      }
      
      int Perkalian (){
         return this.a*this.b;
            
        }
      
       int Pembagian (){
            return this.a/this.b;
           
        }
       void ingfo(){
           System.out.println("Pertambahan : "+a+" + "+b+" = "+Penjumlahan());
           System.out.println("Pengurangan : "+a+" - "+b+"  = "+Pengurangan());
           System.out.println("Perkalian   : "+a+" X "+b+" = "+Perkalian());
           System.out.println("Pembagian   : "+a+" / "+b+"  = "+Pembagian());
        }
        }
       


class testKalkultor{
    
    public static void main(String[] args) {
        
        kalkulator pbo = new kalkulator();
       pbo.ingfo();
    }
}


