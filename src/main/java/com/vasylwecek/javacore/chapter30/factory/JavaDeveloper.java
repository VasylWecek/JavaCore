package chapter30.factory;

import chapter30.bridge.Developer;

public class JavaDeveloper implements Developer {

    @Override
    public void writeCode() {
        System.out.println("Java Developer writes Java Code ...");

    }
}
