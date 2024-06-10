public class Storage {
    @Override
    public String toString() {
        return "Storage{" +
                "type='" + type + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", capacity=" + capacity +
                '}';
    }

    String type  = "SSD";

    String manufacturer = "SamSung";

    int capacity = 512;
}
