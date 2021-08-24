package javaClub.team3;
/*
* https://www.codewars.com/kata/5a03295680171ffd7b0000c7/
* */
public class Task12 extends Task{
    @Override
    void execute() {
    }

}

class EncapsulationDemo{
    private static final EncapsulationDemo singleton = new EncapsulationDemo();

    private int number;
    private String stringValue;
    private Object anObject;

    EncapsulationDemo(){
        number = 0;
        stringValue = null;
        anObject = null;
    }
    EncapsulationDemo(int number, String string, Object anObject) {
        setNumber(number);
        setStringValue(string);
        setAnObject(anObject);
    }

    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }

    public String getStringValue() {
        return stringValue;
    }
    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }

    public Object getAnObject() {
        return anObject;
    }
    public void setAnObject(Object anObject) {
        this.anObject = anObject;
    }
}