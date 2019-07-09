package day12.state.pattern;

public class SuspendedState extends AbstractState {

    @Override
    public void onEntry() {
        super.onEntry();
        indicator.yellow();
    }

    @Override
    public void doWhileInState() {
        super.doWhileInState();
        indicator.blink();
    }

    @Override
    public void powerOnRequest() {
        System.out.println("Power On request");

        switchToState(new ProjectingState());
    }

    @Override
    public void powerCablePluggedOff() {
        switchToState(new EndState());
    }
}
