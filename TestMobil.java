/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPraktikum;

/**
 *
 * @author KomangRyan
 */
public class TestMobil {
    public static void main(String[] args) {
        
        DataMobil mobil1 = new DataMobil("Toyota","Biru","minibus",2000,7);
        DataMobil mobil2 = new DataMobil("Daihatsu","Hitam","pick up",1500,2);
        DataMobil mobil3 = new DataMobil("Suzuki","Silver","suv",1800,5);
        DataMobil mobil4 = new DataMobil("Honda","Merah","sedan",1300,5);
        
        System.out.println(" Spesifikasi Mobil 1"); 
        mobil1.infoMobil(); 
        System.out.println(" Spesifikasi Mobil 2"); 
        mobil2.infoMobil(); 
        System.out.println(" Spesifikasi Mobil 3"); 
        mobil3.infoMobil();
        System.out.println(" Spesifikasi Mobil 4"); 
        mobil4.infoMobil();
    }
}
