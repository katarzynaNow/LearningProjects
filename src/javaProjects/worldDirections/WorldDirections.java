package javaProjects.worldDirections;

public enum WorldDirections {
    N("północ", "North", 0),
    NE ("północny wschód", "Northeast", 45),
    E("wschód", "East", 90),
    SE("południowy wschód", "Southeast", 135),
    S("południe", "South", 180),
    SW("południowy zachód", "Southwest", 225),
    W("zachód", "West", 270),
    NW ("północny zachód", "Northwest", 315);

    String namePl;
    String nameEn;
    int rotation;

    WorldDirections(String namePl, String nameEn, int rotation) {
        this.namePl = namePl;
        this.nameEn = nameEn;
        this.rotation = rotation;
    }

    public String getNamePl() {
        return namePl;
    }

    public String getNameEn() {
        return nameEn;
    }

    public int getRotation() {
        return rotation;
    }

    @Override
    public String toString() {
        return "WorldDirections{" +
                "namePl='" + namePl + '\'' +
                ", nameEnglish='" + nameEn + '\'' +
                ", rotation=" + rotation +
                '}';
    }
}
