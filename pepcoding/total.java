import java.util.*;

public class total{
   public static class classroom{
    int students;
    int sections;
    int standard;
    String school;
    void inquiry(){
        System.out.println( school + " " + "has" + " " + students*sections + " " + "in" + " " + standard);
    }
   } 
   public static void main(String[] args) {
    classroom room1 = new classroom();
    room1.students = 60;
    room1.sections = 3;
    room1.standard = 12;
    room1.school = "Vips"; 
    room1.inquiry();
   }
}