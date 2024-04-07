package io.github.marcolarotonda.dicerollerserver.service;

import io.github.marcolarotonda.dicerollerutil.enumeration.DiceType;
import io.github.marcolarotonda.dicerollerutil.model.RollOption;
import io.github.marcolarotonda.dicerollerutil.model.RollResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class DiceRollerService {

    private final BasicDiceRollerService basicDiceRollerService;

    @Autowired
    public DiceRollerService(BasicDiceRollerService basicDiceRollerService) {
        this.basicDiceRollerService = basicDiceRollerService;
    }

    public RollResult roll(RollOption rollEntity) {
        RollResult result = new RollResult();
        DiceType diceType = rollEntity.getDiceType();

        for (int i = 0; i < rollEntity.getQuantity(); i++) {
            int rollResult = basicDiceRollerService.roll(diceType, rollEntity.getRollType(), rollEntity.isMerit());
            result.addResult(rollResult);
        }

        result.sum(rollEntity.getModifier());

        return result;
    }


}
