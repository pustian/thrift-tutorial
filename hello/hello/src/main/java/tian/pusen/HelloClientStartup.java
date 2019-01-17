package tian.pusen;

import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;
import org.apache.thrift.transport.TTransportException;

/**
 * Created by Administrator on 2019/1/16.
 */
public class HelloClientStartup {
    public static void main(String[] args) {
        System.out.println("客户端启动....");
        TTransport transport = null;
        try {
            // 协议要和服务端一致
            transport = new TSocket("localhost", 9898, 30000);
            transport.open();
            TProtocol protocol = new TBinaryProtocol(transport);

            Hello.Client client = new Hello.Client(protocol);
            String result = client.helloString("哈哈");
            System.out.println(result);
        } catch (TTransportException e) {
            e.printStackTrace();
        } catch (TException e) {
            e.printStackTrace();
        } finally {
            if (null != transport) {
                transport.close();
            }
        }
    }
}
