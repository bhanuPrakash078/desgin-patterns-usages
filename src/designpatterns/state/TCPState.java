package designpatterns.state;

//This is my TCP State Interface
public interface TCPState {

    //We are giving the responsibility for state change to the state object.
    //So based on output of method, we can set state dynamically
    public void openConnection(TCPConnection tcpConnection);

    public void closeConnection(TCPConnection tcpConnection);

    public void sendData(TCPConnection tcpConnection);
}
