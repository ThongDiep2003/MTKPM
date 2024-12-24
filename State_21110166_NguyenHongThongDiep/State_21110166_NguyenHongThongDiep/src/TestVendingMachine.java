
public class TestVendingMachine {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine(5);

        vendingMachine.insertMoney();
        vendingMachine.pressButton();

        vendingMachine.insertMoney();
        vendingMachine.pressButton();

        vendingMachine.insertMoney();
        vendingMachine.pressButton();

        vendingMachine.insertMoney();
        vendingMachine.pressButton();

        vendingMachine.insertMoney();
        vendingMachine.pressButton();
    }
}
