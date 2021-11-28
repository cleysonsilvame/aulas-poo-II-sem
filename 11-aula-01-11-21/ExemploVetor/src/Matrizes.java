import javax.swing.JOptionPane;

public class Matrizes {
    public static void main(String[] args) {
        // matriz em branco = todos os seus valores são 0
    // matriz de 3 linbhas e 5 colunas
    int a[][] = new int[3][5];
    // só permite um tipo de dados


    // criar a matriz com valores pré definidos
    int m [][] = {// matriz 2 linhas e 3 colunas
        {8,6,3},// linha = 0
        {7,-1,8} // linha 1
    };

    System.out.println(m[0][2]+ " QTD linhas matriz m: "+ m.length+
                     "\n QTD de colunas na linha  0: "+ m[0].length+ 
                     "\n QTD de colunas na linha 1: "+ m[1].length); 
    // m[linha][coluna] 
    //linha = 0 até n-1 
    //coluna =0 até n-1

    
    String nome[][] = new String [10][2];
    
    for(int linha = 0; linha < 10; linha++){
        for(int coluna = 0; coluna<2; coluna++){
            nome[linha][coluna] = JOptionPane.showInputDialog(null, "Digite o nome");
        }
    }

}

}