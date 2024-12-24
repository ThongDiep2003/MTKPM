
public class NotificationService implements Observer {
    private Alarm alarm;

    public NotificationService(Alarm alarm) {
        this.alarm = alarm;
        alarm.attach(this);
    }

    @Override
    public void update(Subject subject) {
        Alarm alarm = (Alarm) subject;
        System.out.println("Gửi thông báo: Báo thức " + alarm.getTime() + " vang lên!");
    }
}

