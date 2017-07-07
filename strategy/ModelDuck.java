package strategy;

public class ModelDuck extends Duck{

    public ModelDuck(){
        behaviour = new CanNotFly();
    }

    public void introduce() {
        System.out.println("I am a model duck");
    }
}
