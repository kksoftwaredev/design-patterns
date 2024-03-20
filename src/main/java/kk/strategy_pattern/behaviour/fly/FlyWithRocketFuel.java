package kk.strategy_pattern.behaviour.fly;

public class FlyWithRocketFuel implements FlyBehaviour{
    @Override
    public void fly() {
        System.out.println("Woo hoo! I can fly now!!!");
    }
}
