package es.ulpgc.iftt.model;

public abstract  class RelationalOperator {
    private OPERATOR operator;

    // Map<OPERATOR, Operator> operators

    public RelationalOperator(OPERATOR operator) {
        this.operator = operator;
    }

    public boolean evaluate(Object left_object, Object right_object){
        boolean result;
        switch (this.operator){
            case EQUAL:
                result = equal(left_object, right_object);
                break;
            case NOT_EQUAL:
                result = not_equal(left_object, right_object);
                break;
            case LESS_THAN:
                result = less_than(left_object, right_object);
                break;
            case GREATER_THAN:
                result = greater_than(left_object, right_object);
                break;
            case LESS_EQUAL_THAN:
                result = less_equal_than(left_object, right_object);
                break;
            case GREATER_EQUAL_THAN:
                result = greater_equal_than(left_object, right_object);
                break;
            default:
                result = false;
        }
        return result;
    }

    protected abstract boolean greater_equal_than(Object left_object, Object right_object);

    protected abstract boolean less_equal_than(Object left_object, Object right_object);

    protected abstract boolean greater_than(Object left_object, Object right_object);

    protected abstract boolean less_than(Object left_object, Object right_object);

    protected abstract boolean not_equal(Object left_object, Object right_object);

    protected abstract boolean equal(Object left_object, Object right_object);

    // public static Factory(OPERATOR operator){
    //     return
    // }

}
