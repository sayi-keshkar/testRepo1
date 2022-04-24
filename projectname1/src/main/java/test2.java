package main.java;

public class test2 extends testClass{
    @Override
    public String getStr() {
        // TODO Auto-generated method stub
        System.out.println("Calling from subclass");
        return super.getStr() + "from subclass";
    }
}
