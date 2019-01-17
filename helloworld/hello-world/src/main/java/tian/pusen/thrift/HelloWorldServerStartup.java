package tian.pusen.thrift;

import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TSimpleServer;
import org.apache.thrift.transport.TServerSocket;

import java.net.ServerSocket;

/**
 * Created by Administrator on 2019/1/16.
 */
public class HelloWorldServerStartup {
    public static void main(String[] args) throws Exception {
        ServerSocket socket = new ServerSocket(7912);
        TServerSocket serverTransport = new TServerSocket(socket);
        HelloWord.Processor processor = new HelloWord.Processor(new HelloWordImpl());

        TServer.Args tArgs = new TServer.Args(serverTransport);
        tArgs.processor(processor);
        tArgs.protocolFactory(new TBinaryProtocol.Factory());
        //　与参考不一致具体见接口调用
        TServer server = new TSimpleServer(tArgs);
        System.out.println("Running server...");
        server.serve();
    }
}
