package chapter30.abstractfactory.banking;

import chapter30.abstractfactory.ProjectManager;

public class BankingPM implements ProjectManager {
    @Override
    public void manageProject(){
        System.out.println("Banking PM manages banking project ...");
    }

}
