package day12;

public class Application {

    public static void main(String args []){
        StatesContext statesContext = new StatesContext();
        statesContext.setTemperature(200);
        statesContext.stopRequest();

        statesContext.powerOnRequest();
        statesContext.setTemperature(30);
        statesContext.powerOnRequest();
        statesContext.stopRequest();
        statesContext.powerCablePluggedOff();

    }
}
