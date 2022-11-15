/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TugasPraktikum;

/**
 *
 * @author KomangRyan
 */
public class testKendaraan {

    
    
        public static void main(String[] args) {
        kendaraan pesawat = new kendaraan("biru","bensol",160);
            System.out.println("pesawat");
        pesawat.inpo();
        System.out.println("");
        
        kendaraan_darat truk = new kendaraan_darat("kuning","solar",4,6);
            System.out.println("truk");
        truk.inpo();
        System.out.println("");
        
        sepeda_motor motor = new sepeda_motor("putih","shell vpower",2,2,"yamaha aerox");
            System.out.println("motor");
        motor.inpo();
        System.out.println("");
        
        kendaraan_laut jetski = new kendaraan_laut("merah","solar",2,"baling baling jet");
            System.out.println("jetski");
        jetski.inpo();
        System.out.println("");
        
        perahu_layar perahu = new perahu_layar("abu abu","angin",8,"layar",2);
            System.out.println("perahu");
        perahu.inpo();
        System.out.println("");
        
       
        
    }
    
}
    

