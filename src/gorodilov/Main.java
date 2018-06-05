package gorodilov;

public class Main {

    public static void main(String[] args) {
        Person[] persArray = new Person[5];

        persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "+79892323120", "85000", 35);
        persArray[1] = new Person("Petrov Alexandr", "Tester", "petrov@hotmail.com", "+79234561200", "50000", 41);
        persArray[2] = new Person("Sidorov Alexey ", "Manager", "sidorov@mail.ru", "+79231987200", "60000", 30);
        persArray[3] = new Person("Sysanov Igor", "SEO", "sysanov@yandex.ru", "+79231223420", "100000", 45);
        persArray[4] = new Person("Konar Jonh", "Direktor", "konar@mailbox.com", "+79211339449", "300000", 42);

        System.out.println("\nСотрудники старше 40 лет:");

        for (int i = 0; i < 5; i++)
        {
            if (persArray[i].getAge()>40)
        System.out.println("ФИО: " + persArray[i].fio + " Должность: " + persArray[i].dolj + " Емайл: " + persArray[i].mail + " Телефон: " + persArray[i].phone + " Зарплата: " + persArray[i].zp + " Возраст: " + persArray[i].age);
        }
    }
}