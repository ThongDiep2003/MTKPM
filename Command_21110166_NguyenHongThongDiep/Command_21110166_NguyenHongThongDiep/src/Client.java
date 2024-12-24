
public class Client {
    public static void main(String[] args) {
        Computer computer = new Computer();
        RemoteControl remoteControl = new RemoteControl();

        // Bật máy tính
        remoteControl.setCommand(new TurnOnComputerCommand(computer));
        remoteControl.pressButton();

        // Tăng âm lượng
        remoteControl.setCommand(new VolumeUpCommand(computer));
        remoteControl.pressButton();
     
        // Tăng độ sáng màn hình
        remoteControl.setCommand(new BrightnessUpCommand(computer));
        remoteControl.pressButton();

        // Giảm âm lượng
        remoteControl.setCommand(new VolumeDownCommand(computer));
        remoteControl.pressButton();

        // Tắt máy tính
        remoteControl.setCommand(new TurnOffComputerCommand(computer));
        remoteControl.pressButton();
    }
}