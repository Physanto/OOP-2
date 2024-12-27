package Interfaces;

public class Animal implements Fly, Swim, Walk{

    private String name;
    private int age;
    private byte cantPaws;

    public Animal(){}

    public Animal(String name, int age, byte cantPaws){
        this.name = name;
        this.age = age;
        this.cantPaws = cantPaws;
    }

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public int getAge() {return age;}
    public void setAge(int age) {this.age = age;}

    public byte getCantPaws() {return cantPaws;}
    public void setCantPaws(byte cantPaws) {this.cantPaws = cantPaws;}

    @Override
    public void fly(){
        System.out.println("Can fly");
    }

    @Override
    public void swim(){
        System.out.println("Can swim");
    }

    @Override
    public void walk(){
        System.out.println("Can walk");
    }
}
