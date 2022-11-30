public class Main {
    public static void calculate(int chislo) {
        int stepen = 2;
        System.out.printf("Число " + chislo + " в квадрате равно %.0f \n", Math.pow(chislo, stepen));
    }
    public static void main(String[] args) {
        calculate(5);
    }
}