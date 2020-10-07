package Proxy.StaticProxy;

public class TeacherDaoProxy implements IteacherDao{

    private IteacherDao target;

    public TeacherDaoProxy(IteacherDao target) {
        this.target = target;
    }

    @Override
    public void teach() {
        System.out.println("start proxying");
        target.teach();
        System.out.println("end proxying");
    }
}
