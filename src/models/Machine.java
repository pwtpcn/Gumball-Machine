//6510450437 Thanapoom Chaisena

package models;

import utils.*;

public class Machine {
    private int gumballs;
    private String flavor;
    State state;
    State gumballSold;
    State hasQuarter;
    State noQuarter;
    State soldOut;
    State lucky;
    State chooseFlavor;

    public Machine(int gumballs){
        this.gumballs = gumballs;
        hasQuarter = new HasQuarter(this);
        noQuarter = new NoQuarter(this);
        gumballSold = new GumballSold(this);
        soldOut = new SoldOut(this);
        lucky = new Lucky(this);
        chooseFlavor = new ChooseFlavor(this);

        state = noQuarter;
    }

    public void setState(State state){
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void insertQuarter(){
        state.insertQuarter();
    }

    public void ejectQuarter(){
        state.ejectQuarter();
    }

    public void turnCrank(){
        state.turnCrank();
    }

    public void chooseFlavor(String s){
        state.chooseFlavor(s);
    }

    public void setFlavor(String flavor){
        this.flavor = flavor;
    }

    public String getFlavor(){
        return flavor;
    }

    public State getLucky() {
        return lucky;
    }

    public State getSoldOut() {
        return soldOut;
    }

    public State getNoQuarter() {
        return noQuarter;
    }

    public State getHasQuarter() {
        return hasQuarter;
    }

    public State getGumballSold() {
        return gumballSold;
    }

    public State getChooseFlavor() {
        return chooseFlavor;
    }

    public void dispenseGumballs(){
        gumballs--;
    }

    public int getGumballs() {
        return gumballs;
    }
}
