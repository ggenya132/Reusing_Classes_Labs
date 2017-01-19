/**
 * Created by eugenevendensky on 1/18/17.
 */
public class Human {

    String name;
    int age;
    String gender;
    String occupation;
    String address;

    public Human(String name, int age, String gender, String occupation, String address) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.occupation = occupation;
        this.address = address;
    }
    public Human(){
        name = "Guy";
        gender = "Unisex";
        age = 0;
        occupation = "Human";
        address = "Earth";
    }

    public void getName() {
        System.out.println(name);
    }

    public void getGender() {
        System.out.println(gender);
    }

    public void getAge() {
        System.out.println(age);
    }

    public void getOccupation() {
        System.out.println(occupation);
    }

    public void getAdress() {
        System.out.println(address);
    }
}

