public class App {
    public static void main(String[] args) throws Exception {
        String message;

        // Classe Cliente
        Cliente cliente = new Cliente();

        cliente.nome = "Carla";
        cliente.email = "carla@email.com";
        cliente.dataNasc = "12/10/2000";

        System.out.println("------------------------------");
        System.out.println("--- Informações do cliente ---\n");
        System.out.println("O cliente é: " + cliente.nome);
        System.out.println("O seu e-mail é: " + cliente.email);
        System.out.println("Sua data de nascimento é: " + cliente.dataNasc);
        System.out.println("\n--- Método `comprarCurso` ---\n");

        message = cliente.comprarCurso("Gastronomia");
        System.out.println(message);

        System.out.println("\n--- Método `avaliarCurso` --- \n");

        message = cliente.avaliarCurso("Gastronomia", 10);
        System.out.println(message);

        // Classe Curso
        Curso curso = new Curso();

        curso.nome = "Gastronomia";
        curso.assunto = "Alimentação";
        curso.dataCurso = "05/09/2023";

        System.out.println("\n------------------------------");
        System.out.println("--- Informações do curso ---\n");
        System.out.println("O curso é: " + curso.nome);
        System.out.println("O assunto é: " + curso.assunto);
        System.out.println("A data é: " + curso.dataCurso);
        System.out.println("\n--- Método `assistirCurso` ---\n");

        message = curso.assistirCurso("Gastronomia");
        System.out.println(message);

        System.out.println("\n--- Método `getAssuntoCurso` --- \n");

        message = curso.getAssuntoCurso("Gastronomia");
        System.out.println(message);

        System.out.println("\n--- Método `getDataCurso` --- \n");

        message = curso.getDataCurso("Gastronomia");
        System.out.println(message);
    }
}
