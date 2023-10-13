package com.example.seccion1;

import com.example.demo.service.SmartPhoneService;
import com.example.demo.service.SmartPhoneServiceImpl;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class AAssertionsTest {

    @Test
    void count() {
        SmartPhoneService service = new SmartPhoneServiceImpl();

        Integer count = service.count();

        // Assertions
        assertNotNull(count);
        assertTrue(count > 0);
        assertEquals(3, count, "El numero de elementos esperado es 3");
        
    }
}
