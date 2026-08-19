import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        List<Deportista> lsDeportista= new ArrayList<>();

        Corredor corredor1 = new Corredor("Juan", 21, "Colombia", 24, 15, 13.5);
        Ciclista ciclista1 = new Ciclista("Nicolas", 24, "Colombia", 24, 14, 13.5);
        Nadador nadador1 = new Nadador("Camilo", 19, "Mexico", 23, 13, 45, "libre");

        lsDeportista.add(corredor1);
        lsDeportista.add(ciclista1);
        lsDeportista.add(nadador1);

        for (Deportista d1:lsDeportista){
            System.out.println(d1);
        }
    }
}