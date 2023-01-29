package homework5;


public class Dog extends Animal {

    public void setGender(char gender) {

        this.gender = gender;
    }
    private char gender;
    public Dog(String name, String breed, float age, String size, float weight){
    super(name,breed,age,size,weight);
    setGender(gender);

    }

}

