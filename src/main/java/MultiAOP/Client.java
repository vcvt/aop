package MultiAOP;

import java.util.Arrays;
import java.util.List;

public class Client {
    static class HandlerA extends Handler{
        @Override
        protected void handleProcess() {
            System.out.println("handle by a");
        }
    }
    static class HandlerB extends Handler{
        @Override
        protected void handleProcess() {
            System.out.println("handle by b");
        }
    }
    static class HandlerC extends Handler{
        @Override
        protected void handleProcess() {
            System.out.println("handle by c");
        }
    }

    static class ChainHandlerA extends ChainHandler{
        @Override
        protected void handlerProcess() {
            System.out.println("chainhandle by a");
        }
    }
    static class ChainHandlerB extends ChainHandler{
        @Override
        protected void handlerProcess() {
            System.out.println("chainhandle by b");
        }
    }
    static class ChainHandlerC extends ChainHandler{
        @Override
        protected void handlerProcess() {
            System.out.println("chainhandle by c");
        }
    }
    public static void main(String[] args) {
        /*Handler handlerA = new HandlerA();
        Handler handlerB = new HandlerB();
        Handler handlerC = new HandlerC();

        handlerA.setSuccessor(handlerB);
        handlerB.setSuccessor(handlerC);

        handlerA.execute();*/
        List<ChainHandler> handlers = Arrays.asList(
                new ChainHandlerA(),
                new ChainHandlerB(),
                new ChainHandlerC()
        );
        Chain chain = new Chain(handlers);
        chain.proceed();
    }
}
