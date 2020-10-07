package Flyweight;

import java.util.HashMap;

public class WebsiteFactory {

    private HashMap<String, ConcreteWebsite> pool = new HashMap<>();

    public WebSite getWebsiteCategory(String type) {
        if (!pool.containsKey(type)) {
            pool.put(type, new ConcreteWebsite(type));
        }

        return (WebSite)pool.get(type);
    }

    public int getWebSiteCount() {
        return pool.size();
    }
}
