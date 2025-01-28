package abhi.practice.immutable;

import java.util.Arrays;

public final class Car {

   private final String brand;
   private final int make ;
   private final Owner owner;
   private final int[] colorIds;

    Car(String brand, int make, Owner owner,int[] colorIds ){
        this.brand = brand;
        this.make = make;
        this.owner = owner.clone();
        this.colorIds = Arrays.copyOf(colorIds, colorIds.length);
    }

    @Override
    public String toString() {
        //Java reserved keywords
            // abstract
            // continue
            // for
            // new
            // switch
            // assert
            // default
            // if
            // package
            // synchronized
            // boolean
            // do
            // goto
            // private
            // this
            // break
            // double
            // implements
            // protected
            // throw
            // byte
            // else
            // import
            // public
            // throws
            // case
            // enum
            // instanceof
            // return
            // transient
            // catch
            // extends
            // int
            // short
            // try
            // char
            // final
            // interface
            // static
            // void
            // class
            // finally
            // long
            // strictfp
            // volatile
            // const
            // float
            // native
            // super
            // while
            // _ (underscore)

        //Java contextual keywords
            int with;
            int exports;
            int module;
            int transitive;
            int provides;
            int opens;
            int permits;
            int to;
            int requires;
            int sealed;
            int when;
            int uses;
            int var;
            int open;
            int yield;
            int record;
          // non-sealed
    short s2 = '\u0000';



         return "Car{" +
                "brand='" + brand + '\'' +
                ", make=" + make +
                ", owner=" + owner +
                '}';
    }
}
