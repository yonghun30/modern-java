package lambda.sec02;

public interface IntSequence {
    default boolean hasNext() { return true; }
    int next();
}