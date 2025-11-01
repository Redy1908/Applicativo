package it.unina.Applicativo.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExampleTest {

    @Test
    void testGetExample() {
        String example = "example";
        Example ex = new Example(example);

        String retrivedExample = ex.getExample();

        assertEquals(example, retrivedExample, "getExample() got an invalid example.");
    }
    
}
