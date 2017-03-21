package exceptions;

public class DefaultUncaughtExceptionHandlerDemo {
    public static void main(String[] args) {
        Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread thread, Throwable ex) {
                System.err.println(ex.getMessage());
                System.err.println("Goodbye, cruel world!");
            }
        });
        System.out.println(1 / 0);
    }
}
