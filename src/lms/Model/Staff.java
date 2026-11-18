
package lms.Model;

public class Staff extends Member {

    private static final int BORROW_LIMIT = 10;

    public Staff(String memberId, String name) {
        super(memberId, name, BORROW_LIMIT);
    }
}
