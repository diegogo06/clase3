package impuestos;
import static constantes.ParafiscalesEnteros.*;
import static constantes.ParafiscalesDouble.*;

public class ParafiscalesLogica extends ParafiscalesNombre {

    public double calcularsalud() {

        if (this.getSalario() > NOVECIENTOS.getNumero()) {
          return (this.getSalario()*CERO_PUNTO_CUATRO.getDescuento());
        }
        else
            {
                return (this.getSalario()*CERO_PUNTO_DOS.getDescuento());
            }
    }

    public double calcularPension() {

        if (this.getSalario() > NOVECIENTOS.getNumero()) {
            return (this.getSalario()*CERO_PUNTO_CINCO.getDescuento());
        }
        else
        {
            return (this.getSalario()*CERO_PUNTO_TRES.getDescuento());
        }
    }


    public double totalSalario() {

        return this.getSalario() - (this.calcularsalud()+this.calcularPension());
    }
}