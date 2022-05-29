package ru.netology.domain;

public class Post {


    public String name; // поле для имени
    public String surname; //поле для фамилии
    public String patronymic; // поле для отчества
    public String passport;

    public boolean subscription; // согласие на получение рассылки
    public String phone;

    FormDate birthday = new FormDate();


}
