package es.ulpgc.iftt.main;

import es.ulpgc.iftt.model.CheckRandomClock;
import es.ulpgc.iftt.model.RandomClock;
import es.ulpgc.iftt.model.Sensor;

public class App
{
    public static void main( String[] args ){
        System.out.println( "Init App..." );

        Sensor randomclock = new RandomClock();
        Sensor checkrandomclock = CheckRandomClock.getCheckRandomClock(randomclock);

        System.out.println("Value of RamdomClock: " + checkrandomclock.getValue());
        System.out.println("Value of RamdomClock: " + checkrandomclock.getValue());
        System.out.println("Value of RamdomClock: " + checkrandomclock.getValue());
        System.out.println("Value of RamdomClock: " + checkrandomclock.getValue());
        System.out.println("Value of RamdomClock: " + checkrandomclock.getValue());

        // App app = new App();
        // app.infoClassLoaders();

        System.out.println( "End App..." );
    }

    public void infoClassLoaders(){
        System.out.println("HashCode of ContextClassLoader: " + Thread.currentThread().getContextClassLoader().hashCode());
        System.out.println("HashCode of ClassLoader: " + this.getClass().getClassLoader().hashCode());
        System.out.println("HashCode of SystemClassLoader: " + ClassLoader.getSystemClassLoader().hashCode());
    }

}
