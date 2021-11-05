package es.ulpgc.iftt.model;

import es.ulpgc.iftt.model.Action;
import es.ulpgc.iftt.model.IntegerConcreteActuator;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;

public class ActionTest {
    @Test
    public void workingWithIntegerActionShouldAnswerWithTrue(){
        // Configure collaborators
        IntegerConcreteActuator integerconcreteactuatormock = mock(IntegerConcreteActuator.class);
        doNothing().when(integerconcreteactuatormock).actuate(isA(Integer.class));

        Integer threshold = 0;

        // Configure SUT
        Action action = new Action(threshold, integerconcreteactuatormock);

        // Execution
        action.actuate();

        // Verification
        verify(integerconcreteactuatormock, times(1)).actuate(0);

        // Ending
    }

    @Test
    public void workingWithIntegerActionArgumentCaptureIsOk(){
        // Configure collaborator
        IntegerConcreteActuator integerconcreteactuatormock = mock(IntegerConcreteActuator.class);
        ArgumentCaptor argumentcaptured = ArgumentCaptor.forClass(Integer.class);
        doNothing().when(integerconcreteactuatormock).actuate(argumentcaptured.capture());

        Integer thresshold = 13;

        // Configure SUT
        Action action = new Action(thresshold, integerconcreteactuatormock);

        // Execution
        action.actuate();

        // Verification
        assertTrue(((Integer)argumentcaptured.getValue()).intValue() == thresshold.intValue());

        // Ending
    }

}
