public class StudentManagement {
    private Student[] students = new Student[100];
    private int cnt = 0;

    /**
     * check cung lop.
     */
    public static boolean sameGroup(Student s1, Student s2) {
        return s1.getGroup().equals(s2.getGroup());
    }

    /**
     * them student.
     */
    public void addStudent(Student newStudent) {
        students[cnt] = newStudent;
        cnt++;
    }

    /**
     * in ra student va lop.
     */
    public String studentsByGroup() {
        String res = "";
        boolean[] check = new boolean[cnt];

        for (int i = 0; i < cnt; i++) {
            if (!check[i]) {
                res = res + students[i].getGroup() + "\n";
                for (int j = i; j < cnt; j++) {
                    if (!check[j] && students[i].getGroup().equals(students[j].getGroup())) {
                        res = res + students[j].getInfo() + "\n";
                        check[j] = true;
                    }
                }
            }
        }
        return res;
    }

    /**
     * xoa student.
     */
    public void removeStudent(String id) {
        for (int i = 0; i < cnt; i++) {
            if (students[i].getId().equals(id)) {
                for (int j = i; j < cnt - 1; j++) {
                    students[j] = students[j + 1];
                }
            }
        }
        cnt--;
    }
}
