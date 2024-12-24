import java.util.ArrayList;
import java.util.List;

public class Alarm implements Subject {
    private String time;
    private String sound;

    private List<Observer> observers = new ArrayList<>();

    public Alarm(String time, String sound) {
        this.time = time;
        this.sound = sound;
    }

    public String getTime() {
        return time;
    }

    public String getSound() {
        return sound;
    }

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    public void startAlarm() {
        System.out.println("Báo thức " + time + " vang lên với âm thanh " + sound);
        notifyObservers();
    }
}
