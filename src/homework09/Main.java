package homework09;

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Иван", "Тургенев");
        Author author2 = new Author("Михаил", "Булгаков");
        Book book1 = new Book("Отцы и дети", author1, 1861);
        Book book2 = new Book("Мастер и Маргарита", author2, 1967);
        book1.setYearPublishing(1862);
        System.out.println(book1.getTitle() + " " + book1.getYearPublishing() + " " + book1.getAuthorName().getTotalName());
        System.out.println(book2.getTitle() + " " + book2.getYearPublishing() + " " + book2.getAuthorName().getTotalName());
    }
}
