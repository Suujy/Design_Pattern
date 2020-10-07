package Template;

import Template.Improve.PureSoyaMilk;

public class Client {

    public static void main(String[] args) {
        System.out.println("----make red bean soyamilk----");
        SoyaMilk redBeanSoyaMilk = new RedBeanSoyaMilk();
        redBeanSoyaMilk.make();

        System.out.println("----make peanut soyamilk----");
        SoyaMilk peanutSoyaMilk = new PeanutSoyaMilk();
        peanutSoyaMilk.make();


    }
}
