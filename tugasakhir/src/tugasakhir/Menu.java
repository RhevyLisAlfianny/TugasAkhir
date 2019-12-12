/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasakhir;
import java.util.*;
import java.sql.*;
/**
 *
 * @author ELA-PC
 */
public class Menu extends AbsRestoran{
    public String pilihanMenu;
    public int id;
    public int harga;
    public int jumlahPesan;
    public int totalHarga;
    
    
    Menu(){
        
    }
    
    Menu(String pilihanMenu, int harga, int jumlahPesan, int totalHarga) {
        this.pilihanMenu = pilihanMenu;
        this.harga = harga;
        this.jumlahPesan = jumlahPesan;
        this.totalHarga = totalHarga;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public String getPilihanMenu() {
        return pilihanMenu;
    }

    public void setPilihanMenu(String pilihanMenu) {
        this.pilihanMenu = pilihanMenu;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getJumlahPesan() {
        return jumlahPesan;
    }

    public void setJumlahPesan(int jumlahPesan) {
        this.jumlahPesan = jumlahPesan;
    }

    public int getTotalHarga() {
        return totalHarga;
    }

    public void setTotalHarga(int totalHarga) {
        this.totalHarga = totalHarga;
    }
    public Menu getById(int id) {
        Menu m = new Menu();
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM menu " + " WHERE id = '" + id + "'");

        try {
            while (rs.next()) {
                m = new Menu();
                m.setId(rs.getInt("id"));
                m.setPilihanMenu(rs.getString("pilihan_menu"));
                m.setHarga(rs.getInt("harga"));
                m.setJumlahPesan(rs.getInt("jumlah_pesan"));
                m.setTotalHarga(rs.getInt("total_harga"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return m;
    }
    
     public ArrayList<Menu> getAll() {
        ArrayList<Menu> ListPilihanMenu = new ArrayList();
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM menu");
        try {
            while(rs.next()) {
            Menu m = new Menu();
            //m.setId(rs.getInt("idpeminjaman"));
            m.setId(rs.getInt("id"));
            m.setPilihanMenu(rs.getString("pilihan_menu"));
            m.setHarga(rs.getInt("harga"));
            m.setJumlahPesan(rs.getInt("jumlah_pesan"));
            m.setTotalHarga(rs.getInt("total_harga"));
           
            ListPilihanMenu.add(m);
            }
        }
        catch(Exception e) {
             e.printStackTrace();
        }
        return ListPilihanMenu;
    }
     public void save(){
        if(getById(id).getId() == 0){
           String sql = "INSERT INTO menu (pilihan_menu, harga, jumlah_pesan, total_harga) "
                        + "values ("
                        + "'" + this.getPilihanMenu()+"', "
                        + "'" + this.getHarga()+ "',"
                        + "'" + this.getJumlahPesan() + "', "
                        + "'" +this.getTotalHarga() + "' "
                        + ")";
            this.id = DBHelper.insertQueryGetId(sql);
        }else{
            String SQL = "Update menu set"
                   + " pilihan_menu = '" +this.pilihanMenu +"', "
                   + " harga = '" +this.harga  +"', "
                   + " jumlah_pesan = '"+this.jumlahPesan+"' "
                   + " total_harga = '"+this.totalHarga+"' "
                   + "Where id = '"+this.id+"'";
            DBHelper.executeQuery(SQL);
        }
    }

    @Override
    public void pemesan() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int hitung(int harga, int jumlah) {
        int totalBayar;
        totalBayar = harga*jumlah;
        return totalBayar;
    }
}
