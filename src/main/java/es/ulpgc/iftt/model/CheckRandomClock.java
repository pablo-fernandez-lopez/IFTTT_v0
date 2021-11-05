package es.ulpgc.iftt.model;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class CheckRandomClock implements InvocationHandler {
    private RandomClock randomclock;

    public CheckRandomClock(RandomClock randomclock) {
        this.randomclock = randomclock;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Integer result = (Integer) method.invoke(randomclock, args);
        System.out.println("Into CheckRandom... [" + result + "]");
        return result;
    }

    public static Sensor getCheckRandomClock(Object randomclock){
        return (Sensor) java.lang.reflect.Proxy.newProxyInstance(randomclock.getClass().getClassLoader(), // El Cargador de la Clase a la que le queremos hacer el Proxi
                new Class[]{Sensor.class}, // Array con las interfaces que implementa la Clase a la que queremos hacer el Proxi
                new CheckRandomClock((RandomClock)randomclock)); // El objeto que actuará de Proxi
    }
}

