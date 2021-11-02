package Strana;

public class Main {
    public static void main(String[] args) {

        Country russia = new Country("Россия", 17100000, 146700000, "Москва", 12600000);
        Country singapur = new Country("Сингапур", 20, 20);
        System.out.println("Название страны " + singapur.getNameCountry() + "Площадь "+ singapur.getSquare() + "Популяция страны " + singapur.getPopulation() ) ;
        System.out.println( "Название страны " + russia.getSquare() +" "+ "Площадь страны " + " " + russia.getSquare() + " Столица страны " + russia.getCapitalName() + "Популяция столицы" + russia.getPopulation() + "Плотность населения " + russia.getPopulationDensity()) ;

        Country[] massive = new Country[] {
                new Country("Russia", 17100000, 146700000, "Moscow", 12600000),
                new Country("Finland", 338000, 5500000, "Helsinki", 655000),
                new Country("France", 643800, 67800000, "Paris", 2100000),
                new Country("Andorra", 467, 85400, "Andorra la Vella", 22600),
                new Country("Singapore", 725, 5700000)




        };
        System.out.println("пРИвЕТ");
        Country.printAll(massive);
            }



}
