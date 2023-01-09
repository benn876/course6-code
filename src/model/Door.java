package model;

public class Door {
    private boolean status = true;

    public boolean isOpen() {
        return this.status;
    }

    public void setStatus(boolean status) {
        System.out.printf("Choose the status of the door -> %s%n", status);
        //gdfg654.status = status
        this.status = status;
    }

    @Override
    public String toString() {
        return "This is the status of door %s".formatted(this.status);
    }
}
