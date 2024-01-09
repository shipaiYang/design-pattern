package responsibilitychainpattern;

public class FirstPassHandler extends BasePassHandler {

    @Override
    public int play() {
        return 70;
    }

    @Override
    public int handler() {
        System.out.println("第一关");
        if (this.nextPassHandler != null) {
            if (this.play() >= 70) {
                return this.nextPassHandler.handler();
            }
        }
        return this.play();
    }
}
