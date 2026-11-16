
interface Switchable {
    void turnOn();
    void turnOff();
}

class Light implements Switchable {
    public void turnOn() {
        System.out.println("Light is ON");
    }

    public void turnOff() {
        System.out.println("Light is OFF");
    }
}

class AC implements Switchable {
    public void turnOn() {
        System.out.println("AC is ON");
    }

    public void turnOff() {
        System.out.println("AC is OFF");
    }
}

class Fan implements Switchable {
    public void turnOn() {
        System.out.println("Fan is ON");
    }

    public void turnOff() {
        System.out.println("Fan is OFF");
    }
}

// Additional class
class Television implements Switchable {
    public void turnOn() {
        System.out.println("TV is ON");
    }

    public void turnOff() {
        System.out.println("TV is OFF");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {

        Switchable[] devices = {
            new Light(),
            new AC(),
            new Fan(),
            new Television()
        };

        for (Switchable device : devices) {
            device.turnOn();
            device.turnOff();
            System.out.println();
        }
    }
}
