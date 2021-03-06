package MultiAOP;

public abstract class ChainHandler {

    public void execute(Chain chain){
        handlerProcess();
        chain.proceed();
    }
    protected abstract void handlerProcess();
}
