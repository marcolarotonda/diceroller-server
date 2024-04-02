package io.github.marcolarotonda.diceroller.enumeration;

import lombok.Getter;

@Getter
public enum DiceType {

    D4(4),
    D6(6),
    D8(8),
    D10(10),
    D12(12),
    D20(20),
    D100(100);

    private final int size;

    DiceType(int size) {
        this.size = size;
    }


}
