package statics.innerClasses;


/*
 * Classes internas são classes dentro de classes. Classes externas (Que não tem nenhuma classe acima)
 * Não podem ser static (Já que não existe uma classe maior a qual elas pertecem)
 * Já uma classe interna pode ser static, já que ela pertence a alguma outra classe
 */

public class Main {
    static class Test{
        String linha;
    
        Test (String linha){
            this.linha = linha;
        }

        /*
         * Mesmo a classe sendo static a propriedade 'linha' não é, a classe Test pertence a classe maior 'Main'
         * Porém a propriedade linha pertence a um objeto do tipo test. Ou seja para criar uma classe test não é
         * necessário criar um objeto Main para poder usar a Test, mas para acessar a propriedade linha é preciso
         * criar um objeto do tipo Test, já que ele em si não é static
         */
    }    

    static class test2 {
        //Dessa forma se pode acessar a propriedade linha sem inicializar um objeto test2
        static String linha = "ABC";
    }

    public static void main(String[] args) {
        Test a = new Test("Hello World");
        System.out.println(a.linha);
        System.out.println(test2.linha);
    }
}
