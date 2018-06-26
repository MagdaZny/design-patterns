package textProcessor;

public class Factory {

    public Serializer create(String type){
        if (type.contains("xml")) return new xmlSerializer();
        else return new yamlSerializer();
    }
}
