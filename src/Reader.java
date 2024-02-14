import java.time.LocalDate;

public class Reader {
    String fullname;
    int library;
    String phoneNumber;
    LocalDate dateOfBirth;
    String cardNumber;

    public Reader() {
    }



    public static int takeBook(Reader reader) {
        reader.fullname = "Petr yan";
        reader.library = 3;
        reader.phoneNumber = "0995002331";
        reader.dateOfBirth = LocalDate.of(2003, 02, 23);
        reader.cardNumber = "1234567891";
        System.out.print(reader.fullname + " " + "Ushuncha kitep aldy: ");
        return reader.library;
    }

    public static void returnBook(Reader reader) {
        System.out.println(" ");
        reader.fullname = "Petr yan";
        reader.library = 3;
        reader.phoneNumber = "0995002331";
        reader.dateOfBirth = LocalDate.of(2003, 02, 23);
        reader.cardNumber = "1234567891";
        System.out.print(reader.fullname + " " + "Ushuncha kitep kaitardy: ");
        System.out.println(reader.library);

    }
}

