package strategy;

public class BlackDuck extends Duck{


    public BlackDuck() {

        behaviour = new FlyWithWings();
    }

    public void introduce() {

        System.out.println("I am a black duck");
    }
}
