public class Main {
    public static void main(String[] args) {
        String name = "Jodhveer";
        String country = "Canada";
        int age = 20;
        String school = "KPU";
        char grade = 'A';
        String formattedString = String.format("My name is %s, I live in %s, I am %d years old and I go to %s to study. I got an %c", name, country, age, school, grade);

        System.out.println(formattedString);
    }
}