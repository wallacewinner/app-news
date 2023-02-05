package com.win.appnews.utils;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

public class ValidateUtilsTest {
    ValidateUtils validateUtils = new ValidateUtils();

    @Test
    public void isValidNameTest() {
        assertTrue(validateUtils.isValidName("Visconde de Sabugosa"));
        assertTrue(validateUtils.isValidName("Emília Condessa de três estrelinhas"));
        assertFalse(validateUtils.isValidName("Emília"));
        assertFalse(validateUtils.isValidName("Narizinho "));
        assertFalse(validateUtils.isValidName(null));
        assertFalse(validateUtils.isValidName("  "));
        assertFalse(validateUtils.isValidName(""));
    }
}
