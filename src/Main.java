public class Main {
    public static void main(String[] args) {
        ConnectJDBC connectJDBC = new ConnectJDBC();
        DisplayJDBC displayJDBC = new DisplayJDBC();
        displayJDBC.display(connectJDBC);
    }
}
