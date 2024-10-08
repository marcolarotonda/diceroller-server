package io.github.marcolarotonda.dicerollerserver.controller;


import io.github.marcolarotonda.dicerollerserver.service.DiceRollerService;
import io.github.marcolarotonda.dicerollerutil.model.RollResult;
import io.github.marcolarotonda.dicerollerutil.model.RollOption;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import io.github.marcolarotonda.dicerollerutil.enumeration.RollType;
import io.github.marcolarotonda.dicerollerutil.enumeration.DiceType;

import java.util.Optional;


@RestController
@RequestMapping("/diceroller")
public class DiceController {

    private final DiceRollerService diceRollerService;

    @Autowired
    public DiceController(DiceRollerService diceRollerService) {
        this.diceRollerService = diceRollerService;
    }


    @GetMapping(value = "/roll")
    public RollResult rollDice(@RequestParam DiceType diceType,
                           @RequestParam(required = false) Optional<RollType> rollType,
                           @RequestParam(required = false) Optional<Integer> quantity,
                           @RequestParam(required = false) Optional<Integer> modifier,
                           @RequestParam(required = false) Optional<Boolean> merit) {
        RollOption rollOption = new RollOption();
        rollOption.setDiceType(diceType);
        rollType.ifPresent(rollOption::setRollType);
        quantity.ifPresent(rollOption::setQuantity);
        modifier.ifPresent(rollOption::setModifier);
        merit.ifPresent(rollOption::setMerit);

        return diceRollerService.roll(rollOption);
    }


}
