package Builder;

public class Client {

    public static void main(String[] args) {
        CommonHouse commonHouse = new CommonHouse();
        Director director = new Director(commonHouse);
        House house = director.constructHouse();

        System.out.println("");

        HighBuilding highBuilding = new HighBuilding();
        director.setHouseBuilder(highBuilding);
        director.constructHouse();
        System.out.println("builder pattern finish");
        StringBuilder stringBuilder = new StringBuilder();
    }
}
