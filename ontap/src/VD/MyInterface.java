package VD;

public interface MyInterface {
    int getValue();

    default int calculateValue(){
        return getValue()+5;
    }
}
