import java.time.*;
import java.util.Scanner;

public class aniversario {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        LocalDate nascimento = LocalDate.now();


        System.out.print("Digite o ano de seu nascimento (AAAA): ");
        int ano = Integer.parseInt(myScanner.nextLine());

        System.out.print("Digite o Mês de seu nascimento (MM): ");
        int mes = Integer.parseInt(myScanner.nextLine());
        
        System.out.print("Digite o Dia de seu nascimento (DD): ");
        int dia = Integer.parseInt(myScanner.nextLine());

        myScanner.close();

        try {
            nascimento = LocalDate.of(ano, mes, dia);
        }
         catch (Exception e) {
            System.out.println("Data inválida");
            System.exit(0);
        }

        Period tempoRestanteAniversario = proxAniversario(nascimento);
        int age = idade(nascimento);

        System.out.println("Falta " + tempoRestanteAniversario.getDays() + " dias e "
            + tempoRestanteAniversario.getMonths() + " meses para seu próximo aniversário");
        System.out.println("Atualmente você tem " + age + " e fara " + (age + 1) + " no próximo ano");
    }
    
    private static Period proxAniversario(LocalDate nasc){
        Period resultado;
        
        LocalDate hoje = LocalDate.now();
    
        nasc = LocalDate.of(hoje.getYear() + 1, nasc.getMonth(), nasc.getDayOfMonth());
        
        resultado = Period.between(hoje, nasc);
        
        return resultado;
    }

    private static int idade (LocalDate nasc){
        int idade;
        LocalDate hoje = LocalDate.now();

        idade = hoje.getYear() - nasc.getYear();

        if(nasc.getMonthValue() > hoje.getMonthValue()){
            idade--;
        }else if(hoje.getMonthValue() == nasc.getMonthValue() && nasc.getDayOfMonth() > hoje.getDayOfMonth()){
            idade--;
        }

        return idade;
    }
}
