package cl.guaman.zerotoherojava.chapter_i;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author fguaman
 */
class CI001MyFirstTest {

    /**
     * Manners make the person
     */
    @Test
    void mannersMakeThePerson() {
        String message = "Hello world!";
        Assertions.assertEquals("Hello world!", message);
    }
}
