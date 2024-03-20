package kk.strategy_pattern.behaviour.quack;

public class MuteQuack implements QuackBehaviour {
    @Override
    public void quack() {
        //doesn't make sounds
    }
}
