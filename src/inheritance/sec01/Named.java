package inheritance.sec01;

public interface Named {
    default String getName() { return ""; }
}