import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class TEAMS{
    static ArrayList<Student> students;
    static ArrayList<Teacher> teachers;
    static ArrayList<Course> courses;

    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {

        
        //Load the data if available ### DO NOT CHANGE THIS PART
        try{
            students =(ArrayList<Student>)loadData("students");

        }catch(Exception e){
            students = new ArrayList<>();
        }
        try{
            teachers =(ArrayList<Teacher>)loadData("teachers");
        }catch(Exception e){
            teachers = new ArrayList<>();
        }
        try{
            courses =(ArrayList<Course>)loadData("courses");
        }catch(Exception e){
            courses = new ArrayList<>();
        }


        //############## MAIN MENU STARTS HERE ##############

        System.out.println("##### WELCOME #####");
        int choice = 1;
        while(choice > 0){
            //Print the Menu
            System.out.println("1) student"); 
            System.out.println("2) teacher");
            System.out.println("3) course");
            System.out.println("0) Exit");
            System.out.println();//EMPTY LINE
            //get the choice
            System.out.println("Choice: ");
            choice = sc.nextInt();
            sc.nextLine();//You have to do this
            if(choice  == 1){
                optionOne();
            }else if(choice == 2){
                optionTwo();
            }else if(choice == 3){
                optionThree();
            }
        }
    }
    
    
    public static void optionOne(){
        System.out.println("na+gl+ft");
        int choice = 1;
        while(choice > 0){
            choice =0;
            System.out.println("1)new name");
            choice = sc.nextInt();
                sc.nextLine();
            
            while(choice >0){
                System.out.println("1)eli");
                System.out.println("2)john");
                System.out.println("3)katie");
                System.out.println("4)zach");
                choice =0;
                
            }

                choice = sc.nextInt();
                sc.nextLine();
                while(choice == 1){
                    // public setname()
                        // na = "eli"
                        System.out.println("\n \n\n\n\nnew name is eli\n \n");
                        choice =0;
                }
                while(choice == 2){
                    // public setname()
                        // na = "john"
                        System.out.println("\n \n\n\n\nnew name is john\n \n");
                        choice =0;

                }
                while(choice == 3){
                    // public setname()
                        // na = "katie"
                        System.out.println("\n \n\n\n\nnew name is katie\n \n");
                        choice =0;

                }
                while(choice == 4){
                    // public setname()
                        // na = "zach"
                        System.out.println("\n \n\n\n\nnew name is zach\n \n");
                        choice =0;
                }
                
        }
    }
    public static void optionTwo(){
        System.out.println("\n \n\n\n\ntname+yox+ft\n \n");
        
        
        
    }
    public static void optionThree(){
        int choice = 1;
        while(choice > 0){
            //Print the Menu
            System.out.println("sub+tea+gra");
            System.out.println("#### new couses avalable ####");
            System.out.println("1) computer sience");
            System.out.println("2) history");
            System.out.println("3) langue arts");
            System.out.println("4) Math");
            System.out.println("0) Exit");
            System.out.println();//EMPTY LINE
            //get the choice
            System.out.println("Choice: ");
            choice = sc.nextInt();
            sc.nextLine();//You have to do this
            while(choice == 1){
                System.out.println("\n \n\n\n\nMr. Perdomo\n \n");
                choice = 0; 
                //if(tea =="Mr.Perdomo")
                    //System.out.println("taking course"\n+sub+gra+ft)
                //else;
                // public setCourse()';
                //  tea = "Mr.perdomo"
                 
            }
            while(choice == 2){
                System.out.println("\n \n\n\n\nMis. Megen\n \n");
                choice = 0;
                //if(tea =="Mis. Megen")
                    //System.out.println("taking course"\n+sub+gra+ft)
                //else;
                // public setCourse()';
                //  tea = "Mis. Megen"
            }
            while(choice == 3){
                System.out.println("\n \n\n\n\nMr.Right\n \n");
                choice =0;
                //if(tea =="Mr.Right")
                    //System.out.println("taking course"\n+sub+gra+ft)
                //else;
                // public setCourse()';
                //  tea = "Mr.Right"
            }
            while(choice == 4){
                System.out.println("\n \n\n\n\nMis.Billy\n \n");
                choice = 0;
                //if(tea =="Mis.Billy")
                    //System.out.println("taking course"\n+sub+gra+ft)
                //else;
                // public setCourse()';
                //  tea = "Mis.Billy"
            }
            
        }
    }

        
        

    

    //#### DO NOT CHANGE THIS FUNCTION ####
    public static void saveData()throws Exception{
        FileOutputStream f1 = new FileOutputStream("students");
        ObjectOutputStream os = new ObjectOutputStream(f1);
        os.writeObject(students);
        os.close();
        f1.close();

        FileOutputStream f2 = new FileOutputStream("courses");
        os = new ObjectOutputStream(f2);
        os.writeObject(courses);
        os.close();
        f2.close();

        FileOutputStream f3 = new FileOutputStream("teachers");
        os = new ObjectOutputStream(f3);
        os.writeObject(teachers);
        os.close();
        f3.close();
    }

    //#### DO NOT CHANGE THIS FUNCTION ####
    public static Object loadData(String name) throws Exception{
        FileInputStream fis = new FileInputStream(name);
        ObjectInputStream ois = new  ObjectInputStream(fis);   
        Object o = ois.readObject();
        ois.close();
        fis.close();
        return o;
    }
}