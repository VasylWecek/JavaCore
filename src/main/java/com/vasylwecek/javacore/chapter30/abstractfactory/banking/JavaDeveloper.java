package chapter30.abstractfactory.banking;

import chapter30.abstractfactory.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java Developer writes Java code ...");
    }
}
