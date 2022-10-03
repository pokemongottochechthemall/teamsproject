import java.io.Serializable;

public class Course implements Serializable{
    private String Subject;
    private String Teacher;
    private int Grade;
    private boolean CurrentC;

    public Course(String sub,String tea,int gra,boolean cc){
        this.Subject = sub;
        this.Teacher = tea;
        this.Grade = gra;
        this.CurrentC = cc;

    }
    public void getGrade(int gra){
        gra = 0;
    }

    public int setGrade(int gra){
        return gra;
    }

    public void getSubject(String sub){
        sub = "Math";
    }

    public String setSubject(String sub){
        return sub;
    }

    public void getTeacher(String tea){
        tea = "Mis. Billy";
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
    
    public void setCourse(int gra,String sub,String tea,boolean cc){
    }
    }







    

