package day12;

public class CoolingOffState extends AbstractState {

    @Override
    public void onEntry() {
        super.onEntry();
        lamp.off();
    }

    @Override
    public void doWhileInState() {
        super.doWhileInState();
        fan.boost();
        checkTemperature();

    }


    @Override
    public void checkTemperature() {
        if (getContext().getTemperature() < 90) {
            switchToState(new SuspendedState());
        }
    }
}
