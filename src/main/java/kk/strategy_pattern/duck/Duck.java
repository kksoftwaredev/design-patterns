package kk.strategy_pattern.duck;

import kk.strategy_pattern.behaviour.fly.FlyBehaviour;
import kk.strategy_pattern.behaviour.quack.QuackBehaviour;

abstract public class Duck {

    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;

    public void performFly(){
        flyBehaviour.fly();
    }
    public void performQuack(){
        quackBehaviour.quack();
    }
    void swim(){};
    public void display(){
        System.out.println("I am a "+ this.getClass().getSimpleName());
    };

    public FlyBehaviour getFlyBehaviour() {
        return flyBehaviour;
    }

    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }
}
