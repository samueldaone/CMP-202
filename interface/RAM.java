public class RAM {

    @Override
    public String toString() {
        return "RAM{" +
                "name='" + name + '\'' +
                ", readSpeed=" + readSpeed +
                ", writeSpeed=" + writeSpeed +
                '}';
    }

    String name = "DDR5";

    int readSpeed = 3;

    float writeSpeed = 1.5f;
}
