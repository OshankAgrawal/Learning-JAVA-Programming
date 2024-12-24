class box{
    double width, height, depth;
    box(double w, double h, double d){
        width=w;
        height=h;
        depth=d;
    }
    box(double len){
        width=height=depth=len;
    }
    double volume(){
        return width*depth*height;
    }
}
public class ConstructorOverloading2 {
    public static void main(String args[]){
        box mybox1=new box(10,20,30);
        box mybox2=new box(7,6,8);
        box mycube=new box(7);

        double vol;
        vol=mybox1.volume();
        System.out.println("Volume of mybox1 is: "+vol);
        vol=mybox2.volume();
        System.out.println("Volume of mybox2 is: "+vol);
        vol=mycube.volume();
        System.out.println("Volume of mycube is: "+vol);
    }
}
