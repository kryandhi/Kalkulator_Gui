/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPraktikum;

/**
 *
 * @author KomangRyan
 */

   

class kendaraan{
    String warna, bahanbakar;
    int kapasitasmuatan;
    

    public kendaraan(String wn,String bb,int km){
        this.warna = wn;
        this.bahanbakar = bb;
        this.kapasitasmuatan = km;
    }
    
    void inpo(){
        System.out.println("warna : "+ warna);
        System.out.println("bahan bakar : "+ bahanbakar);
        System.out.println("kapasitasmuatan : "+ kapasitasmuatan);
    }
    
}

class kendaraan_darat extends kendaraan{
        int roda; 
         
          
           public kendaraan_darat(String wn,String bb,int km, int rd){
               super(wn,bb,km);
               this.roda = rd ;
           }
           void inpo(){
               super.inpo();
               System.out.println("jumlah roda : " + roda);
           }
}

class kendaraan_laut extends kendaraan{
        String jenisjangkar;
        
        
        public kendaraan_laut(String wn,String bb,int km,String jj){
               super(wn,bb,km);
               this.jenisjangkar = jj;
        }
        
        void inpo(){
             super.inpo();
             System.out.println("jenis jangkar : " + jenisjangkar);
        }
}

class sepeda_motor extends kendaraan_darat{
     String merk;
    
   
     public sepeda_motor(String wn,String bb,int km, int rd, String mk){
         super(wn,bb,km,rd);
                this.merk = mk;
                
     }  
            void inpo(){
         super.inpo();
         System.out.println("merk : " + merk);
         
     }
         
              
}

class perahu_layar extends kendaraan_laut{
    int jumlahlayar;
    
 
     public perahu_layar(String wn,String bb,int km,String jj,int jl){
            super(wn,bb,km,jj);
            this.jumlahlayar = jl;
     }
     
     void inpo(){
         super.inpo();
         System.out.println("jumlahlayar : " + jumlahlayar);
         
     }
}

