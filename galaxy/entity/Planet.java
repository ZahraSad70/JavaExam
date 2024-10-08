package galaxy.entity;

public abstract class Planet{
    private String name;
    private String nameGalaxy;
    private  TypePlanet typePlanet;
    private int numMoon;
    private String  distanceSun;




    public Planet(String name, String nameGalaxy, TypePlanet typePlanet, int numMoon, String distanceSun) {
        this.name = name;
        this.nameGalaxy = nameGalaxy;
        this.typePlanet = typePlanet;
        this.numMoon = numMoon;
        this.distanceSun = distanceSun;
    }

    public void setNameGalaxy(String nameGalaxy) {
        this.nameGalaxy = nameGalaxy;
    }



    public String getNameGalaxy() {
        return nameGalaxy;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TypePlanet getTypePlanet() {
        return typePlanet;
    }

    public void setTypePlanet(TypePlanet typePlanet) {
        this.typePlanet = typePlanet;
    }

    public  int getNumMoon() {
        return numMoon;
    }

    public  void setNumMoon(int numMoon) {
        this.numMoon = numMoon;
    }

    public String getDistanceSun() {
        return distanceSun;
    }

    public void setDistanceSun(String  distanceSun) {
        this.distanceSun = distanceSun;
    }

}
