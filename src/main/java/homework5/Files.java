package homework5;

public class Files {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Cookie","pomeranian",2.4f,"small",8.54f);
        Cat cat1 = new Cat("Misty","egyptian Mau",1.2f,"medium",3.5f);

        System.out.printf("\nThe dog's name is %s, its breed is %s, it is %.2f years old, weighs %.2f kg and is %s " +
                "in size.%n",dog1.getName(),dog1.getBreed(),dog1.getAge(),dog1.getWeight(),dog1.getSize());
        System.out.printf("%nThe cat's name is %s, its breed is %s, it is %.2f years old, weighs %.2f kg " +
                "and is %s in size.%n",cat1.getName(),cat1.getBreed(),cat1.getAge(),cat1.getWeight(),
                cat1.getSize());

    }

}

