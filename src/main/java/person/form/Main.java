package person.form;

public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Рита";
        post.passport = "4568 №123456";
        post.patronymic = "Юрьевна";
        post.phone = "986_901_05_60";
        post.surname = "Мингазова";
        post.subscription = true;

        post.birthday = new FormDate();
        post.birthday.day = 21;
        post.birthday.month = 6;
        post.birthday.year = 1994;
    }
}
