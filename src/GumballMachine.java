/*
    Thanapoom Chaisena
    6510450437
 */

import java.util.Objects;

public class GumballMachine {
    public int gumCount;
    public String state;

    public GumballMachine(int gumCount) {
        this.gumCount = gumCount;

        if(gumCount >= 0) {
            this.state = "No Quarters";
        }
        else{
            this.state = "Sold Out";
        }
    }

    public int getGumCount() {
        return gumCount;
    }

    public String getState() {
        return state;
    }

    public void setGumCount(int gumCount) {
        this.gumCount = gumCount;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void insertQuarter() {
        if(Objects.equals(this.state, "No Quarters")){
            System.out.println("You inserted a quarter");
            setState("Has Quarters");
        }
        else if(Objects.equals(this.state, "Has Quarters")){
            System.out.println("You can't insert another quarter");
        }
    }

    public void ejectQuarter() {
        if(Objects.equals(this.state, "No Quarters")){
            System.out.println("There is no quarter");
        }
        else if(Objects.equals(this.state, "Has Quarters")){
            System.out.println("Quarters return");
            setState("No Quarters");
        }
    }

    public void turnCrank() {
        System.out.println("You turned...");
        if(Objects.equals(this.state, "Has Quarters")){
            setState("Gumball Sold");
            dispense();
        }
        else if(Objects.equals(this.state, "No Quarters")){
            System.out.println("You turned, but there no quarter");
        }
        else if(Objects.equals(this.state, "Sold Out")){
            System.out.println("You turned, but there no gumball");
        }
    }

    public void dispense() {
        if(gumCount == 0){
            System.out.println("Oops, out of gumballs");
            setState("Sold Out");
        }
        else if(gumCount >= 1){
            gumCount--;
            System.out.println("A gumball comes rolling out the slot");
            setState("No Quarters");
        }
    }

    public void gumball(){
        System.out.println("Inventory: " + this.gumCount  + " gumballs");
        if(state.equals("Sold Out")){
            System.out.println("Machine is sold out");
        }else{
            System.out.println("Machine is waiting for a quarter");
        }
    }
}
