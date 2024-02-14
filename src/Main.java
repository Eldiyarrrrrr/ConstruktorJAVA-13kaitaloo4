import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        /** Создайте класс Reader с полями
         (full/Name, cardNumber,
         library(библиотека),
         phone Number).
         dateOfBirth,
         Методы takeBook, returnBook).
         takeBook, будет принимать в качестве параметра количество взятых книг.
         Выводит на консоль сообщение "Петров В. В. взял 3 книги".
         Метод returnBook(). Выводит на консоль сообщение "Петров В. В.
         вернул 3 книги" **/


        Reader reader = new Reader();
        System.out.println(Reader.takeBook(reader));
        Reader.returnBook(reader);


    }
}