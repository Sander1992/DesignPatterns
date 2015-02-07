package Strategy;

/**
 * Created by Sander on 07.02.2015.
 */
public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallarDuck = new MallarDuck();

        mallarDuck.performQuack();
        mallarDuck.performFly();
        mallarDuck.display();
    }
}
