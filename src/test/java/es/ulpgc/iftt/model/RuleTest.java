package es.ulpgc.iftt.model;

import org.junit.Test;
import org.mockito.ArgumentCaptor;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;

public class RuleTest {
    @Test
    public void whenExecuteRuleAllConditionsAreEvalute(){
        // Configure collaborators
        IntegerConcreteSensor ics_0 = mock(IntegerConcreteSensor.class);
        doReturn(7).when(ics_0).getValue();
        IntegerConcreteSensor ics_1 = mock(IntegerConcreteSensor.class);
        doReturn(11).when(ics_1).getValue();

        Integer thresholdforcondition_0 = 7;
        Integer thresholdforcondition_1 = 11;

        RelationalOperator ico_0 = new IntegerRelationalOperator(OPERATOR.EQUAL);
        RelationalOperator ico_1 = new IntegerRelationalOperator(OPERATOR.EQUAL);

        IntegerConcreteActuator ica_0 = mock(IntegerConcreteActuator.class);

        Integer thresholdforaction = 0;

        // Configure SUT
        Rule rule = new Rule(0, "rule_0_name", "rule_0_description...");

        rule.addCondition(new Condition(thresholdforcondition_0, ico_0, ics_0));
        rule.addCondition(new Condition(thresholdforcondition_1, ico_1, ics_1));

        rule.addAction(new Action(thresholdforaction, ica_0));

        // Execute
        rule.execute();

        // Verification
        verify(ics_0, times(1)).getValue();
        verify(ics_1, times(1)).getValue();

    }

    @Test
    public void whenExecuteRuleifAllConditionsAreEvaluatedAndAreTrueThenAllActionsArePowered(){
        // Configure collaborators
        IntegerConcreteSensor ics_0 = mock(IntegerConcreteSensor.class);
        doReturn(7).when(ics_0).getValue();
        IntegerConcreteSensor ics_1 = mock(IntegerConcreteSensor.class);
        doReturn(11).when(ics_1).getValue();

        Integer thresholdforcondition_0 = 7;
        Integer thresholdforcondition_1 = 11;

        RelationalOperator ico_0 = new IntegerRelationalOperator(OPERATOR.EQUAL);
        RelationalOperator ico_1 = new IntegerRelationalOperator(OPERATOR.EQUAL);

        IntegerConcreteActuator ica_0 = mock(IntegerConcreteActuator.class);
        ArgumentCaptor thresholdcapture_0 = ArgumentCaptor.forClass(Integer.class);
        doNothing().when(ica_0).actuate(thresholdcapture_0.capture());
        IntegerConcreteActuator ica_1 = mock(IntegerConcreteActuator.class);
        ArgumentCaptor thresholdcapture_1 = ArgumentCaptor.forClass(Integer.class);
        doNothing().when(ica_1).actuate(thresholdcapture_1.capture());
        IntegerConcreteActuator ica_2 = mock(IntegerConcreteActuator.class);
        ArgumentCaptor thresholdcapture_2 = ArgumentCaptor.forClass(Integer.class);
        doNothing().when(ica_2).actuate(thresholdcapture_2.capture());

        Integer thresholdforaction_0 = 0;
        Integer thresholdforaction_1 = 0;
        Integer thresholdforaction_2 = 0;

        // Configure SUT
        Rule rule = new Rule(0, "rule_0_name", "rule_0_description...");

        rule.addCondition(new Condition(thresholdforcondition_0, ico_0, ics_0));
        rule.addCondition(new Condition(thresholdforcondition_1, ico_1, ics_1));

        rule.addAction(new Action(thresholdforaction_0, ica_0));
        rule.addAction(new Action(thresholdforaction_1, ica_1));
        rule.addAction(new Action(thresholdforaction_2, ica_2));

        // Execute
        rule.execute();

        // Verification
        verify(ics_0, times(1)).getValue();
        verify(ics_1, times(1)).getValue();
        assertTrue(((Integer)thresholdcapture_0.getValue()).intValue() == thresholdforaction_0.intValue());
        assertTrue(((Integer)thresholdcapture_1.getValue()).intValue() == thresholdforaction_1.intValue());
        assertTrue(((Integer)thresholdcapture_2.getValue()).intValue() == thresholdforaction_2.intValue());

    }
}
