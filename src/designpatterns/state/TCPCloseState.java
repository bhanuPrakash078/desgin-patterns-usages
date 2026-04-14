package designpatterns.state;

public class TCPCloseState implements TCPState {

    private static TCPCloseState closeState;

    private TCPCloseState() {

    }

    public static TCPCloseState getInstance() {
        if (closeState == null) {
            closeState = new TCPCloseState();
        }
        return closeState;
    }

    @Override
    public void openConnection(TCPConnection tcpConnection) {
        System.out.println("I can open connection");
        tcpConnection.changeState(TCPOpenState.getInstance());
    }

    @Override
    public void closeConnection(TCPConnection tcpConnection) {
        System.out.println("I cannot close connection");
    }

    @Override
    public void sendData(TCPConnection tcpConnection) {
        System.out.println("I cannot send data in close connection");
    }
}
