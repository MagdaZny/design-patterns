package strategy;

public abstract class Duck {


    FlyBehaviour behaviour;

    public void swim(){
        System.out.println("I am swimming");
    }

    public abstract void introduce();

    public void performFly(){
        behaviour.fly();
    }

    public FlyBehaviour getBehaviour() {
        return behaviour;
    }

    public void setBehaviour(FlyBehaviour behaviour) {
        this.behaviour = behaviour;
    }
}
