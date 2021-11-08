import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);
        Produto p1 = new Produto("Lasanha Congelada", 10);
        Produto p2 = new Produto("Talharim", 4);
        Produto p3 = new Produto("Bolo",10);
        Usuario usu = new Usuario();
        usu.setNomeusuario("admin");
        usu.setSenha("admin");

        Pessoa pessoa = new Usuario(); // objeto polimorfico
      
        pessoa.setIdade(2);
        pessoa.setNomecompleto("nana");
        System.out.println("Pessoa: "+pessoa.nomecompleto+" idade: "+pessoa.idade);
        p1.formatoSystemOut();
        System.out.print(p2.formatoString());
        p3.formatoSystemOut();
        System.out.print(usu.validar("admin", "admin"));

    }
}
