import java.util.Objects;

public class Friend {
    private String name;
    private String number;
    public Friend(String name, String number) {
        this.name = name;
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Friend friend = (Friend) o;
        return Objects.equals(name, friend.name) && Objects.equals(number, friend.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, number);
    }

    @Override
    public String toString() {
        return "Friend{" +
                "name='" + name + '\'' +
                ", number='" + number + '\'' +
                '}';

    }
}
