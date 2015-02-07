package Strategy;

/**
 * Created by Sander on 07.02.2015.
 */
public class MallarDuck extends Duck {
    public MallarDuck() {
        quackBehaviour = new Quack();
        flyBehaviour = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("Im real malllard duck");
    }
}
