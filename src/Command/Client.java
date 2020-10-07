package Command;

public class Client {

    public static void main(String[] args) {
        LightReceiver lightReceiver = new LightReceiver();

        LightOnCommand lightOnCommand = new LightOnCommand(lightReceiver);
        LightOffCommand lightOffCommand = new LightOffCommand(lightReceiver);

        RemoteController remoteController = new RemoteController();

        remoteController.setCommand(0, lightOnCommand, lightOffCommand);

        System.out.println("------push Light on--------");
        remoteController.onButtonWasPushed(0);
        System.out.println("------push Light off--------");
        remoteController.offButtonWasPushed(0);
        System.out.println("-----undo last command---------");
        remoteController.undoButtonWasPushed();

        System.out.println("-------使用遥控器操作电视机---------");
        TVReceiver tvReceiver = new TVReceiver();
        TVOffCommand tvOffCommand = new TVOffCommand(tvReceiver);
        TVOnCommand tvOnCommand = new TVOnCommand(tvReceiver);

        remoteController.setCommand(1, tvOnCommand, tvOffCommand);
        remoteController.onButtonWasPushed(1);
        remoteController.offButtonWasPushed(1);
        remoteController.undoButtonWasPushed();
    }
}
