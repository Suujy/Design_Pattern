package Proxy.StaticProxy;

public class TeacherDao implements IteacherDao{

    @Override
    public void teach() {
        System.out.println(" teacher is teaching");
    }
}
