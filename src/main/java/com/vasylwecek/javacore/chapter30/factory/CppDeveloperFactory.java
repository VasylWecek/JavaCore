package chapter30.factory;

public class CppDeveloperFactory implements DeveloperFactory{
    @Override
    public Developer createDeveloper(){
        return new CppDeveloper1();
    }
}
