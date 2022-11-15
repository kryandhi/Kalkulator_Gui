/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPraktikum;

/**
 *
 * @author KomangRyan
 */
public class hewan {
    private String jenis;
    
    public hewan(String jenis){
        this.jenis = jenis;
    }
    
    public void info(){
        
    }
}
class mamalia extends hewan{
    private String nama;
    private String spesies;
    
   public mamalia(String nama,String spesies){
       
       super("mamalia");
       this.nama = nama;
       this.spesies = spesies;
     
   }
   public mamalia(String nama){
       
       super("mamalia");
       this.nama = nama;
     spesies = "Belum Teridentifikasi";
       
   }
   
   public void info(){
       System.out.println("Nama Reptil = "+ nama);
       System.out.println("Spesies Reptil = "+ spesies);
   }
}
   
   class burung extends hewan{
    private String nama;
    private String spesies;
    
   public burung(String nama,String spesies){
       
       super("burung");
       this.nama = nama;
       this.spesies = spesies;
     
   }
   public burung(String nama){
       
       super("burung");
       this.nama = nama;
       spesies = "Belum Teridentifikasi";
       
   }
   
   public void info(){
       System.out.println("Nama Burung = "+ nama);
       System.out.println("Spesies Burung = "+ spesies);
   }
   }


class Main { 
    public static void main(String[] args) {
    
        hewan h;
        
        mamalia mam = new mamalia("Harimau", "Karnivora"); 
        burung brg1 = new burung("Kolibri");
        burung brg2 = new burung("Gagak","Omnivora");
        
        
        h = brg1;
        h.info();
        System.out.println("");
        h = brg2;
        h.info();
        System.out.println("");
        h = mam;
        h.info(); 

    }

}
  
    