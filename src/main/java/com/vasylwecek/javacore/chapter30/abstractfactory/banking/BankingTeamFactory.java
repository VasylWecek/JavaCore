package chapter30.abstractfactory.banking;
/**
 * Реализует методы для создания команды банковского проекта,
 * возвращая разработчика на Java, QA тестировщика и менеджера
 * банковского проекта.
 */

import chapter30.abstractfactory.Developer;
import chapter30.abstractfactory.ProjectManager;
import chapter30.abstractfactory.ProjectTeamFactory;
import chapter30.abstractfactory.Tester;

public class BankingTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper(){
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester(){
        return new QATester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new BankingPM();
    }

}
