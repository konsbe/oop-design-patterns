package interfaces;

public interface Observer {
    public void update();
    String getName();
    public void setSubject(Subject subject);
}
