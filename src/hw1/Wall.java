package hw1;

public class Wall implements Obstruction{
    private int height;

    public Wall(int height) {
        this.height = height;
    }
    public void tryIt(Competitors c) {
        c.jump(height);
    }


}
