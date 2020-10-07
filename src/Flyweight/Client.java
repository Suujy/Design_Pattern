package Flyweight;

public class Client {

    public static void main(String[] args) {
        WebsiteFactory factory = new WebsiteFactory();
        WebSite website1 = factory.getWebsiteCategory("news");
        WebSite website2 = factory.getWebsiteCategory("blog");
        WebSite website3 = factory.getWebsiteCategory("blog");
        WebSite website4 = factory.getWebsiteCategory("blog");

        website1.use(new User("tom"));
        website2.use(new User("jack"));
        website3.use(new User("smith"));
        website4.use(new User("sjy"));

        System.out.println(factory.getWebSiteCount());
    }
}
