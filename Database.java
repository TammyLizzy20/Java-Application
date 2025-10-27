public class Database
    public static void main(String[] args) {
        byte myAge = 37;
        short quantity =40000;
        int nigeriaPopulation = 4000000;
        long worldsPopulation = 700000000000L;
        float price = 458.315F;
        double balance = 345678927.657657;
        char symbol = '$';
        boolean isJavaFun = true;

        System.out.printf("I am %d years old%n", myAge);
        System.out.printf("The population of Nigeria is %d%n", nigeriaPopulation);
        System.out.printf("The world's population is %d%n", worldsPopulation);
        System.out.printf("The price of 2 books is %.2f%n", price);
        System.out.printf("My account balance is %c%.2f%n", symbol, balance);
        System.out.printf("Is Java fun? %b%n", isJavaFun);
    }
}


