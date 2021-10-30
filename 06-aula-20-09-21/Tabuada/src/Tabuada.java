
public class Tabuada {
    int number;

    Tabuada(int number) {
        this.number = number;
    }

    void gerar() {
        for (int i = 1; i <= 10; i++) {
            int results = i * number;
            System.out.println(number + " x " + i + " = " + results);
        }
    }
}
