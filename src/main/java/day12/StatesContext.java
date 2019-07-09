package day12;


public class StatesContext {

    AbstractState state = null;
    double temperature;

    public StatesContext() {
        // Set initial state
        state = new SuspendedState();
        state.setActive(this);
    }

    public AbstractState getState() {
        return state;
    }

    public void setState(AbstractState state) {
        this.state = state;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
        state.checkTemperature();
    }

    public void powerOnRequest() {
        state.powerOnRequest();
    }
    public void stopRequest() {
        state.stopRequest();
    }
    public void powerCablePluggedOff() {
        state.powerCablePluggedOff();
    }

    public void switchToState(AbstractState newState) {
        state = newState;
        newState.setActive(this);
    }
}
