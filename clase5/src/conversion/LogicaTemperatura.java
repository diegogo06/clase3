package conversion;
import static constantes.TemperaturaEnteros.*;
public class LogicaTemperatura extends Temperatura{

    public double calcularTemperaturaFarenheit()
    {
        return (this.getCentigrados() * NUEVE.getValor()/CINCO.getValor())+TREINTAYDOS.getValor();

    }

}
