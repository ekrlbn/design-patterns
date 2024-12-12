package mediator;

public class App {
    public static void main(String[] args) throws InterruptedException {
        SmartHomeMediator homeAutomationSystem = new HomeAutomationSystem();
        Light light = new Light(homeAutomationSystem);
        Alarm alarm = new Alarm(homeAutomationSystem);
        Thermostat thermostat = new Thermostat(homeAutomationSystem);
        Door door = new Door(homeAutomationSystem);

        homeAutomationSystem.addComponent(light);
        homeAutomationSystem.addComponent(alarm);
        homeAutomationSystem.addComponent(thermostat);
        homeAutomationSystem.addComponent(door);

        door.open();
        door.close();
        Thread.sleep(1000);
        alarm.setActive(true);
        door.open();
    }
}
