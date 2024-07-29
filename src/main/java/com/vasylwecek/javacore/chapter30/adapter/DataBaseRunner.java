package chapter30.adapter;

public class DataBaseRunner {
    public static void main(String[] args) {
        DataBase database = new AdapterJavaToDataBase();

        database.insert();
        database.select();
        database.update();
        database.remove();
    }
}
