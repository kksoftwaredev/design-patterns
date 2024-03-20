package kk.strategy_pattern.duck;

import kk.strategy_pattern.behaviour.fly.FlyWithWings;
import kk.strategy_pattern.behaviour.quack.Laughter;

public class FunnyDuck extends Duck {
    public FunnyDuck() {
        flyBehaviour = new FlyWithWings();
        quackBehaviour = new Laughter();
    }
}
