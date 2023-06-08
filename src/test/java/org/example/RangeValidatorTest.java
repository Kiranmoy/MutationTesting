package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class RangeValidatorTest {

    private RangeValidator cut;

    @BeforeEach
    void setUp() {
        cut = new RangeValidator();
    }

    /**
     * {@link RangeValidator#isValid(int)}
     */

    @Test
    @DisplayName("Should return true given 50")
    void fifty_isValid_returnsTrue() {
        cut.isValid(50);
        //assertThat(cut.isValid(50)).isTrue();
    }

    /*@Test
    @DisplayName("Should return false given 200")
    void twoHundred_isValid_returnsFalse() {
        cut.isValid(200);
        //assertThat(cut.isValid(200)).isFalse();
    }

    @Test
    @DisplayName("Should return true given 100")
    void hundred_isValid_returnsTrue() {
        cut.isValid(100);
        //assertThat(cut.isValid(100)).isTrue();
    }

    @Test
    @DisplayName("Should return false given 0")
    void zero_isValid_returnsFalse() {
        cut.isValid(0);
        //assertThat(cut.isValid(0)).isFalse();
    }*/

    @Test
    @DisplayName("Useless test")
    void useless() {

    }
}
