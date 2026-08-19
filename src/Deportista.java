public abstract class Deportista {
    protected String nombre;
    protected int edad;
    protected String pais;
    protected int horasDeRendimiento;

    public Deportista() {
    }

    public Deportista(String nombre, int edad, String pais, int horasDeRendimiento) {
        this.nombre = nombre;
        this.edad = edad;
        this.pais = pais;
        this.horasDeRendimiento = horasDeRendimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getHorasDeRendimiento() {
        return horasDeRendimiento;
    }

    public void setHorasDeRendimiento(int horasDeRendimiento) {
        this.horasDeRendimiento = horasDeRendimiento;
    }

    @Override
    public String toString() {
        return "Deportista{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", pais='" + pais + '\'' +
                ", horasDeRendimiento=" + horasDeRendimiento +
                '}';
    }

    public void mostrarInofrmacion(){
        System.out.println("Nombre" + nombre);
        System.out.println("Edad" + edad);
        System.out.println("Pais" + pais);
        System.out.println("Horas Entrenamiento" + horasDeRendimiento);

    }

    public abstract double calcularRendimiento();
}
