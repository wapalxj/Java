package exam2;

/**
 * Created by Administrator on 2016/5/6.
 */
public abstract class Animal {
    private String name;
    private String description;

    public abstract void move();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
