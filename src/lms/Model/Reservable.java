
package lms.Model;

public interface Reservable {

    void reserve(Member member);

    void cancelReservation();

    boolean isReserved();
}
