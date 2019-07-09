package day12;

public class ProjectingState extends AbstractState {

    @Override
    public void onEntry() {
        super.onEntry();
        indicator.green();
        lamp.on();
    }

    @Override
    public void doWhileInState() {
        super.doWhileInState();
        projectSignal();
    }

    private void projectSignal() {
        System.out.println("projecting signal ..!");
        checkTemperature();

    }

    private void sendPanelWarning() {
        System.out.println("WARNING !! Take care Temperature is above 150F !");
    }

    @Override
    public void checkTemperature() {
        if (getContext().getTemperature() > 150) {
            indicator.red();
            sendPanelWarning();
            switchToState(new CoolingOffState());
        }
    }

    @Override
    public void stopRequest() {
        indicator.blue();
        switchToState(new CoolingOffState());
    }
}
