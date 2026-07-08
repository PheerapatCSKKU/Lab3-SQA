package sqa.lab;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class ShiftCipherTest {

    private final ShiftCipher cipher = new ShiftCipher();

    // TC01 : message = "SOFTWARE", key = 3  -> คาดหวัง "ZVMADHYL" (ตาม template)
    @Test
    void tc01_SOFTWARE_key3() {
        assertEquals("ZVMADHYL", cipher.shift("SOFTWARE", 3));
    }

    // TC02 : message = "software", key = 3  -> คาดหวัง "zvmadhyl" (ตาม template)
    @Test
    void tc02_software_key3() {
        assertEquals("zvmadhyl", cipher.shift("software", 3));
    }

    // TC03 : message = "XYZ", key = 3  -> คาดหวัง "ABC" (positive: วนรอบ)
    @Test
    void tc03_XYZ_key3_positive() {
        assertEquals("ABC", cipher.shift("XYZ", 3));
    }

    // TC04 : message = "ABC@", key = 3  -> คาดหวัง "invalid" (negative: อักขระพิเศษ)
    @Test
    void tc04_specialChar_key3_negative() {
        assertEquals("invalid", cipher.shift("ABC@", 3));
    }
}
