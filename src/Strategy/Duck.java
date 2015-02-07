package Strategy;


public abstract class Duck {
    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;

    public abstract void display();
    public void swim(){};
    public void performFly(){
        flyBehaviour.fly();
    };
    public void performQuack(){
      quackBehaviour.quack();
    };

    public void setFlyBehaviour(FlyBehaviour fb) {
        flyBehaviour = fb;
    }

    public void setQuackBehaviour(QuackBehaviour qb) {
        quackBehaviour = qb;
    }
}

