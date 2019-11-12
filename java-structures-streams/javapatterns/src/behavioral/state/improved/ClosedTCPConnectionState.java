package behavioral.state.improved;


public class ClosedTCPConnectionState implements TCPConnectionState{

    private TCPConnection connection;


    public ClosedTCPConnectionState(TCPConnection connection) {
        this.connection = connection;
    }

    
    public void open() {
        System.out.println("Opening connection");
        connection.setTcpConnectionState(new OpenTCPConnectionState(connection));
    }

    
    public void close() {
        System.out.println("Already closed connection");
    }

    
    public void acknowledge() throws Exception {
        throw new Exception("Invalid usasage of connection");
    }
}
