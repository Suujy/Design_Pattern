package Dependency;

public class dep {
    public static void main(String[] args) {
        IUser user = new User();
        user.setTV(new changHong());
        user.play();
    }
}

interface ITV {
    public void play();
}

class changHong implements ITV {

    @Override
    public void play() {
        System.out.println("in changHong TV");
    }
}

interface IUser {
    public void play();
    public void setTV(ITV itv);
}

class User implements IUser {
    ITV itv;

    public void setTV(ITV itv) {
        this.itv = itv;
    }

    @Override
    public void play() {
        itv.play();
    }
}