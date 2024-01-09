package responsibilitychainpattern;

public interface PassHandler {
    int play();
    int handler();
    void setNextHandler(PassHandler newHandler);
}
