package Proxy.DynamicProxy;

public class TeacherDao implements ITeacherDao{

    @Override
    public void teach() {
        System.out.println("teacher is teaching");
    }
}
