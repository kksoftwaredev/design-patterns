package kk.strategy_pattern.behaviour.quack;

public class Squeak implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("Squeak sounds");
    }
}
