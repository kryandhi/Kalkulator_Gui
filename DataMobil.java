/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPraktikum;

/**
 *
 * @author KomangRyan
 */
public class DataMobil {
    private String merk;
    private String warna;
    private String jenis;
    private int cc;
    private int penumpang;


public DataMobil(String mrk,String wn,String jns, int cc, int png){
    this.merk = mrk;
    this.warna = wn ;
    this.jenis = jns;
    this.cc = cc;
    this.penumpang = png;
}
    


void setA(String mrk){
        this.merk = mrk;
}

String getA(){
    return this.merk;
}

void setB(String wn){
       this.warna = wn;
}

String getB(){
     return this.warna;
}

void setC(String jns){
        this.jenis = jns;
}

String getC(){
       return this.jenis;
}

void setD(int cc){
        this.cc = cc;
}

int getD(){
        return this.cc;
}


void setE(int png){
          this.penumpang = png;
}

int getE(){
        return this.penumpang;
}

void infoMobil(){
    System.out.println(" ");
    System.out.println(" Merk : " + getA() );
    System.out.println(" Warna : " + getB() );
    System.out.println(" Jenis : " + getC() );
    System.out.println(" CC : " + getD() );
    System.out.println(" Kapasitas Penumpang : " + getE() );
    System.out.println("        ");
}
}


