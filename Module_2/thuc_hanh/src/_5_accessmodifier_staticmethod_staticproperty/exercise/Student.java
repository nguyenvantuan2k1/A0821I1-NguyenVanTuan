package _5_accessmodifier_staticmethod_staticproperty.exercise;

public class Student {
    private String name ="john";
    private String classes="C02";

    public Student() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }
    public String toString(){
        return "name :"+this.name+" \nclasses :"+this.classes;
    }
}
