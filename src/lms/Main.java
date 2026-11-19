
package lms;

import lms.Model.*;
import lms.Service.Library;

public class Main {

    public static void main(String[] args) {

        Library library = new Library();

        Book book = new Book("B001", "Clean Code", "Robert C. Martin");
        DVD dvd = new DVD("D001", "Introduction to Algorithms", 120);
        Magazine magazine = new Magazine("MG001", "Software Weekly", 12);

        library.addItem(book);
        library.addItem(dvd);
        library.addItem(magazine);

        Student student = new Student("M001", "Nadeesha Perera");
        Staff staff = new Staff("M002", "Mr. Kasun Silva");

        library.addMember(student);
        library.addMember(staff);

        library.printAllLateFees(3);

        System.out.println("--- Loans ---");

        library.lend(book, student);
        library.lend(book, staff);
        library.lend(dvd, staff);
        library.lend(magazine, staff);

        System.out.println("--- Reservations ---");

        library.reserveIfPossible(book, staff);
        library.reserveIfPossible(dvd, staff);

        library.printMembersByActivity();
    }
}
