import Controller.StudentManager;
import Model.Student;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();
        ArrayList<Student> lt = new ArrayList<>();
        studentManager.display(lt);
    }
}