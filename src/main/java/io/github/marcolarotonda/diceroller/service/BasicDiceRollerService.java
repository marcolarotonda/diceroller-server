package io.github.marcolarotonda.diceroller.service;

import io.github.marcolarotonda.diceroller.enumeration.DiceType;
import io.github.marcolarotonda.diceroller.enumeration.RollType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class BasicDiceRollerService {

    private final Random random;

    @Autowired
    public BasicDiceRollerService(Random random) {
        this.random = random;
    }

    public int roll(DiceType dice, RollType rollType) {
        int result;
        if (rollType.equals(RollType.ADVANTAGE)) {
            result = advantageRoll(dice);
        } else if (rollType.equals(RollType.DISADVANTAGE)) {
            result = disadvantageRoll(dice);
        } else {
            result = roll(dice);
        }
        return result;
    }

    public int roll(DiceType dice) {
        return random.nextInt(1, dice.getSize() + 1);
    }

    public int advantageRoll(DiceType dice) {
        return Math.max(roll(dice), roll(dice));
    }

    public int disadvantageRoll(DiceType dice) {
        return Math.min(roll(dice), roll(dice));
    }


}
