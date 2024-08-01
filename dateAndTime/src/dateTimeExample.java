import java.time.*;

public class dateTimeExample {
    public static void main(String[] args){
        //dateTimeBasic();
        dateTimeOperations();
    }
    
    private static void dateTimeBasic(){
        //data do sistema
        LocalDate today = LocalDate.now();
        System.out.println("Hoje é dia: " + today);

        //Hora do sistema
        LocalTime time = LocalTime.now();
        System.out.println("A hora é: " + time);

        //data e hora do sistema
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Dia e hora juntos: " + dateTime);

        //data formatado
        LocalDate algumaData = LocalDate.of(2024, Month.JANUARY, 1);
        System.out.println("Algum Dia: " + algumaData);

        //Hora formatada
        LocalTime algumaHora = LocalTime.of(17 , 30);
        System.out.println("Alguma hora: " + algumaHora);

        //data e hora formatada
        LocalDateTime algumaDataHora = LocalDateTime.of(2024, Month.APRIL, 12, 21, 17, 36);
        System.out.println("Algum dia e hora :" + algumaDataHora);
    }
    
    private static void dateTimeOperations(){
        LocalDate data = LocalDate.of(2004, Month.JULY, 21);
        LocalTime hora = LocalTime.of(4, 26, 37);

        //Unindo data com hora
        LocalDateTime dataHora = data.atTime(hora);
        System.out.println("data e hora unidos: " + dataHora);

        //Unindo a hora com o data
        LocalDateTime horaData = hora.atDate(data);
        System.out.println("Hora e dia unidos: " + horaData);

        //Extraindo o data de um dateTime
        LocalDate dataExtraido = dataHora.toLocalDate(); 
        System.out.println("Dia: " + dataExtraido );

        //Extraindo a hora de um dateTime
        LocalTime horaExtraida = dataHora.toLocalTime();
        System.out.println("Hora: " + horaExtraida);

        //Extraindo Ano, Mês e data de um dateTime
        int ano = dataHora.getYear();
        Month mes = dataHora.getMonth();
        int dia = dataHora.getDayOfMonth();
        System.out.println("Ano: " + ano + "|Mes: " + mes + "|Dia: " + dia);
        
        //Extraindo hora minuto e segundo
        int time = dataHora.getHour();
        int minuto = dataHora.getMinute();
        int segundo = dataHora.getSecond();

        System.out.println("Hora: " + time + "|Minuto: " + minuto + "|Segundos: " + segundo);
    }
}