/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasakhir;

import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author ELA-PC
 */
public class Restoran {
    public int id;
    public String namaPemesan;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNamaPemesan() {
        return namaPemesan;
    }

    public void setNamaPemesan(String namaPemesan) {
        this.namaPemesan = namaPemesan;
    }
    
     public Restoran getById(int id) {
        Restoran r = new Restoran();
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM restoran " + " WHERE id = '" + id + "'");

        try {
            while (rs.next()) {
                r = new Restoran();
                r.setId(rs.getInt("id"));
                r.setNamaPemesan(rs.getString("nama_pemesanan"));
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return r;
    }
     public ArrayList<Restoran> getAll() {
        ArrayList<Restoran> ListPemesan = new ArrayList();
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM restoran");
        try {
            while(rs.next()) {
            Restoran r = new Restoran();
            
            //m.setId(rs.getInt("idpeminjaman"));
            r.setId(rs.getInt("id"));
            r.setNamaPemesan(rs.getString("nama_pemesanan"));
            
            ListPemesan.add(r);
            }
        }
        catch(Exception e) {
             e.printStackTrace();
        }
        return ListPemesan;
    }
     public void save(){
        if(getById(id).getId() == 0){
           String sql = "INSERT INTO restoran (nama_pemesanan) "
                        + "values ("
                        + "'" + this.getNamaPemesan()+"')";
            this.id = DBHelper.insertQueryGetId(sql);
        }else{
            String SQL = "Update restoran set"
                   + " nama_pemesanan = '" +this.namaPemesan+"', ";
               
            DBHelper.executeQuery(SQL);
        }
    }
    
}
