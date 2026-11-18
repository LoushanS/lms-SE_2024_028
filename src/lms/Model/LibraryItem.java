
package lms.Model;

public abstract class LibraryItem implements Loanable {

    private String id;
    private String title;
    private boolean isBorrowed;

    public LibraryItem(String id, String title) {
        setId(id);
        setTitle(title);
        this.isBorrowed = false;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setId(String id) {
        if (id == null || id.isBlank()) {
            throw new IllegalArgumentException("ID cannot be blank");
        }
        this.id = id;
    }

    public void setTitle(String title) {
        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException("Title cannot be blank");
        }
        this.title = title;
    }

    public void setBorrowed(boolean borrowed) {
        this.isBorrowed = borrowed;
    }

    @Override
    public void loan(Member member) {
        if (isBorrowed) {
            System.out.println(title + " is already on loan.");
        } else if (member.getBorrowedCount() >= member.getMaxBorrowLimit()) {
            System.out.println(member.getName() + " has reached the borrowing limit.");
        } else {
            setBorrowed(true);
            member.incrementBorrowedCount();
            System.out.println(title + " loaned to " + member.getName());
        }
    }

    @Override
    public void returnItem() {
        setBorrowed(false);
        System.out.println(title + " returned.");
    }

    public abstract double calculateLateFee(int daysLate);

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                "{id='" + id +
                "', title='" + title +
                "', borrowed=" + isBorrowed + "}";
    }
}
