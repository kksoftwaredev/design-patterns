package kk.strategy_pattern.duck;

import kk.strategy_pattern.behaviour.fly.FlyNoWay;
import kk.strategy_pattern.behaviour.quack.Squeak;

public class RubberDuck extends Duck {
    public RubberDuck() {
        flyBehaviour = new FlyNoWay();
        quackBehaviour = new Squeak();
    }
}
