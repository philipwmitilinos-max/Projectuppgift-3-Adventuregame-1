package se.sprinto.hakan.adventuregame.view;

import java.util.LinkedList;
import java.util.Queue;

public class FakeUI implements UI {
    private final Queue<String> inputs = new LinkedList<>();
    private String lastInput;

    public void addInput(String input) {
        inputs.add(input);
    }

    @Override
    public void showMessage(String message) {

    }

    @Override
    public String getInput(String prompt) {
        if (inputs.isEmpty()) {
            return lastInput != null ? lastInput : "";
        }
        lastInput = inputs.poll();
        return lastInput;
    }
}