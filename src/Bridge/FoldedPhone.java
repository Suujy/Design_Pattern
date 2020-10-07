package Bridge;

public class FoldedPhone extends Phone{

    public FoldedPhone(Brand brand) {
        super(brand);
    }

    @Override
    protected void open() {
        super.open();
        System.out.println("folded phone");
    }

    @Override
    protected void close() {
        super.close();
        System.out.println("folded phone");
    }

    @Override
    protected void call() {
        super.call();
        System.out.println("folded phone");
    }
}
