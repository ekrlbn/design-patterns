package visitor;

public interface Item {
    double accept(Visitor v);
}
