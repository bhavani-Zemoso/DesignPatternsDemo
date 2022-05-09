package commandPattern;

public class RemoteControl {
    public static void main(String[] args) {
        Remote remote = new Remote();

        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");

        CeilingFan bedroomFan = new CeilingFan("Bedroom");
        CeilingFan livingRoomFan = new CeilingFan("Living Room");

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

        CeilingFanOnCommand bedroomFanOn = new CeilingFanOnCommand(bedroomFan);
        CeilingFanOffCommand  bedroomFanOff = new CeilingFanOffCommand(bedroomFan);
        CeilingFanOnCommand livingRoomFanOn = new CeilingFanOnCommand(livingRoomFan);
        CeilingFanOffCommand  livingRoomFanOff = new CeilingFanOffCommand(livingRoomFan);

        remote.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remote.setCommand(1,kitchenLightOn, kitchenLightOff);
        remote.setCommand(2,bedroomFanOn, bedroomFanOff);
        remote.setCommand(3,livingRoomFanOn,livingRoomFanOff);

        System.out.println(remote);

        remote.onButtonWasPushed(0);
        remote.onButtonWasPushed(2);
        remote.offButtonWasPushed(2);
        remote.offButtonWasPushed(0);
        remote.onButtonWasPushed(4);

    }
}
