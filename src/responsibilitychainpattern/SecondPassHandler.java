package responsibilitychainpattern;

public class SecondPassHandler extends BasePassHandler {
    @Override
    public int play() {
        return 80;
    }

    @Override
    public int handler() {
        System.out.println("第二关");
        if (this.nextPassHandler != null) {
            if (this.play() >= 80) {
                return this.nextPassHandler.handler();
            }
        }
        return this.play();
    }
}
