
public interface Observer {
    void update(Subject subject);
}

class AlarmClock implements Observer {
    private Alarm alarm;

    public AlarmClock(Alarm alarm) {
        this.alarm = alarm;
        alarm.attach(this);
    }

    @Override
    public void update(Subject subject) {
        Alarm alarm = (Alarm) subject;
        System.out.println("Đồng hồ báo thức hiển thị: " + alarm.getTime() + " - " + alarm.getSound());
    }
}
