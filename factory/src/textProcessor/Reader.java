package textProcessor;

public class Reader{

    String type;
    Factory factory;
    Serializer serializer;

    public Reader(String type, Factory factory){
        this.type=type;
        this.factory = factory;
    }

    public void read() {
        serializer = factory.create(type);
        System.out.print(serializer.serialize());
    }
}


