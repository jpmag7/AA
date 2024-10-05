package Factory;

import Engine.CheapEngine;
import Engine.Engine;
import Interior.CheapInterior;
import Interior.Interior;
import Transmission.CheapTransmission;
import Transmission.Transmission;

public class CheapCarFactory implements CarFactory {
    
    public Engine createEngine(){
        return new CheapEngine();
    }

    public Transmission createTransmission(){
        return new CheapTransmission();
    }

    public Interior createInterior(String color){
        return new CheapInterior(color);
    }
}
