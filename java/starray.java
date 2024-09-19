class student {
    int roll;
    String name;
}

public class starray {
    public static void main(String[] args) {
        student s1 = new student();
        s1.roll = 27;
        s1.name = "Arun";
        student s2 = new student();
        s2.roll = 45;
        s2.name = "Ravi";
        student s3 = new student();
        s3.roll = 30;
        s3.name = "Mradul";
        student students[] = new student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        // for (int i = 0; i < students.length; i++) {
        // System.out.println(students[i].name + " : " + students[i].roll);

        // }
        for (student n : students) {
            System.out.println(n.name + " : " + n.roll);
        }
    }
}
