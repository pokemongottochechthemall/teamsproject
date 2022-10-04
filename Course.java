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
    public void setGrade(int gra){
        Grade = gra;
    }

    public int getGrade(int gra){
        gra = 86;
        return gra;
    }

    public void setSubject(String sub){
        Subject = sub;
    }

    public String getSubject(String sub){
        sub = "Math";
        return sub;
    }

    public void setTeacher(String tea){
        Teacher = tea;
    }

    public String getTeacher(String tea){
        tea = "Mis. Billy";
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







    

