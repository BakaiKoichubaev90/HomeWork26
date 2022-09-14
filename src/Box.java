public class  Box <T>  {
    T args;

    @Override
    public String toString() {
        return "Box{" +
                "args=" + args +
                '}';
    }

    public Box() {
    }

   public static <T>Box generic() {
        return new Box<T>();
       }

    }

