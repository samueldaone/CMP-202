public interface Electronic {

    boolean onoroff = false;

    boolean on();

    boolean off();

    default void Electronic() {
        if (onoroff) {
            System.out.println("Default");
        }


    }


}
