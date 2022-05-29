package ru.netology.domain;

public class Main {
    public static void main(String[] args) {
        Post post = new Post();

        post.birthday = new FormDate();
        post.name = "Иван";
        post.passport = "4444 № 444444"; //В номере паспорта 6 цифр
        post.patronymic = "Ивонович";
        post.phone = "+7 (999)-999-99-99";
        post.surname = "Иванов";
        post.subscription = true;
        post.birthday.day = 13;
        post.birthday.month = 06;
        post.birthday.year = 1999;
    }
}