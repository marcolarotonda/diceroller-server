package io.github.marcolarotonda.diceroller.model;

import io.github.marcolarotonda.diceroller.enumeration.DiceType;
import io.github.marcolarotonda.diceroller.enumeration.RollType;
import lombok.Data;


@Data
public class RollOption {

    private DiceType diceType;
    private RollType rollType = RollType.NORMAL;
    private int quantity = 1;
    private int modifier = 0;
    private boolean merit = false;

}
