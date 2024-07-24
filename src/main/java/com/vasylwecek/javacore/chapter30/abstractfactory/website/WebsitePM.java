package chapter30.abstractfactory.website;

import chapter30.abstractfactory.ProjectManager;

public class WebsitePM implements ProjectManager {
    @Override
    public void manageProject(){
        System.out.println("Website PM manages Website project ...");
    }

}
