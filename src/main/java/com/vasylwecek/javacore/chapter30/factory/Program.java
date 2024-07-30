package chapter30.factory;


public class Program {
    public Program(JavaDeveloper javaDeveloper) {
    }

    public Program(CppDeveloper cppDeveloper) {
    }

    public static void main(String[] args) {
       // JavaDeveloper javaDeveloper = new JavaDeveloper();
        // javaDeveloper.writeJavaCode();

        //example cpp
       // CppDeveloper cppDeveloper = new CppDeveloper();
       // cppDeveloper.writeCppCode();

        //Developer developer = new JavaDeveloper1();
        //developer.writeCode();

       // Developer developer = new CppDeveloper1();
        // developer.writeCode();

/**
 * Метод createDeveloperBySpecialty в классе Program выбирает соответствующую
 * фабрику на основе переданной специальности (specialty) и создаёт объект
 * разработчика с использованием этой фабрики.
  */
    DeveloperFactory developerFactory = createDeveloperBySpecialty("php");
    Developer developer = developerFactory.createDeveloper();

        developer.writeCode();
    }

    static DeveloperFactory createDeveloperBySpecialty(String specialty) {
        if (specialty.equalsIgnoreCase("java")){
            return new JavaDeveloperFactory();
        }else if (specialty.equalsIgnoreCase("c++")){
            return new CppDeveloperFactory();
        }else if (specialty.equalsIgnoreCase("php")){
            return new PhpDeveloperFactory();
        }else {
            throw new RuntimeException(specialty + " is not a valid specialty");
        }
    }

    public void developProgram() {

    }
}
