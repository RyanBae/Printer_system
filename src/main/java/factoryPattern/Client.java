package factoryPattern;

public class Client {
    public static void main(String[] args) {
        ClassA classA = new ClassA();
        classA.createType("A");
        classA.createType("C");

        ClassB classB = new ClassB();
        classB.crateType("B");
    }
}
