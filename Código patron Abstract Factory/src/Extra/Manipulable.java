package Extra;


import Extra.Velocity;
import java.awt.event.ActionListener;
import javax.swing.Timer;

public interface Manipulable<T> extends ActionListener
{

      int getSpeed();

      void setVelocity(Velocity vel);

      void setSpeed(int speed);

      int getDelay();

      void setDelay(int delay);

      void start();

      void stop();

      Timer getTimer();

      void setActor(T actor);

      T getActor();

}
