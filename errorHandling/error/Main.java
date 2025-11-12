public class Main {
    public static void main(String[] args) {
        while (true) { 
            System.out.println("This line will execute until you get error.");
        }
    }
}

/*
    This will throw a java.lang.OutOfMemoryError at runtime.

    Reason: JVM runs out of memory while trying to execute your infinite loop.

    Characteristics:
        * Serious system-level error
        * Program cannot recover

    Usually occurs when memory resources are exhausted
 */