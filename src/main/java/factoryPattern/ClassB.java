package factoryPattern;

public class ClassB {
    public Type crateType(String type){
        TypeFactory factory = new TypeFactory();
        Type returnType = factory.createType(type);
        return returnType;
    }
}
