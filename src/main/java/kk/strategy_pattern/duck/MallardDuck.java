package kk.strategy_pattern.duck;

import kk.strategy_pattern.behaviour.fly.FlyWithWings;
import kk.strategy_pattern.behaviour.quack.Quack;

public class MallardDuck extends Duck {
    public MallardDuck() {
        flyBehaviour = new FlyWithWings();
        quackBehaviour = new Quack();
    }
}
