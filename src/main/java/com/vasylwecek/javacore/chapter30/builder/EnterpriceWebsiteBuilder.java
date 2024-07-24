package chapter30.builder;

public class EnterpriceWebsiteBuilder extends WebsiteBuilder{
    @Override
    void buildCms() {
        website.setCms(Cms.ALIFRESCO);
    }

    @Override
    void buildName() {
website.setName("Enterprice Website");
    }

    @Override
    void buildPrice() {
website.setPrice(10000);
    }
}
