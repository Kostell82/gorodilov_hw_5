package gorodilov;

public class Person {
    String fio;
    String dolj;
    String mail;
    String phone;
    String zp;
    int age;


    public int getAge() {
        return age;
    }

    public Person(String fio, String dolj, String mail, String phone, String zp, int age)
    {
        this.fio = fio;
        this.dolj = dolj;
        this.mail = mail;
        this.phone = phone;
        this.zp = zp;
        this.age = age;
        System.out.println(" ФИО: " + fio + " Должность: " + dolj + " Емайл: " + mail + " Телефон: " + phone + " Зарплата: " + zp + " Возраст: " + age);
    }

}
