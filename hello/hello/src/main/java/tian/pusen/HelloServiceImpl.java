package tian.pusen;

import org.apache.thrift.TException;

/**
 * Created by Administrator on 2019/1/16.
 */
public class HelloServiceImpl implements Hello.Iface {
    public String helloString(String para) throws TException {
        return "result:" + para;
    }
}
