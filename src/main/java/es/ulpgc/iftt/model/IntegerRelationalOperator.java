package es.ulpgc.iftt.model;

public class IntegerRelationalOperator extends RelationalOperator {


    public IntegerRelationalOperator(OPERATOR operator) {
        super(operator);
    }

    @Override
    protected boolean greater_equal_than(Object left_object, Object right_object) {
        return ((Integer)left_object).intValue() >= ((Integer)right_object).intValue();
    }

    @Override
    protected boolean less_equal_than(Object left_object, Object right_object) {
        return ((Integer)left_object).intValue() <= ((Integer)right_object).intValue();
    }

    @Override
    protected boolean greater_than(Object left_object, Object right_object) {
        return ((Integer)left_object).intValue() > ((Integer)right_object).intValue();
    }

    @Override
    protected boolean less_than(Object left_object, Object right_object) {
        return ((Integer)left_object).intValue() < ((Integer)right_object).intValue();
    }

    @Override
    protected boolean not_equal(Object left_object, Object right_object) {
        return ((Integer)left_object).intValue() != ((Integer)right_object).intValue();
    }

    @Override
    protected boolean equal(Object left_object, Object right_object) {
        return ((Integer)left_object).intValue() == ((Integer)right_object).intValue();
    }
}
