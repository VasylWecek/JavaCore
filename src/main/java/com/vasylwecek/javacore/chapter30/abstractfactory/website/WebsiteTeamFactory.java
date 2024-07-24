package chapter30.abstractfactory.website;
/**
 * Реализует методы для создания команды проекта веб-сайта,
 * возвращая разработчика на PHP, ручного тестировщика и
 * менеджера проекта веб-сайта.
 */

import chapter30.abstractfactory.Developer;
import chapter30.abstractfactory.ProjectManager;
import chapter30.abstractfactory.ProjectTeamFactory;
import chapter30.abstractfactory.Tester;

public class WebsiteTeamFactory implements ProjectTeamFactory {

    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new WebsitePM();
    }
}
