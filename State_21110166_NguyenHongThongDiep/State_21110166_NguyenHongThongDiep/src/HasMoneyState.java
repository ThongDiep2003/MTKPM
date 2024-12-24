
public class HasMoneyState implements State {
    private VendingMachine machine;

    public HasMoneyState(VendingMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertMoney() {
        System.out.println("Money already inserted");
    }

    @Override
    public void ejectMoney() {
        System.out.println("Money returned");
        machine.setState(machine.getNoMoneyState());
    }

    @Override
    public void dispense() {
        System.out.println("Product dispensed");
        machine.setState(machine.getNoMoneyState());
    }
}
