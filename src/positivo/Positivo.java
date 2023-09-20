package positivo;
import java.util.Scanner;
/**
 *
 * @author KEVIN
 */
public class Positivo {
    public void pos(){
        float numero;
        Scanner ent = new Scanner(System.in);
        System.out.println("Introduce un numero real");
        numero=ent.nextFloat();
        if (numero>0){
            System.out.println("El numero "+numero+" es mayor a cero");
        }
    }
    public static void main(String[] args) {
        Positivo p = new Positivo();
        p.pos();
    }
    
}
