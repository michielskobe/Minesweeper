package boardElementClasses;
public class Number extends BoardElement {
    protected final int value;
    public Number(ElementType elementType, int value) {
        super(elementType);
        this.value = value;
    }
    @Override
    public int getValue(){return value;}
}
