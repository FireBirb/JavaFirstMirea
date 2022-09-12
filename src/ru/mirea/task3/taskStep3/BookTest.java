package ru.mirea.task3.taskStep3;

public class BookTest {
    public static void main(String[] args) {
        Book b = new Book();
        b.setAuthor("A");
        b.setName("A cool book");
        b.setYear(666);
        b.setPlace("Here");
        b.setNum_pages(10);
        System.out.print(b.getYear() + "\n" + b.getNum_pages() + "\n" + b.getAuthor() + "\n" + b.getName() + "\n" + b.getPlace());
    }
}
