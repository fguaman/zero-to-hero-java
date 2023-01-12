package cl.guaman.zerotoherojava.chapter_i;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author fguaman
 */
class CI002PrimitiveTypesTest {


    /**
     * The byte data type is an 8-bit signed two's complement integer.
     */
    @Test
    void thisIsAByte() {
        byte min = -128;
        byte max = 127;
        Assertions.assertEquals(-128, min);
        Assertions.assertEquals(127, max);
        Assertions.assertTrue(min < max);
    }

    /**
     * The short data type is a 16-bit signed two's complement integer.
     */
    @Test
    void thisIsAShort() {
        short min = -32_768;
        short max = 32_767;
        Assertions.assertEquals(-32_768, min);
        Assertions.assertEquals(32_767, max);
        Assertions.assertTrue(min < max);
    }
}
