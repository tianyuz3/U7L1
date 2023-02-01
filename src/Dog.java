public class Dog {
    private String name;

    public Dog(String n){
        name = n;
    }

    public String getName(){
        return name;
    }
    public void setName(String newName){
        name = newName;
    }
    public void bark(){
        System.out.println("woof!");
    }
    public String toString(){
        return "Dog: " + name;
    }
}
