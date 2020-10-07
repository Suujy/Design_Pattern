package Prototype;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        DeepPrototype p = new DeepPrototype();
        p.name = "sjy";
        p.deepCloneableTarget = new DeepCloneableTarget("thinker", "class0");
//        DeepPrototype p2 = (DeepPrototype) p.clone();
//        System.out.println("p.name " + p.name + "p.deepCloneableTarget = " + p.deepCloneableTarget.hashCode());
//        System.out.println("p2.name " + p2.name + "p.deepCloneableTarget = " + p2.deepCloneableTarget.hashCode());
        DeepPrototype p2 = (DeepPrototype)p.deepClone();
        System.out.println("p.name " + p.name + "p.deepCloneableTarget = " + p.deepCloneableTarget.hashCode());
        System.out.println("p2.name " + p2.name + "p.deepCloneableTarget = " + p2.deepCloneableTarget.hashCode());
    }
}
