public class DepOfTreasury {
    public static void main(String[] args) {
        Dollar dollar1 = new Dollar(1, "a123456789h", 2020);
        Dollar dollar2 = new Dollar(5, 2001);
        Dollar dollar3 = new Dollar(10, 1839);
        Dollar dollar4 = new Dollar(20, 1978);
        Dollar dollar5 = new Dollar(50, 2023);
        Dollar dollar6 = new Dollar(100, 1600);


        dollar1.showBill();
        dollar2.showBill();
        dollar3.showBill();
        dollar4.showBill();
        dollar5.showBill();
        dollar6.showBill();
    }
}
