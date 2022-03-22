import OrderPattern.Commands.LightOffCommand;
import OrderPattern.Commands.LightOnCommand;
import OrderPattern.Commands.StereoOffWithCDCommand;
import OrderPattern.Commands.StereoOnWithCDCommand;
import OrderPattern.RemoteControl;
import OrderPattern.function.Light;
import OrderPattern.function.Stereo;

/**
 * @author KW
 */
public class App {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();
        Light livingRoomLight =new Light("LivingRoom");
        Stereo stereo = new Stereo("LivingRoom");
        LightOnCommand loc = new LightOnCommand(livingRoomLight);
        LightOffCommand lfc = new LightOffCommand(livingRoomLight);
        StereoOnWithCDCommand soc = new StereoOnWithCDCommand(stereo);
        StereoOffWithCDCommand sfc  = new StereoOffWithCDCommand(stereo);

        remoteControl.setCommands(0, loc, lfc);
        remoteControl.setCommands(1, soc, sfc);
        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        remoteControl.offButtonWasPushed(0);
    }
}
