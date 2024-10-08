package galaxy;

import Vehicle_tamrin.Airport;
import galaxy.entity.Galaxy;
import galaxy.entity.Planet;
import galaxy.entity.SpecialPlanet;
import galaxy.entity.TypePlanet;
import university.entity.Student;
import university.entity.University;

import java.io.*;
import java.util.Scanner;

public class Main {
    private static String menu="1.DisplayInfo Galaxies\n2.Add Planet\n3.Change Moon Planet\n4.Display Info Planet\n5.Save and Exit";

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        Galaxy galaxy=new Galaxy("Milky");

        getPlanetFile(scanner,galaxy);


        while(true){
            System.out.println(menu);
            String input=scanner.nextLine();
            switch(input){
                case "1":
                    System.out.println("select galaxy...\n1.Milky Way\n2.Andromeda\n");
                    String selectGalaxy=scanner.nextLine();
                    switch (selectGalaxy){
                        case "1":
                            for (Planet p:galaxy.getSpecialPlanets()){
                                System.out.println(p.toString());
                            }
                            break;
                    }
                    break;


                case "2":
                     System.out.println("select galaxy...\n1.Milky Way\n2.Andromeda\n");
                    String selectGalaxy1=scanner.nextLine();
                    switch (selectGalaxy1){
                        case "1":
                            getPlanetUser(scanner,galaxy);
                            exportFilePlanet(galaxy);
                            break;
                    }
                    break;


                case "3":
                    System.out.println("Select Planet :\n");
                    for (SpecialPlanet p:galaxy.getSpecialPlanets()){
                        System.out.println(p.getName());
                    }

                    String namePlanet=scanner.nextLine().toLowerCase();
                    System.out.println("enter num moon");
                    String numMoon=scanner.nextLine();

                    for (SpecialPlanet p:galaxy.getSpecialPlanets()){
                        if (p.getName().toLowerCase().trim().equals(namePlanet)){
                            p.setNumMoon(Integer.parseInt(numMoon));
                            p.setName(p.getName());
                            p.setDistanceSun(p.getDistanceSun());
                            p.setNameGalaxy(p.getNameGalaxy());
                            p.setTypePlanet(p.getTypePlanet());
                            p.setResource(p.getResource());
                            p.setLife(p.getLife());

                            break;
                        }
                    }
                    exportFilePlanet(galaxy);

                case "4":
                case "5":
            }
        }
    }

    private static void exportFilePlanet(Galaxy galaxy) {
        try (BufferedWriter writer=new BufferedWriter(new FileWriter("G:\\Galaxy\\Planet.txt"))){

            String exportData="";
            for (SpecialPlanet p: galaxy.getSpecialPlanets()){
                exportData += p.toString();
            }
            exportData=exportData.substring(0,exportData.length()-1);
            writer.write(exportData);
        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }

    private static void getPlanetFile(Scanner scanner,Galaxy galaxy) {
        File PlanetFile = new File("G:\\Galaxy\\Planet.txt");
        try {
            try (Scanner scanner1 = new Scanner(PlanetFile)) {
                while (scanner1.hasNext()){
                    String planetStr=scanner1.nextLine();
                    String name=planetStr.split("#")[0];
                    String galaxyStr=planetStr.split("#")[1];
                    String type=planetStr.split("#")[2].toLowerCase();

                    int countMoon= Integer.parseInt (planetStr.split("#")[3]);
                    String DistanceSun=planetStr.split("#")[4];
                    String life=planetStr.split("#")[5];
                    String resorces=planetStr.split("#")[6];

                    SpecialPlanet planet=new SpecialPlanet(name ,galaxyStr,TypePlanet.valueOf(type),countMoon,DistanceSun,life,resorces);
                    galaxy.getSpecialPlanets().add(planet);


                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    private static void getPlanetUser(Scanner scanner, Galaxy galaxyName) {
        String planetStr=scanner.nextLine();
        String name=planetStr.split("#")[0];
        String galaxy=planetStr.split("#")[1];
        String type=planetStr.split("#")[2].toLowerCase();
        int countMoon= Integer.parseInt (planetStr.split("#")[3]);
        String DistanceSun=planetStr.split("#")[4];
        String life=planetStr.split("#")[5];
        String resorces=planetStr.split("#")[6];
        SpecialPlanet planet=new SpecialPlanet(name ,galaxy,TypePlanet.valueOf(type),countMoon,DistanceSun,life,resorces);

        galaxyName.getSpecialPlanets().add(planet);
        System.out.println("planet is add");

    }
}
