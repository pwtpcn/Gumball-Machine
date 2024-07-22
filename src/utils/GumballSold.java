//6510450437 Thanapoom Chaisena

package utils;

import models.Machine;

public class GumballSold implements State{
    Machine machine;

    public GumballSold(Machine machine) {
        this.machine = machine;
    }

    @Override
    public void insertQuarter(){
        System.out.println("Error: Invalid State");
    }

    @Override
    public void ejectQuarter(){
        System.out.println("Error: Invalid State");
    }

    @Override
    public void turnCrank(){
        System.out.println("Error: Invalid State");
    }

    @Override
    public void dispense(){
        this.machine.dispenseGumballs();
        System.out.println(machine.getFlavor() + " gumball has roll out.");
        if(this.machine.getGumballs()==0){
            this.machine.setState(machine.getSoldOut());
        }
        else{
            this.machine.setState((machine.getNoQuarter()));
        }
    }

    @Override
    public void chooseFlavor(String s){
        System.out.println("Error: Invalid State");
    }
}
