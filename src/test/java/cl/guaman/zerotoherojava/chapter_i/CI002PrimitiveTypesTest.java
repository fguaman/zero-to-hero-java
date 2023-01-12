/*
 * Copyright 2023 Fabián Guamán
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
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
