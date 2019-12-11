/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasakhir;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Vivi Agustina
 */
public class MenuTest {
    
    public MenuTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        Menu instance = new Menu();
        instance.setId(id);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetId() {
        System.out.println("getId");
        Menu instance = new Menu();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetPilihanMenu() {
        System.out.println("getPilihanMenu");
        Menu instance = new Menu();
        String expResult = "";
        String result = instance.getPilihanMenu();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetPilihanMenu() {
        System.out.println("setPilihanMenu");
        String pilihanMenu = "";
        Menu instance = new Menu();
        instance.setPilihanMenu(pilihanMenu);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetHarga() {
        System.out.println("getHarga");
        Menu instance = new Menu();
        int expResult = 0;
        int result = instance.getHarga();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetHarga() {
        System.out.println("setHarga");
        int harga = 0;
        Menu instance = new Menu();
        instance.setHarga(harga);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetJumlahPesan() {
        System.out.println("getJumlahPesan");
        Menu instance = new Menu();
        int expResult = 0;
        int result = instance.getJumlahPesan();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetJumlahPesan() {
        System.out.println("setJumlahPesan");
        int jumlahPesan = 0;
        Menu instance = new Menu();
        instance.setJumlahPesan(jumlahPesan);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetTotalHarga() {
        System.out.println("getTotalHarga");
        Menu instance = new Menu();
        int expResult = 0;
        int result = instance.getTotalHarga();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetTotalHarga() {
        System.out.println("setTotalHarga");
        int totalHarga = 0;
        Menu instance = new Menu();
        instance.setTotalHarga(totalHarga);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetById() {
        System.out.println("getById");
        int id = 0;
        Menu instance = new Menu();
        Menu expResult = null;
        Menu result = instance.getById(id);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetAll() {
        System.out.println("getAll");
        Menu instance = new Menu();
        ArrayList<Menu> expResult = null;
        ArrayList<Menu> result = instance.getAll();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSave() {
        System.out.println("save");
        Menu instance = new Menu();
        instance.save();
        fail("The test case is a prototype.");
    }

    @Test
    public void testPemesan() {
        System.out.println("pemesan");
        Menu instance = new Menu();
        instance.pemesan();
        fail("The test case is a prototype.");
    }

    @Test
    public void testHitung() {
        System.out.println("hitung");
        int harga = 0;
        int jumlah = 0;
        Menu instance = new Menu();
        int expResult = 0;
        int result = instance.hitung(harga, jumlah);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
