package chapter30.bridge;

import chapter30.bridge.Program;
import chapter30.bridge.JavaDeveloper;
import chapter30.bridge.CppDeveloper;
import chapter30.bridge.Developer;
public class ProgramCreator {
    public static void main(String[] args) {
        Program [] programs = {
                new BankSystem(new JavaDeveloper()),
                new StockExchange(new CppDeveloper())
        };

        for (Program program: programs) {
            program.developProgram();
        }

    }
}
