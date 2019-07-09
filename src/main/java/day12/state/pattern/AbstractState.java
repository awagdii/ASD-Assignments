package day12.state.pattern;

import day12.state.pattern.utils.Fan;
import day12.state.pattern.utils.Indicator;
import day12.state.pattern.utils.Lamp;

abstract class AbstractState {
    private StatesContext context;

    protected Indicator indicator = new Indicator();
    protected Fan fan = new Fan();
    protected Lamp lamp = new Lamp();

    public AbstractState() {
    }

    protected StatesContext getContext() {
        return context;
    }

    void setContext(StatesContext context) {
        this.context = context;
    }

    public void switchToState(AbstractState newState) {
        // Invoke exit effect on current state
        onExit();

        // Set new state active
        context.switchToState(newState);
    }

    public void setActive(StatesContext context) {
        this.context = context;

        // Invoke entry effect on new state
        onEntry();

        // Invoke do activity
        doWhileInState();
    }


    public void onEntry() {
        System.out.println("Entering " + getClass().getSimpleName());
    }

    public void doWhileInState() {
    }

    public void onExit() {
    }

    public void powerOnRequest() {
    }

    public void checkTemperature() {
    }

    public void stopRequest() {
    }

    public void powerCablePluggedOff() {
    }
}
