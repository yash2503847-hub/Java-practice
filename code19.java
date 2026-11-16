
abstract class Payment {
    String customerName;

    Payment(String customerName) {
        this.customerName = customerName;
    }

    abstract void pay();

    void printReceipt() {
        System.out.println("Receipt for: " + customerName);
    }
}

class CreditCard extends Payment {
    CreditCard(String name) {
        super(name);
    }

    void pay() {
        System.out.println("Payment through Credit Card");
    }
}

class UPI extends Payment {
    UPI(String name) {
        super(name);
    }

    void pay() {
        System.out.println("Payment through UPI");
    }
}

class Cash extends Payment {
    Cash(String name) {
        super(name);
    }

    void pay() {
        System.out.println("Payment through Cash");
    }
}

public class AbstractDemo {
    public static void main(String[] args) {

        Payment[] payments = {
            new CreditCard("Ravi"),
            new UPI("Aman"),
            new Cash("Rahul")
        };

        for (Payment p : payments) {
            p.printReceipt();
            p.pay();
            System.out.println();
        }
    }
}
