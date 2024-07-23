package chapter30.factory;

public class JavaDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper(){
        return new JavaDeveloper1();
    }
}
