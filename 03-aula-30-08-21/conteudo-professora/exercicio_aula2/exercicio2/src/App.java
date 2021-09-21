public class App {
    public static void main(String[] args) throws Exception {
     Paciente paciente1 = new Paciente("Jessica");
     Paciente paciente2 = new Paciente();

     paciente1.datanascimento = "11/12/1988";
     paciente1.endereco = "R. lalala, 86 papapa. jajaj - sp";
     paciente1.rg = "8881118778";
     paciente1.telefone = "11111111111";
     paciente1.profissao = "sei la";

     paciente2.setNome("Marcelo");
     paciente2.setDatanascimento("19/08/1996");
     paciente2.setEndereco("endereco");
     paciente2.setRg("1111111111");
     paciente2.setProfissao("profissao");
     paciente2.setTelefone("66666666666");
     


        System.out.println("Hello, World!");
    }
}
