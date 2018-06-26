package textProcessor;

public class Main {
    public static void main(String [ ] args){
        Reader reader = new Reader("xmlHappyFile", new Factory());
        reader.read();
    }
}
