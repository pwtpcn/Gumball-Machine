//6510450437 Thanapoom Chaisena

package utils;

import models.Machine;

public class NoQuarter implements State{
    Machine machine;

    public NoQuarter(Machine machine) {
        this.machine = machine;
    }

    @Override
    public void insertQuarter(){
        this.machine.setState(machine.getHasQuarter());
        System.out.println("You inserted a quarter");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Error: There is no quarter");
    }

    @Override
    public void turnCrank() {
        System.out.println("Error: No quarter in machine, please insert quarter");
    }

    @Override
    public void dispense() {
        System.out.println("Error: No quarter in machine, please insert quarter");
    }

    @Override
    public void chooseFlavor(String s) {
        System.out.println("Error: No quarter in machine, please insert quarter");
    }
}
