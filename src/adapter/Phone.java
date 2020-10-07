package adapter;

public class Phone {

    public void charging(IVoltage5V iVoltage5V) {
        if (iVoltage5V.output5V() == 5) {
            System.out.println("voltage = 5, charging");
        } else if (iVoltage5V.output5V() > 5) {
            System.out.println("voltage can't be larger than 5");
        }
    }
}
