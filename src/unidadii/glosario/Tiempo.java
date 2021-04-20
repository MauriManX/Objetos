package unidadii.glosario;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
public class Tiempo {
    public static void main(String[] args) {
        LocalDateTime fNacimiento = LocalDateTime.of(2002, 11, 18,0,0);
        LocalDateTime ONacimiento = LocalDateTime.of(2002, 01, 03,0,0);
        System.out.println(LocalDateTime.of(2055,11,18,0,0));
        System.out.println(LocalDateTime.of(2055,11,18,0,0).plusYears(64));
                System.out.println("Tu edad es de " +
  ChronoUnit.DAYS.between(ONacimiento,fNacimiento)
  + " días.");
    }
    
}
