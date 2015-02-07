package Strategy;

/**
 * Created by Sander on 07.02.2015.
 */
public class ModelDuck extends Duck {

    public ModelDuck(){
        flyBehaviour = new FlyNoWay();
        quackBehaviour = new Quack();

    }
    @Override
    public void display() {

    }
}
