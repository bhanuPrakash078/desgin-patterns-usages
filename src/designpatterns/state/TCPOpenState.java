package designpatterns.state;

public class TCPOpenState implements TCPState {

    private static TCPOpenState openState;

    public static TCPOpenState getInstance() {
        if (openState == null) {
            openState = new TCPOpenState();
        }
        return openState;
    }

    @Override
    public void openConnection(TCPConnection tcpConnection) {
        System.out.println("I can not open connection");
    }

    @Override
    public void closeConnection(TCPConnection tcpConnection) {
        System.out.println("I can close connection");
        tcpConnection.changeState(TCPCloseState.getInstance());
    }

    @Override
    public void sendData(TCPConnection tcpConnection) {
        System.out.println("I can send data in open connection");
    }
}
