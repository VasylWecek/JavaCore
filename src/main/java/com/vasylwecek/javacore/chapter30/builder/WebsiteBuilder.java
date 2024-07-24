package chapter30.builder;

public abstract class WebsiteBuilder {
    Website website; // переменная экземпляра, хранит объект веб-сайта, который строится

    void createWebsite() {
        website = new Website();
    }

    abstract void buildName();
    abstract void buildCms();
    abstract void buildPrice();

    Website getWebsite() {
        return website;
    }
}
