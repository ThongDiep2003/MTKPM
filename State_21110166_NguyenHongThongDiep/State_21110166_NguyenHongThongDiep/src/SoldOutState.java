
public class SoldOutState implements State {
    private VendingMachine machine;

    public SoldOutState(VendingMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertMoney() {
        System.out.println("Machine sold out");
    }

    @Override
    public void ejectMoney() {
        System.out.println("No money to eject");
    }

    @Override
    public void dispense() {
        System.out.println("Machine sold out");
    }
}
