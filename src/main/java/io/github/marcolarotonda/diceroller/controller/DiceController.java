package io.github.marcolarotonda.diceroller.controller;

import io.github.marcolarotonda.diceroller.model.Result;
import io.github.marcolarotonda.diceroller.model.RollOption;
import io.github.marcolarotonda.diceroller.service.DiceRollerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api")
public class DiceController {

    private final DiceRollerService diceRollerService;

    @Autowired
    public DiceController(DiceRollerService diceRollerService) {
        this.diceRollerService = diceRollerService;
    }


    @PostMapping(value = "/roll", consumes = {"application/json"})
    public Result rollDice(@RequestBody RollOption rollOption) {
        return diceRollerService.roll(rollOption);
    }


}
