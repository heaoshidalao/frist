package http;

import java.net.Socket;

public class HttpTask implements Runnable{
    private Socket socket;
    public HttpTask(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {

    }
}
