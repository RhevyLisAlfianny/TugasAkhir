/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasakhir;

/**
 *
 * @author Vivi Agustina
 */
public abstract class  AbsRestoran implements restoranProses{
    
    private String nama;
    
    public void nama(){
        this.nama ="Resto";
    }
    
    public abstract void pemesan();
    
    public int hitung(int harga, int jumlah){
        int totalBayar;
        totalBayar = harga*jumlah;
        return totalBayar;
    }
    
}
