package visitor;

public interface Visitor {
    double visitItem(Phone phone);

    double visitItem(Computer computer);

}
