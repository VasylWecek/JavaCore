package chapter30.template;

public class WebsiteRunner {
    public static void main(String[] args) {
       WebsiteTemplate welcomePage = new WelcomePage();
       WebsiteTemplate newsPage = new NewsPage();

        welcomePage.showPage();

        System.out.println("\n====================================\n");

        newsPage.showPage();
    }
}
