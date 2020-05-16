package hw1;

public class Organism {
    String type;
    String name;
    int orgDist;
    int orgHeight;
    boolean isDisqualified;

    public Organism(String type, String name, int dist, int height) {
        this.type = type;
        this.name = name;
        this.orgDist = dist;
        this.orgHeight = height;
        this.isDisqualified = false;
    }

    public void run(int dist) {
        if (orgDist >= dist) {
            System.out.println(type + " " + name + " пробежал " + dist + " метров");
        } else {
            System.out.println(type + " " + name + " не смог пробежать  " + dist + " метров");
            isDisqualified = true;
        }
    }

    public void jump(int height) {
        if (orgHeight >= height) {
            System.out.println(type + " " + name + " перепрыгнул стену высотой " + height + " метров");
        } else {
            System.out.println(type + " " + name + " не смог перепрыгнуть стену высотой " + height + " метров");
            isDisqualified = true;
        }
    }

    public boolean doYouDisqualified() {
        if (isDisqualified) {
            System.out.println(type + " " + name + " дисквалифицирован !!!");
        }
        return isDisqualified;
    }


}
