package Bridge;

public class UprightPhone extends Phone{

    public UprightPhone(Brand brand) {
        super(brand);
    }

    @Override
    protected void open() {
        super.open();
        System.out.println("Upright phone");
    }

    @Override
    protected void close() {
        super.close();
        System.out.println("Upright phone");
    }

    @Override
    protected void call() {
        super.call();
        System.out.println("Upright phone");
    }
}
