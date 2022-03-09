/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hkl.junitdemo;

import java.util.InputMismatchException;

/**
 *
 * @author Admin
 */
public class NTTest {
    public static boolean isNt(int n) {
        if (n < 0)
            throw new InputMismatchException();

        if (n >= 2) {
            for (int i = 2; i < Math.sqrt(n); i++)
                if (n % i == 0)
                    return false;
            
            return true;
        }
        
        return false;
    }
}
