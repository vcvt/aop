package JDKProxy;

import com.imooc.pattern.RealSubject;
import com.imooc.pattern.Subject;

import java.lang.reflect.Proxy;

public class Client {

    public static void main(String[] args) {
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        Subject subject = (Subject)Proxy.newProxyInstance(Client.class.getClassLoader(), new Class[]{Subject.class},new JdkProxySubject(new RealSubject()));
        subject.request();
        subject.hello();
    }
}
