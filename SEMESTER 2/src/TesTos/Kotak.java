package TesTos;

public class Kotak {
    public double width;
    public double height;
    
    public Kotak(double newWidth){
        this.height = newWidth;
        this.width = newWidth;
    }
    
    public double getLuas(){
        return this.width * this.height;
    }
}
