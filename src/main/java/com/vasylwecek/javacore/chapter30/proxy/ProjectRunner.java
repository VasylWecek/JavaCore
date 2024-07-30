package chapter30.proxy;

public class ProjectRunner {
    public static void main(String[] args) {
        Project project = new ProxyProject("https://github.com/VasylWecek/Simple-Draw/blob/main/Main.java");


        project.run();


    }
}
