package com.win.appnews.utils;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class NormalizeUtilsTest {
    
    NormalizeUtils normalizeUtils = new NormalizeUtils();

    @Test
    public void normalizeValueTest(){
        var name = "Marquês de Rabicó ";
        assertEquals("marques de rabico", normalizeUtils.normalizeValue(name));
    }
    
}
