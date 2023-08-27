package uz.java.designpatterns.gof.behivioral.command;

public class Client {
    public static void main(String[] args) {
        Device tv = new Device("TV");
        Command turnOnCommand = new TurnOnCommand(tv);
        Command turnOffCommand = new TurnOffCommand(tv);

        RemoteControl remote = new RemoteControl();

        remote.setCommand(turnOnCommand);
        remote.pressButton(); // Turns on the TV

        remote.setCommand(turnOffCommand);
        remote.pressButton(); // Turns off the TV
    }
}