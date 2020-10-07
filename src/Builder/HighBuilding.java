package Builder;

public class HighBuilding extends HouseBuilder{
    @Override
    public void buildBasic() {
        System.out.println(" high building base 100m");
    }

    @Override
    public void buildWalls() {
        System.out.println(" high building wall 20cm");
    }

    @Override
    public void buildRoof() {
        System.out.println(" high building transparent roof");
    }
}
