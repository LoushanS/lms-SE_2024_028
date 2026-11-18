package lms.Model;


public class Student extends Member {

    private static final int BORROW_LIMIT = 3;

    public Student(String memberId, String name) {
        super(memberId, name, BORROW_LIMIT);
    }
}

