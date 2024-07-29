package chapter30.adapter;

public class AdapterJavaToDataBase extends JavaAplication implements DataBase{
    @Override
    public void insert() {
        saveObject();
    }

    @Override
    public void update() {
updateObject();
    }

    @Override
    public void select() {
loadObject();
    }

    @Override
    public void remove() {
deleteObject();
    }
}
