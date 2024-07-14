/*
    Thanapoom Chaisena
    6510450437
 */

public class Main {
    public static void main(String[] args) {
        GumballMachine m1 = new GumballMachine(5);
        m1.gumball();
        m1.insertQuarter();
        m1.turnCrank();

        m1.gumball();
        m1.insertQuarter();
        m1.ejectQuarter();
        m1.turnCrank();

        m1.gumball();
        m1.insertQuarter();
        m1.insertQuarter();
        m1.turnCrank();
        m1.turnCrank();

        m1.gumball();
        m1.insertQuarter();
        m1.turnCrank();

        m1.gumball();
        m1.insertQuarter();
        m1.turnCrank();

        m1.gumball();
        m1.insertQuarter();
        m1.turnCrank();

        m1.gumball();
        m1.insertQuarter();
        m1.turnCrank();

        m1.gumball();
        m1.insertQuarter();
        m1.insertQuarter();

    }
}