package homework5;


import java.util.Scanner;

public class Animal {

    private String name;
    private String breed;
    private float age;
    private String size;
    private float weight;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        if (!name.isEmpty() && !name.isBlank()) {
            this.name = name;
        } else {
            System.out.println("Invalid name. Try again.");
        }
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        if(!breed.isEmpty() && !breed.isBlank()){
            System.out.println("Invalid breed");
        }else {
        this.breed = breed;
        }
    }

    public float getAge() {
        return age;
    }
    public void setAge(float age) {if (age > 0){
        this.age = age;
    }else {
            System.out.println("Invalid age.Try again.");
        }
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {if (size=="small" || size=="medium" || size=="big"){
        this.size = size;
    }else {
        System.out.println("Invalid size");
        }
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        if(weight > 0){
            this.weight = weight;
        }else {
            System.out.println("ERROR: Invalid input data for Weight.");
        }
    }

    public Animal(String name, String breed, float age, String size, float weight) {
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.size = size;
        this.weight = weight;
    }

    String dogWalkingDay;


}



