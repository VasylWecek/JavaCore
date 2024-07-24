package chapter30.abstractfactory.website;

import chapter30.abstractfactory.Tester;

public class ManualTester implements Tester {
    @Override
    public void testCode(){
        System.out.println("Manual tester tests website ...");
    }
}
