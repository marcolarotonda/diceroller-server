package io.github.marcolarotonda.diceroller.enumeration;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class DiceTypeTest {

    @Test
    void shouldReturnValueOfD4() {
        DiceType type = DiceType.valueOf("D4");
        assertThat(type).isEqualTo(DiceType.D4);
    }

    @Test
    void shouldReturnValueOfD6() {
        DiceType type = DiceType.valueOf("D6");
        assertThat(type).isEqualTo(DiceType.D6);
    }

    @Test
    void shouldReturnValueOfD8() {
        DiceType type = DiceType.valueOf("D8");
        assertThat(type).isEqualTo(DiceType.D8);
    }

    @Test
    void shouldReturnValueOfD10() {
        DiceType type = DiceType.valueOf("D10");
        assertThat(type).isEqualTo(DiceType.D10);
    }

    @Test
    void shouldReturnValueOfD12() {
        DiceType type = DiceType.valueOf("D12");
        assertThat(type).isEqualTo(DiceType.D12);
    }

    @Test
    void shouldReturnValueOfD20() {
        DiceType type = DiceType.valueOf("D20");
        assertThat(type).isEqualTo(DiceType.D20);
    }

    @Test
    void shouldReturnValueOfD100() {
        DiceType type = DiceType.valueOf("D100");
        assertThat(type).isEqualTo(DiceType.D100);
    }
}
