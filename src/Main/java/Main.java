public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Вадим";
        post.patronymic = "Алексеевич";
        post.surname = "Грач";
        post.phone = "+79874582146";
        post.passport = "4444 № 444444";
        post.subscription = true;
        post.birthday = new FormDate();
        post.birthday.Day = 14;
        post.birthday.Month = 7;
        post.birthday.Year = 1996;



    }
}
