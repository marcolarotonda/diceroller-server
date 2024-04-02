package io.github.marcolarotonda.diceroller.model;

import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Getter
@ToString
public class Result {

    private final List<Integer> singleResults = new ArrayList<>();
    private int total;

    public void addResult(int i) {
        singleResults.add(i);
        sum(i);
    }

    public void sum(int i) {
        total += i;
    }

}
