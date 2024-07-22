//6510450437 Thanapoom Chaisena

package utils;

import models.Machine;

import java.util.Random;

public class ChooseFlavor implements State{
    Machine machine;
    Random rand = new Random();

    public ChooseFlavor(Machine machine) {
        this.machine = machine;
    }

    @Override
    public void insertQuarter(){
        System.out.println("Error: Invalid State");
    }

    @Override
    public void ejectQuarter(){
        this.machine.setState(machine.getNoQuarter());
    }

    @Override
    public void turnCrank(){
        System.out.println("You turned...");
        int random = rand.nextInt(10);
        if(random==10){
            this.machine.setState(machine.getLucky());
        }
        else{
            this.machine.setState(machine.getGumballSold());
        }
        this.machine.getState().dispense();
    }

    @Override
    public void dispense(){
        System.out.println("Error: Invalid State");

    }

    @Override
    public void chooseFlavor(String s){
        this.machine.setFlavor(s);
        System.out.println("You choose: " + machine.getFlavor() + " flavor");
    }
}
