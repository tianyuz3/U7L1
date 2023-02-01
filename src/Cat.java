public class Cat {
    private String name;

    public Cat (String n){
        name = n;
    }
    public String getName(){
        return name;
    }
    public void setName(String newName){
        name = newName;
    }
    public String toString(){
        return "Cat: " + name;
    }
}
