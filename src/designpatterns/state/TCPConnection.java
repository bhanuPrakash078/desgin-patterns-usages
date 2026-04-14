package designpatterns.state;

import java.net.Socket;

//This is a context object whose behavior changes based on state.
public class TCPConnection {
    TCPState state;

    public TCPConnection() {
        //We can make the TCP states as singleton and can use the states
        this.state = TCPCloseState.getInstance();
    }

    public void changeState(TCPState state) {
        this.state = state;
    }

    //Below are the operations, which change based on the data.
    public void openConnection() {
        state.openConnection(this);
    }

    public void closeConnection() {
        state.closeConnection(this);
    }

    public void sendData() {
        state.sendData(this);
    }
}
