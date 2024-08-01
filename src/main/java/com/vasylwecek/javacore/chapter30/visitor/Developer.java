package chapter30.visitor;

public interface Developer {
    public void create(ProjectClass projectClass);

    public void create(Database database);


    public void create(Test test);

}
