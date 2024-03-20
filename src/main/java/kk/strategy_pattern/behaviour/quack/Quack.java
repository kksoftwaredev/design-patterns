package kk.strategy_pattern.behaviour.quack;

public class Quack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("Quack sounds");
    }
}
