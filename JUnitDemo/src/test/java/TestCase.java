
import com.hkl.junitdemo.NTTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class TestCase {
    
    @BeforeAll
    public static void beforeAll() {
        System.out.println("BeforeAll");
    }
    
    @AfterAll
    public static void afterAll() {
        System.out.println("AfterAll");
    }
    
    @BeforeEach
    public void beforeEach() {
         System.out.println("BeforeEach");
    }
    
    @AfterEach
    public void afterEach() {
         System.out.println("AfterEach");
    }
    
    @Test
    @DisplayName("Kiem thu so chan nguyen to")
    public void test1(){
        int input = 2;
        boolean expected = true;
        boolean actual = NTTest.isNt(input);
        
        Assertions.assertEquals(expected, actual);
    }
    
    public void testEvenNumbers(int n){
        Assertions.assertFalse(NTTest.isNt(n));
    }
}
