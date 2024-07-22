//6510450437 Thanapoom Chaisena

package utils;

import models.Machine;

public class HasQuarter implements State{
    Machine machine;

    public HasQuarter(Machine machine){
        this.machine = machine;
    }

    @Override
    public void insertQuarter(){
        System.out.println("You can't insert another quarter");
    }

    @Override
    public void ejectQuarter(){
        this.machine.setState(machine.getNoQuarter());
    }

    @Override
    public void turnCrank(){
        System.out.println("Please choose flavor");
    }

    @Override
    public void dispense(){
        System.out.println("Error: Please turn crank");
    }

    @Override
    public void chooseFlavor(String s){
        this.machine.setFlavor(s);
        System.out.println("You choose: " + machine.getFlavor() + " flavor");
        this.machine.setState(machine.getChooseFlavor());
    }
}
