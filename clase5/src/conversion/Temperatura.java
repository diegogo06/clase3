package conversion;

import static constantes.TemperaturaEnteros.CERO;
public class Temperatura {

    public double getCentigrados() {
        return centigrados;
    }

    public void setCentigrados(double centigrados) {
        this.centigrados = centigrados;
    }

    private double centigrados;

  public Temperatura() {

      this.centigrados =CERO.getValor();
  }

}
