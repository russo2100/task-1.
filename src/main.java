public class Main {
    public static void main(String[] args) {

        int amount = 2500;
        boolean paimant = true;

        int bonus;
        if (paimant) {
            bonus = 20;
        } else {
            bonus = 0;
        }
        int miles = amount / bonus;
        System.out.println("Начисленно бонусных милей:"  + miles);

        // Объявляете переменные для входных данных и
        // параметров программы: одну для хранения
        // стоимости билета, другую для хранения количества
        // рублей для одной бонусной милли

        // Рассчитываете количество бонусных милль, используя
        // значения заведённых переменных. Ответ сохраняете в
        // новую переменную и выводите на экран
    }
}
