package top.ss007.learn.java;

@FunctionalInterface
public interface Fun2<P1, P2, R> {
    R invoke(P1 p1, P2 p2);
}
