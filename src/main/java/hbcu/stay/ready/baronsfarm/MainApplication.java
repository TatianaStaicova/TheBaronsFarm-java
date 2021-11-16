package hbcu.stay.ready.baronsfarm;


import java.util.ArrayList;

public class MainApplication {
    public static void main(String[] args) {
        Farmer froilan = new Farmer();
        Farm froilanFarm = new Farm();

        Field field = new Field();
        field.setCropRows(new ArrayList<CropRow>() {{
            new CropRow(new CornStalk());
            new CropRow(new TomatoPlant());
            new CropRow();
            new CropRow();
            new CropRow();
        }});

        ChickenCoop chickenCoop1 = new ChickenCoop();
        ChickenCoop chickenCoop2 = new ChickenCoop();
        ChickenCoop chickenCoop3 = new ChickenCoop();
        ChickenCoop chickenCoop4 = new ChickenCoop();

        chickenCoop1.setChickens(new ArrayList<Chicken>() {{
            add(new Chicken()); add(new Chicken());
            add(new Chicken());
        }});

        chickenCoop2.setChickens(new ArrayList<Chicken>() {{
            add(new Chicken()); add(new Chicken());
            add(new Chicken()); add(new Chicken());
        }});

        chickenCoop3.setChickens(new ArrayList<Chicken>() {{
            add(new Chicken()); add(new Chicken());
            add(new Chicken());
        }});

        chickenCoop4.setChickens(new ArrayList<Chicken>() {{
            add(new Chicken()); add(new Chicken());
            add(new Chicken()); add(new Chicken());
            add(new Chicken());
        }});


        Stable stable1 = new Stable();
        Stable stable2 = new Stable();
        Stable stable3 = new Stable();

        stable1.setHorses(new ArrayList<Horse>(){{
            add(new Horse()); add(new Horse()); add(new Horse());
        }});

        stable2.setHorses(new ArrayList<Horse>(){{
            add(new Horse()); add(new Horse()); add(new Horse());
        }});

        stable3.setHorses(new ArrayList<Horse>(){{
            add(new Horse()); add(new Horse()); add(new Horse()); add(new Horse());
        }});

        CropDuster cropDuster = new CropDuster();

        Tractor tractor2 = new Tractor();
        Tractor tractor1 = new Tractor();


        System.out.println(cropDuster);



    }

}