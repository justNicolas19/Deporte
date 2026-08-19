public class Corredor extends Deportista {
    private double distancia;
    private double tiempo;

    public Corredor(){

    }
    public Corredor(double distancia, double tiempo) {
        this.distancia = distancia;
        this.tiempo = tiempo;
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

    @Override
    public String toString() {
        return "Corredor{" +
                "distancia=" + distancia +
                ", tiempo=" + tiempo +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", pais='" + pais + '\'' +
                ", horasDeRendimiento=" + horasDeRendimiento +
                '}';
    }
    public double calcularVelocidad(){
        return this.distancia/this.tiempo;
    }

    @Override
    public double calcularRendimiento(){
        double velocidad = calcularVelocidad();
        return velocidad * horasDeRendimiento;
    }
    public void mostrarDetalles(){
        System.out.println("Distancia" + distancia);
        System.out.println("Tiempo" + tiempo);
    }
}
