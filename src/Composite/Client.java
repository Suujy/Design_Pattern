package Composite;

public class Client {

    public static void main(String[] args) {
        // from large to small
        University university = new University("qinghua", "top1");
        Colleage csCollege = new Colleage("computer science", "c1");
        Colleage eeCollege = new Colleage("ee", "c2");

        csCollege.add(new Department("se", "se profession"));
        csCollege.add(new Department("cs", "cs profession"));
        csCollege.add(new Department("net", "net profession"));

        eeCollege.add(new Department("com engineer", "com pro"));
        eeCollege.add(new Department("info engineer", "com pro"));

        university.add(csCollege);
        university.add(eeCollege);

        eeCollege.print();
    }
}
