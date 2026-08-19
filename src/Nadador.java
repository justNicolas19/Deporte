import java.util.Locale;

public class Nadador extends Deportista {
    private double distancia;
    private double tiempo;
    private String estilo;

    public Nadador(){
    }

    public Nadador(String nombre, int edad, String pais, int horasDeRendimiento, double distancia, double tiempo, String estilo) {
        super(nombre, edad, pais, horasDeRendimiento);
        this.distancia = distancia;
        this.tiempo = tiempo;
        this.estilo = estilo;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public double getTiempo() {
        return tiempo;
    }

    public void setTiempo(double tiempo) {
        this.tiempo = tiempo;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    @Override
    public String toString() {
        return "Nadador{" +
                "distancia=" + distancia +
                ", tiempo=" + tiempo +
                ", estilo='" + estilo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", pais='" + pais + '\'' +
                ", horasDeRendimiento=" + horasDeRendimiento +
                '}';
    }
    public double calcularVelocidad(){
        double porcentaje = 0;
        switch (estilo.toLowerCase()){

            case "libre":
                porcentaje = 0.10;
                break;

            case "espalda":
                porcentaje = 0.08;
                break;

            case "pecho":
                porcentaje = 0.06;
                break;

            case "mariposa":
                porcentaje = 0.12;
                break;
        }
        return porcentaje;


    }

    public double calcularRendimientoBase(){
        return calcularVelocidad()*horasDeRendimiento;
    }





    @Override
    public double calcularRendimiento() {

        double rendimientoBase = calcularRendimientoBase();
        double bono = rendimientoBase * 0.12;
        return rendimientoBase + bono;
    }
    public void mostrarDetalles(){
        System.out.println("DISTANCIA" + distancia);
        System.out.println("TIEMPO" + tiempo);
        System.out.println("ESTILO" + estilo);
    }
}
