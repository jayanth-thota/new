package junit4;
//package com.javatpoint.testcase;  

import static org.junit.Assert.*;  
//import com.javatpoint.logic.*;  
import org.junit.Test;  
  
 class TestLogic {  
  
    @Test  
    public void testFindMax(){  
        assertEquals(4,J1example.findMax(new int[]{1,3,4,2}));  
        assertEquals(-1,J1example.findMax(new int[]{-12,-1,-3,-4,-2}));  
    }  
}  