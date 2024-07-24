package chapter30.abstractfactory;

/**
 *  Определяет методы для получения объектов разработчика,
 *  тестировщика и менеджера проекта.
 */
public interface ProjectTeamFactory {
    Developer getDeveloper();
    Tester getTester();
    ProjectManager getProjectManager();

}
