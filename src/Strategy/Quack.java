package Strategy;

/**
 * Created by Sander on 07.02.2015.
 */
public class Quack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("Quack!!!");
    }
}
