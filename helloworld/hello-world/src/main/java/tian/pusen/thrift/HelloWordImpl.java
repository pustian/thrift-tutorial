package tian.pusen.thrift;

import org.apache.commons.lang3.StringUtils;
import org.apache.thrift.TException;

import java.util.Date;

/**
 * Created by Administrator on 2019/1/16.
 */
public class HelloWordImpl implements HelloWord.Iface {
    public String doAction(Request request) throws RequestException, TException {
        System.out.println("Get request: " + request);
        if (StringUtils.isBlank(request.getName()) || request.getType() == null) {
            throw new RequestException();
        }
        String result = "Hello, " + request.getName();
        if (request.getType() == RequestType.SAY_HELLO) {
            result += ", Welcome!";
        } else {
            result += ", Now is " + new Date();
        }
        return result;
    }
}
