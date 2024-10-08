package galaxy.entity;

import java.util.List;

public class SpecialPlanet extends Planet{
    private String  life;
    private  String resource;

    public SpecialPlanet(String name, String nameGalaxy, TypePlanet typePlanet, int numMoon, String distanceSun, String life, String resource) {
        super(name, nameGalaxy, typePlanet, numMoon, distanceSun);
        this.life  = life;
        this.resource = resource;

    }


    public String getLife() {
        return life;
    }


    public void setLife(String life) {
        this.life = life;
    }

    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }

    @Override
    public String toString() {
        return super.getName()+ "#"
                +super.getNameGalaxy()+  "#"
                +super.getTypePlanet() +  "#"
                +super.getNumMoon()+  "#"+
                super.getDistanceSun()
                +life +  "#"
                + resource +  "\n" ;
    }
}
