package responsibilitychainpattern;

public class Client {

    public static void main(String[] args) {
        PassHandler firstHandler = HandlerFactory.getFirstHandler();
        firstHandler.handler();
    }
}
