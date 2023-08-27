package uz.java.designpatterns.gof.structural.proxy;

class ProxyConnection implements Connection {
    private DatabaseConnection databaseConnection;
    private final boolean available;

    public ProxyConnection(boolean available) {
        this.available = available;
    }

    @Override
    public void connect() {
        if (available) {
            databaseConnection = new DatabaseConnection();
        }
        databaseConnection.connect();
    }
}
