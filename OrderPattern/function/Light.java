package OrderPattern.function;

public class Light {
    String name;
    public Light(String s){
        this.name = s;
    }
    public void on(){
        System.out.println(this.name + " Light is on!");
    }
    public void off(){
        System.out.println(this.name + " Light is off!");
    }
}
