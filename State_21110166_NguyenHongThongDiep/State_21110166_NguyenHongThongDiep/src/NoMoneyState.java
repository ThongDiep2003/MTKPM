
public class NoMoneyState implements State {
    private VendingMachine machine;

    public NoMoneyState(VendingMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertMoney() {
        System.out.println("Money inserted");
        machine.setState(machine.getHasMoneyState());
    }

    @Override
    public void ejectMoney() {
        System.out.println("No money to eject");
    }

    @Override
    public void dispense() {
        System.out.println("Payment required");
    }
}