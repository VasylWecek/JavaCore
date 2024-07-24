package chapter30.abstractfactory.website;

import chapter30.abstractfactory.Developer;

public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Php developer writes php code ...");
    }
}
