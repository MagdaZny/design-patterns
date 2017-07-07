package strategy;

public class DuckClient {

    public static void main(String[] args){
//
//        Duck blackDuck = new BlackDuck();
//        blackDuck.introduce();
//        blackDuck.performFly();
//
//        RubberDuck rubberDuck  = new RubberDuck();
//        rubberDuck.introduce();
//        rubberDuck.performFly();

        Duck modelDuck = new ModelDuck();
        modelDuck.performFly();
        modelDuck.setBehaviour(new RocketFly());
        modelDuck.performFly();


    }
}
