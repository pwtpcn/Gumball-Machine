//6510450437 Thanapoom Chaisena

package utils;

import models.Machine;

public class SoldOut implements State{
    Machine machine;

    public SoldOut(Machine machine) {
        this.machine = machine;
    }

    @Override
    public void insertQuarter(){
        System.out.println("Error: Out of gumballs");
    }

    @Override
    public void ejectQuarter(){
        System.out.println("Error: Out of gumballs");
    }

    @Override
    public void turnCrank(){
        System.out.println("Error: Out of gumballs");
    }

    @Override
    public void dispense(){
        System.out.println("Error: Out of gumballs");
    }

    @Override
    public void chooseFlavor(String s){
        System.out.println("Error: Out of gumballs");
    }
}
