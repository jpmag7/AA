package Factory;

import Interior.AffordableInterior;
import Transmission.AffordableTransmission;
import Engine.AffordableEngine;
import Engine.Engine;
import Transmission.Transmission;
import Interior.Interior;

public class AffordableCarFactory implements CarFactory {
    
    public Engine createEngine(){
        return new AffordableEngine();
    }

    public Transmission createTransmission(){
        return new AffordableTransmission();
    }

    public Interior createInterior(String color){
        return new AffordableInterior(color);
    }
}
