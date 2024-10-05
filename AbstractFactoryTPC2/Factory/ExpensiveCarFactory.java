package Factory;

import Engine.Engine;
import Engine.ExpensiveEngine;
import Interior.Interior;
import Interior.ExpensiveInterior;
import Transmission.ExpensiveTransmission;
import Transmission.Transmission;

public class ExpensiveCarFactory implements CarFactory {
    
    public Engine createEngine(){
        return new ExpensiveEngine();
    }

    public Transmission createTransmission(){
        return new ExpensiveTransmission();
    }

    public Interior createInterior(String color){
        return new ExpensiveInterior(color);
    }
}
