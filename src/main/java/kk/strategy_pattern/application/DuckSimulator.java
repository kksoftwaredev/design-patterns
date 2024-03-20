package kk.strategy_pattern.application;

import kk.strategy_pattern.behaviour.fly.FlyWithRocketFuel;
import kk.strategy_pattern.duck.DecoyDuck;
import kk.strategy_pattern.duck.Duck;

public class DuckSimulator {
    public static void main(String[] args) {
        Duck duck = new DecoyDuck();
        duck.display();
        duck.performFly();
        duck.performQuack();
        duck.setFlyBehaviour(new FlyWithRocketFuel());
        duck.performFly();
    }
}
