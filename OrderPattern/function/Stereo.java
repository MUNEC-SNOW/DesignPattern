package OrderPattern.function;

public class Stereo {
    String name;
    public Stereo(String s){
        this.name = s;
    }
    public void on(){
        System.out.println(this.name + " Stereo is on!");
    }
    public void off(){
        System.out.println(this.name + " Stereo is off!");
    }
    public void setCd(){ System.out.println("setting CD!");}
    public void setDvd(){System.out.println("setting Dvd!");}
    public void setRadio(){System.out.println("setting Radio!");}
    public void setVolume(int rate){System.out.println("setting vol at"+rate);}
}
