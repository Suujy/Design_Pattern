package Flyweight;

public class ConcreteWebsite extends WebSite{

    private String type = "";

    public ConcreteWebsite(String type) {
        this.type = type;
    }

    @Override
    public void use(User user) {
        System.out.println("网站的发布形式为 : " + type + ", User : " + user.getName());
    }
}
