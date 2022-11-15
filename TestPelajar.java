/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPraktikum;

/**
 *
 * @author KomangRyan
 */
public class TestPelajar {
    public static void main(String[] args) {
         Pelajar pelajar1 = new Pelajar("50022111099","Asep Solihin",65,41,22);
         Pelajar pelajar2 = new Pelajar("50022111100","George Nicholas",99,95,98);
         
         System.out.println("Data Mahasiswa 1 ");
         pelajar1.info();
         System.out.println("Data Mahasiswa 2 ");
         pelajar2.info();
         
    }
}
