package Strana;

public class Country {
    private String nameCountry;
    private int square;
    private int population;
    private String capitalName;
    private int capitalPopulation;

    public Country(String nameCountry, int square, int population) {
        setNameCountry(nameCountry);
        setSquare(square);
        setPopulation(population);
    }

    public Country(String nameCountry, int square, int population,
                   String capitalName, int capitalPopulation) {
        this(nameCountry, square, population);
        setCapital(capitalName, capitalPopulation);
    }

    public String getNameCountry() {
        return nameCountry;
    }

    public void setNameCountry(String nameCountry) {
        if(nameCountry != null && nameCountry.equals(""))
            throw new IllegalArgumentException("Название страны не может быть ссылкой");else {
        this.nameCountry = nameCountry;}
    }

    public int getSquare() {
        return square;
    }

    public void setSquare(int square) {
        if(square <= 0)
            throw new IllegalArgumentException("Площадь не может быть нулём"); else {
        this.square = square;
    }}

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        if(population <= 0)
            throw new IllegalArgumentException("Население страны не может быть нулём");else {
        this.population = population;}
    }

    public float getPopulationDensity() {
        return ((float)population) / square;
    }

    public String getCapitalName() {
        return capitalName;
    }

    public int getCapitalPopulation() {
        return capitalPopulation;
    }

    public void setCapital(String capitalName, int capitalPopulation) {
        if(capitalName != null && !capitalName.equals("")) {
            if(capitalPopulation <= 0)
                throw new IllegalArgumentException("Население столицы не может быть 0");
        } else {
            capitalPopulation = 0;
        }
        this.capitalName = capitalName;
        this.capitalPopulation = capitalPopulation;
    }

    public void print() {
        System.out.println(nameCountry + "; Площадь страны " + square + "; Насление " + population
                + "; Плотность страны " + getPopulationDensity());
        if(capitalName != null)
            System.out.println("Столица " + capitalName
                    + " Население столицы " + capitalPopulation);
        System.out.println();
    }

    public static void printAll(Country[] massive) {
        for(Country mass: massive)
            mass.print();
    }
}
