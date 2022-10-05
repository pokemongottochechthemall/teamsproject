import java.io.Serializable;

public class Student implements Serializable {
    private String name;
    private int gradelevel;
    private String favorateteacher;

    public Student(String na,int gal,String ft){
        name = na;
        gradelevel = gal;
        favorateteacher = ft;
    }

    public void setName(String na){
        name = na;
    }

    public String getName(String na){
        na = "aaron";
        return na;
    }

    public void setGradelevel(int gal){
        gradelevel = gal;
    }

    public int getGradelevel(int gal){
        gal = 10;
        return gal;
    }

    public void setfavtea(String ft){
        favorateteacher = ft;
    }

    public String getfavtea(String ft){
        ft = "perdomo";
        return ft;
    }

    
}
