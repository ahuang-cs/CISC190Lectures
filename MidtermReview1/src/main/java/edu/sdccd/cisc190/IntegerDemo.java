package edu.sdccd.cisc190;

public class IntegerDemo {
    private int primitiveInt;
    private Integer wrapperInt;

    public IntegerDemo(int newInt) {
        primitiveInt = newInt;
        wrapperInt = new Integer(newInt);
    }

    public static int primitivePassByTest(int newInt) {
        newInt = 100;
        return newInt;
    }

    public static Integer wrapperPassByTest(Integer newInteger) {
        newInteger = 200;
        return newInteger;
    }

    public int getPrimitiveInt() {
        return primitiveInt;
    }

    public void setPrimitiveInt(int primitiveInt) {
        this.primitiveInt = primitiveInt;
    }

    public Integer getWrapperInt() {
        return wrapperInt;
    }

    public void setWrapperInt(Integer wrapperInt) {
        this.wrapperInt = wrapperInt;
    }
}
