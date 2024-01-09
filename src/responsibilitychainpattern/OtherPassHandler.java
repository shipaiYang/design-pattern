package responsibilitychainpattern;

public class OtherPassHandler extends BasePassHandler {
    @Override
    public int play() {
        return 85;
    }

    @Override
    public int handler() {
        System.out.println("其它关");
        if (this.nextPassHandler != null) {
            if (this.play() >= 85) {
                return this.nextPassHandler.handler();
            }
        }
        return this.play();
    }
}
