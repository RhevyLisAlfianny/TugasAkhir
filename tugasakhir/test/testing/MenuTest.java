/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testing;

import static com.sun.org.apache.regexp.internal.RETest.test;
import java.awt.Menu;
import static java.awt.SystemColor.menu;
import java.util.ArrayList;
import static jdk.nashorn.internal.objects.Global.instance;
import static jdk.nashorn.internal.objects.NativeRegExp.test;
import junit.framework.TestCase;
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
public class MenuTest extends TestCase {
    
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
        Menu instance = new Menu("Ayam Goreng");
        System.out.format("Start Testing : %s \n", this.getName());
    }
    
    @After
    public void tearDown() {
        System.out.format("Finish Tes %s\n", this.getName());
    }
    
    public void testSearch(){
        System.out.println("search test menu");
        String keyword = "nasi goreng";
       //ArrayList<Menu> result = instance.search(keyword);
       //ArrayList<Menu> expresult = instance.search(keyword);
       //assertEquals(expResult.size(), result.size());
    }
    
    @Test
    public void testSave(){
        System.out.println("save test Menu");
        //this.instance.save();
        //ArrayList<Menu> exResult - instance.getById(instance.getName());
        //assertTrue(expResult.size()>0);
    }
     // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
