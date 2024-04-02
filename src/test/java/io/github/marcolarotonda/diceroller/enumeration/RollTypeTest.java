package io.github.marcolarotonda.diceroller.enumeration;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RollTypeTest {

    @Test
    void shouldReturnValueOfAdvantage() {
        RollType type = RollType.valueOf("ADVANTAGE");
        assertThat(type).isEqualTo(RollType.ADVANTAGE);
    }

    @Test
    void shouldReturnValueOfDisadvantage() {
        RollType type = RollType.valueOf("DISADVANTAGE");
        assertThat(type).isEqualTo(RollType.DISADVANTAGE);
    }

    @Test
    void shouldReturnValueOfNormal() {
        RollType type = RollType.valueOf("NORMAL");
        assertThat(type).isEqualTo(RollType.NORMAL);
    }
}
