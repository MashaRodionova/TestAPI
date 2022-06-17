package ru.netology.api;

public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Иван";
        post.passport = "7777 # 777777";
        post.patronymic = "Иванович";
        post.phone = "+7(495)7777777";
        post.surname = "Иванов";
        post.subscription = true;
        post.birthday = new FormDate();
        post.birthday.day = 13;
        post.birthday.month = "сент";
        post.birthday.year = 1981;
    }

}