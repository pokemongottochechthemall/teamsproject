import java.io.Serializable;

public class Course implements Serializable{
    private String Subject;
    private Teacher teacher;
    private int Grade;
    private boolean CurrentC;

    public Course(String sub,Teacher tea,int gra,boolean cc){
        Subject = sub;
        teacher = tea;
        Grade = gra;
        CurrentC = cc;

    }
    public void getGrade(int gra){
        Grade = gra;
    }

    public int setGrade(int gra){
        gra = 86;
        return gra;
    }

    public void getSubject(String sub){
        Subject = sub;
    }

    public String setSubject(String sub){
        sub = "Math";
        return sub;
    }

    public void getTeacher(Teacher tea){
        teacher = tea;
    }

    public String setTeacher(String tea){
        return tea;
    }

    public void checkClass(boolean cc,String sub){
        if(sub == "Math"){
            cc= true;
        }
        else{
            cc =false;
        }

        }
    
    }







    
