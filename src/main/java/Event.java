@FunctionalInterface
public interface Event<A, B, C>
{
    public abstract void Action(A a, B b, C c);
}