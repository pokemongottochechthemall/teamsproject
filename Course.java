import java.io.Serializable;

public class Course implements Serializable{
    private String Subject;
    private String Teacher;
    private int Grade;
    private boolean CurrentC;

    public Course(String sub,String tea,int gra,boolean cc){
        Subject = sub;
        Teacher = tea;
        Grade = gra;
        CurrentC = cc;

    }
    public void setGrade(int gra,int numa){
        

    }



    
}
