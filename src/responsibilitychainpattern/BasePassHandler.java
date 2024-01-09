package responsibilitychainpattern;

public abstract class BasePassHandler implements PassHandler {
    protected PassHandler nextPassHandler;

    public void setNextPassHandler(PassHandler nextPassHandler) {
        this.nextPassHandler = nextPassHandler;
    }


    @Override
    public void setNextHandler(PassHandler newHandler) {
        this.nextPassHandler = newHandler;
    }
}
