package galaxy.entity;

import java.util.ArrayList;
import java.util.List;



public class Galaxy {

    private String name;
    private  List<SpecialPlanet> specialPlanets;


    public Galaxy(String name) {
        this.specialPlanets=new ArrayList<>();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<SpecialPlanet> getSpecialPlanets() {
        return specialPlanets;
    }

    public void setSpecialPlanets(List<SpecialPlanet> specialPlanets) {
        this.specialPlanets = specialPlanets;
    }
}
