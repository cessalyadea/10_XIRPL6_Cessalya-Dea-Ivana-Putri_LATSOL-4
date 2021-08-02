/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package belajar3;

/**
 *
 * @author LENOVO
 */
public class Belajar3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int sukupertama = 5;
        int selisih = 5;
        int nilaiakhir = 5;
        int updatenilai;
        int totalnilai;
        
        System.out.println("Deret Aritmatika");
        
        for (int i=0; i<5; i++){
             for(int a=0; a<i; a++){
                 
                 updatenilai = sukupertama;
                 sukupertama += selisih;
                 
                 System.out.print(" " + updatenilai);
                 
                
             }
             System.out.println(" ");
        
      
        }
        
       
    }
    
}
        
        