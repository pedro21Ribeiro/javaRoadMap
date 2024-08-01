import java.time.*;

public class dateTimeExample {
    public static void main(String[] args){
        LocalDate today = LocalDate.now();
        System.out.println("Hoje é dia: " + today);

        LocalTime time = LocalTime.now();
        System.out.println("A hora é: " + time);

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Dia e hora juntos: " + dateTime);

        LocalDate algumDia = LocalDate.of(2024, Month.JANUARY, 1);
        System.out.println("Algum Dia: " + algumDia);

        LocalTime algumaHora = LocalTime.of(17 , 30);
        System.out.println("Alguma hora: " + algumaHora);

        LocalDateTime algumDiaHora = LocalDateTime.of(2024, Month.APRIL, 12, 21, 17, 36);
        System.out.println("Algum dia e hora :" + algumDiaHora);
    }
}