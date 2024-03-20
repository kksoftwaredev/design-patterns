package kk.strategy_pattern.behaviour.quack;

public class Laughter implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("Hahahahah");
    }
}
