import javax.imageio.plugins.tiff.GeoTIFFTagSet;

public class Main {
    public static void main(String[] args) {
        Gryffindor potter = new Gryffindor("Поттер", 65, 46, 74, 85, 34);
        Gryffindor germiona = new Gryffindor("Гермиона", 78, 98, 23, 78, 99);
        Gryffindor weasley = new Gryffindor("Уизли", 78, 98, 99, 46, 99);
        Slytherin malfoy = new Slytherin("Малфой", 78, 23, 99, 78, 99, 35 ,53);
        Slytherin montague = new Slytherin("Монтегю", 78, 98, 99, 78, 99,35 ,53);
        Slytherin goyle = new Slytherin("Гойл", 78, 98, 34, 64, 99,35 ,53);
        Hufflepuff smith = new Hufflepuff("Смит", 63, 23, 24, 23, 99);
        Hufflepuff diggory = new Hufflepuff("Диггори", 78, 35, 53, 78, 92);
        Hufflepuff justin = new Hufflepuff("Джастин", 78, 98, 23, 53, 99);
        Ravenclaw chang = new Ravenclaw("Чанг", 0, 23, 67, 78, 99,8);
        Ravenclaw patil = new Ravenclaw("Патил", 23, 67, 45, 87, 45,87);
        Ravenclaw belby = new Ravenclaw("Белби", 65, 34, 3, 6, 2,8);
        System.out.println(montague);
        weasley.comparisonGryffindorStudents(germiona);
        potter.comparingMagic(malfoy);
    }
}