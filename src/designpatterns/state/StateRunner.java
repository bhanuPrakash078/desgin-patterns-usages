package designpatterns.state;

public class StateRunner {

    public static void main(String[] args) {
        TCPConnection tcpConnection = new TCPConnection();
        //By default TCP will be in close state. it cannot send data
        tcpConnection.sendData();
        tcpConnection.closeConnection();
        tcpConnection.openConnection();

        //Now TCP connection is in open state so ideally it can send data and it cant open connection
        tcpConnection.sendData();
        tcpConnection.openConnection();
        tcpConnection.closeConnection();

        //Now it cant send data again
        tcpConnection.sendData();
    }

}
