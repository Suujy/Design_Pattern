package Builder;

public class CommonHouse extends HouseBuilder{
    @Override
    public void buildBasic() {
        System.out.println(" normal house build base 5m");
    }

    @Override
    public void buildWalls() {
        System.out.println(" normal house build walls 10cm ");
    }

    @Override
    public void buildRoof() {
        System.out.println(" normal house roof");
    }
}
