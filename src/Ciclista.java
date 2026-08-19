public class Ciclista extends Deportista {
    private double distancia;
    private double tiempo;
    private double desnvel;

    public Ciclista(){
    }

    public Ciclista(String nombre, int edad, String pais, int horasDeRendimiento, double distancia, double tiempo) {
        super(nombre, edad, pais, horasDeRendimiento);
        this.distancia = distancia;
        this.tiempo = tiempo;
        this.desnvel = desnvel;
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

    public double getDesnvel() {
        return desnvel;
    }

    public void setDesnvel(double desnvel) {
        this.desnvel = desnvel;
    }

    @Override
    public String toString() {
        return "Ciclista{" +
                "distancia=" + distancia +
                ", tiempo=" + tiempo +
                ", desnvel=" + desnvel +
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
        System.out.println("Desnivel" + desnvel);
    }
}
