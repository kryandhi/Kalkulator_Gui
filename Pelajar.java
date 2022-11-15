/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPraktikum;

/**
 *
 * @author KomangRyan
 */
public class Pelajar {
    private String nip;
    private String nama;
    private double nilaiUjian1;
    private double nilaiUjian2;
    private double nilaiTugas;
    
    
    Pelajar(String nip, String nama, double nilaiUjian1, double nilaiUjian2, double nilaiTugas){
       this.nip = nip;
       this.nama = nama;
       this.nilaiUjian1 = nilaiUjian1;
       this.nilaiUjian2 = nilaiUjian2;
       this.nilaiTugas = nilaiTugas;

    }

    
   double nilaiAkhir(){
       return (0.4*this.nilaiUjian1+0.4*this.nilaiUjian2+0.2*this.nilaiTugas);
   }
   
   void kelulusan(){
       if(nilaiAkhir()>=60){
           System.out.println("lulus");
       }
       else
           System.out.println("tidak lulus");
   }
   
      void info(){
    
       System.out.println("NIP : " + nip);
       System.out.println("Nama : " + nama);
       System.out.println("Nilai Kuis 1 : " + nilaiUjian1);
       System.out.println("Nilai Kuis 2 : " + nilaiUjian2);
       System.out.println("Nilai Tugas : " + nilaiTugas);
       System.out.println("Nilai Akhir : " + nilaiAkhir());
       kelulusan();
       System.out.println("");
   }
}  


