package es.ulpgc.iftt.model;

import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;

public class ConditionTest {

    @Test
    public void workingWithIntegerCondition_EQUAL_ShouldAnswerWithTrue() {
        // Configure collaborators
        IntegerConcreteSensor integerconcretesensormock = mock(IntegerConcreteSensor.class);
        doReturn(0).when(integerconcretesensormock).getValue();

        Integer threshold = 0;
        RelationalOperator relationalOperator_EQUAL = new IntegerRelationalOperator(OPERATOR.EQUAL);

        // Configure SUT
        Condition condition_EQUAL = new Condition(threshold, relationalOperator_EQUAL, integerconcretesensormock);

        // Execution&Verification
        assertTrue(condition_EQUAL.evaluate());

        // Ending
    }

    @Test
    public void workingWithIntegerCondition_NOT_EQUAL_ShouldAnswerWithTrue() {
        // Configure collaborators
        IntegerConcreteSensor integerconcretesensormock = mock(IntegerConcreteSensor.class);
        doReturn(0).when(integerconcretesensormock).getValue();

        Integer threshold = 1;
        RelationalOperator relationalOperator_NOT_EQUAL = new IntegerRelationalOperator(OPERATOR.NOT_EQUAL);

        // Configure SUT
        Condition condition_NOT_EQUAL = new Condition(threshold, relationalOperator_NOT_EQUAL, integerconcretesensormock);

        // Execution&Verification
        assertTrue(condition_NOT_EQUAL.evaluate());

        // Ending
    }

    @Test
    public void workingWithIntegerCondition_LESS_THAN_ShouldAnswerWithTrue() {
        // Configure collaborators
        IntegerConcreteSensor integerconcretesensormock = mock(IntegerConcreteSensor.class);
        doReturn(0).when(integerconcretesensormock).getValue();

        Integer threshold = -1;
        RelationalOperator relationalOperator_LESS_THAN = new IntegerRelationalOperator(OPERATOR.LESS_THAN);

        // Configure SUT
        Condition condition_LESS_THAN = new Condition(threshold, relationalOperator_LESS_THAN, integerconcretesensormock);

        // Execution&Verification
        assertTrue(condition_LESS_THAN.evaluate());

        // Ending
    }

    @Test
    public void workingWithIntegerCondition_GREATER_THAN_ShouldAnswerWithTrue() {
        // Configure collaborators
        IntegerConcreteSensor integerconcretesensormock = mock(IntegerConcreteSensor.class);
        doReturn(0).when(integerconcretesensormock).getValue();

        Integer threshold = 1;

        RelationalOperator relationalOperator_GREATER_THAN = new IntegerRelationalOperator(OPERATOR.GREATER_THAN);

        // Configure SUT
        Condition condition_GREATER_THAN = new Condition(threshold, relationalOperator_GREATER_THAN, integerconcretesensormock);

        // Execution&Verification
        assertTrue(condition_GREATER_THAN.evaluate());

        // Ending
    }

    @Test
    public void workingWithIntegerCondition_LESS_EQUAL_THAN_ShouldAnswerWithTrue() {
        // Configure collaborators
        IntegerConcreteSensor integerconcretesensormock = mock(IntegerConcreteSensor.class);
        doReturn(0).when(integerconcretesensormock).getValue();

        Integer threshold_zero = 0;
        Integer threshold_one_negative = -1;
        RelationalOperator relationalOperator_LESS_EQUAL_THAN = new IntegerRelationalOperator(OPERATOR.LESS_EQUAL_THAN);

        // Configure SUT
        Condition condition_LESS_EQUAL_THAN_0 = new Condition(threshold_zero, relationalOperator_LESS_EQUAL_THAN, integerconcretesensormock);
        Condition condition_LESS_EQUAL_THAN_1 = new Condition(threshold_one_negative, relationalOperator_LESS_EQUAL_THAN, integerconcretesensormock);

        // Execution&Verification
        assertTrue(condition_LESS_EQUAL_THAN_0.evaluate() && condition_LESS_EQUAL_THAN_1.evaluate());

        // Ending
    }

    @Test
    public void workingWithIntegerCondition_GREATER_EQUAL_THAN_ShouldAnswerWithTrue() {
        // Configure collaborators
        IntegerConcreteSensor integerconcretesensormock = mock(IntegerConcreteSensor.class);
        doReturn(0).when(integerconcretesensormock).getValue();

        Integer threshold_zero = 0;
        Integer threshold_one_positive = 1;
        RelationalOperator relationalOperator_GREATER_EQUAL_THAN = new IntegerRelationalOperator(OPERATOR.GREATER_EQUAL_THAN);

        // Configure SUT
        Condition condition_GREATER_EQUAL_THAN_0 = new Condition(threshold_zero, relationalOperator_GREATER_EQUAL_THAN, integerconcretesensormock);
        Condition condition_GREATER_EQUAL_THAN_1 = new Condition(threshold_one_positive, relationalOperator_GREATER_EQUAL_THAN, integerconcretesensormock);

        // Execution&Verification
        assertTrue(condition_GREATER_EQUAL_THAN_0.evaluate() && condition_GREATER_EQUAL_THAN_1.evaluate());

        // Ending
    }

}
