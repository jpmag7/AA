package Factory;
import Engine.Engine;
import Interior.Interior;
import Transmission.Transmission;

public interface CarFactory {
    Engine createEngine();
    Transmission createTransmission();
    Interior createInterior(String color);
}
