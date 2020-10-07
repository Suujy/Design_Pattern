package Template;

public abstract class SoyaMilk {

    final void make(){
        select();
        addCondiments();
        soak();
        beat();
    }

    void select() {
        System.out.println("first step: 选择新鲜黄豆");
    }

    abstract void addCondiments();

    void soak() {
        System.out.println("third step: 黄豆和配料开始浸泡，3h");
    }

    void beat() {
        System.out.println("forth step: 黄豆和配料放到豆浆机去打碎");
    }
}
