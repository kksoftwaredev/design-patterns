package kk.strategy_pattern.duck;

import kk.strategy_pattern.behaviour.fly.FlyNoWay;
import kk.strategy_pattern.behaviour.quack.MuteQuack;

public class DecoyDuck extends Duck {
    public DecoyDuck() {
        flyBehaviour = new FlyNoWay();
        quackBehaviour = new MuteQuack();
    }

}
