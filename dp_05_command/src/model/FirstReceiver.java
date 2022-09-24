package model;

public class FirstReceiver {
    private String name;
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void jumpUp() {
        System.out.println(getName() + " Jump up");
    }

    public void moveLeft() {
        System.out.println(getName() + " Move left");
    }

    public void moveRight() {
        System.out.println(getName() + " Move Right");
    }

    public void moveDown() {
        System.out.println(getName() + " Move Down");
    }

    public void moveFast() {
        System.out.println(getName() + " Move Fast");
    }
}
