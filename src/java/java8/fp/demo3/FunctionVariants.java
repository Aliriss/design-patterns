package java.java8.fp.demo3;

import java.util.function.*;

/**
 * @author all
 * @since 2023/9/20 11:55
 */

public class FunctionVariants {
    static Function<Foo, Bar> f1 = Bar::new;
    static IntFunction<IBaz> f2 = IBaz::new;
    static LongFunction<LBaz> f3 = LBaz::new;
    static DoubleFunction<DBaz> f4 = DBaz::new;
    static ToIntFunction<IBaz> f5 = ib -> ib.i;
    static ToLongFunction<LBaz> f6 = lb -> lb.l;
    static ToDoubleFunction<DBaz> f7 = db -> db.d;
    static IntToLongFunction f8 = i -> i;
    static IntToDoubleFunction f9 = i -> i;
    static LongToIntFunction f10 = l -> (int)l;
    static LongToDoubleFunction f11 = l -> l;
    static DoubleToIntFunction f12 = d -> (int)d;
    static DoubleToLongFunction f13 = d -> (long)d;

    public static void main(String[] args) {
        Bar b = f1.apply(new Foo());
        IBaz ib = f2.apply(11);
        LBaz lb = f3.apply(11);
        DBaz db = f4.apply(11);
        int i = f5.applyAsInt(ib);
        long l = f6.applyAsLong(lb);
        double d = f7.applyAsDouble(db);
        l = f8.applyAsLong(12);
        d = f9.applyAsDouble(12);
        i = f10.applyAsInt(12);
        d = f11.applyAsDouble(12);
        i = f12.applyAsInt(12);
        l = f12.applyAsInt(12);
    }

}
