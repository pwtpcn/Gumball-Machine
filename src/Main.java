//6510450437 Thanapoom Chaisena

import models.Machine;

public class Main {
    public static void main(String[] args) {
        Machine machine = new Machine(5);

        machine.insertQuarter();
        machine.chooseFlavor("Orange");
        machine.chooseFlavor("Mango");
        machine.ejectQuarter();
        machine.turnCrank();

        machine.insertQuarter();
        machine.chooseFlavor("Orange");
        machine.turnCrank();
    }
}