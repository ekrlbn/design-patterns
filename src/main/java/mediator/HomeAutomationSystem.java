package mediator;
public class HomeAutomationSystem implements SmartHomeMediator {
    private Light light;
    private Thermostat thermostat;
    private Alarm alarm;
    private Door door;

    public void setLight(Light light) {
        this.light = light;
    }

    public void setThermostat(Thermostat thermostat) {
        this.thermostat = thermostat;
    }

    public void setAlarm(Alarm alarm) {
        this.alarm = alarm;
    }

    @Override
    public void notify(Component sender, String event) {
        if (sender instanceof Alarm && event.equals("triggered")) {
            light.turnOn();
        } else if (sender instanceof Door && event.equals("open")) {
            if (alarm.isActive()) alarm.trigger();
            else thermostat.adjustTemperature(25);
        } else if (sender instanceof Door && event.equals("close")) {
            light.turnOff();
        }
    }

    @Override
    public void addComponent(Component component) {
        if (component instanceof Light) {
            setLight((Light) component);
        } else if (component instanceof Thermostat) {
            setThermostat((Thermostat) component);
        } else if (component instanceof Alarm) {
            setAlarm((Alarm) component);
        } else if (component instanceof Door) {
            setDoor((Door) component);
        }
    }

    public Door getDoor() {
        return door;
    }

    public void setDoor(Door door) {
        this.door = door;
    }
}
