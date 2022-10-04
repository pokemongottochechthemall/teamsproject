import java.io.Serializable;

public class Teacher implements Serializable {
    private String teachername;
    private int yearsofexperience;
    private String classtot;
    private String favorateteacher;

    public Teacher(String tname,int yox,String ct,String ft){
        teachername = tname;
        yearsofexperience = yox;
        classtot = ct;
        favorateteacher = ft;
    }

    public void setFavoratet(String ft){
        favorateteacher = ft;
    }

    public String getFavoratet(String ft){
        ft = "perdomo";
        return ft;

    }

    public void setTeachername(String tname){
        teachername = tname;
    }

    public String getTeachername(String tname,String ft){
        tname = ft;
        return tname;
    }

    public void setyearsofexperence(int yox){
        yearsofexperience = yox;
    }

    public int getyearsofexperence(int yox){
        yox = 13;
        return yox;
    }
    

    


    
}
