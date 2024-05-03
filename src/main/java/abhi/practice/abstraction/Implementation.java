package abhi.practice.abstraction;

public class Implementation extends Abstract implements InterfaceA, InterfaceB{

    @Override
    public void print() {
        System.out.println("Interface A");
    }

   void main() {
        Implementation imp = new Implementation();

        imp.print();
        InterfaceB b = imp;
        b.print();
        InterfaceA a = imp;
        a.print();
    }
}
