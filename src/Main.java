public class Main {
    public static void main(String[] args) {
        System.out.println("HW 30.01.2023 lines");

        System.out.println("Задача №1");
        String firstName = "ivan";
        String middleName = "ivanovich";
        String lastName = "ivanov";
        String fullName = lastName+ " " +firstName+" "+middleName;
        System.out.println("ФИО сотрудника: "+fullName);

        System.out.println("Задача №2");
        String capitalLetters = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета: "+capitalLetters);

        System.out.println("Задача №3");
        String name = "Иванов Семён Семёнович";
        name = name.replace("ё","е");
        System.out.println("Данные ФИО сотрудника: "+name);

    }
}