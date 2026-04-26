class Principal extends Teacher {
    void display() {
        System.out.println("Sorted Teacher Details:");
        System.out.println("Name\tDate of Birth\tDate of Joining");
        for (int i = 0; i < 50; i++) {
            System.out.println(name[i] + "\t" + dob[i] + "\t" + doj[i]);
        }
    }
    void searchdata(String teacherName) {
        int foundIndex = -1;
        for (int i = 0; i < 50; i++) {
            if (name[i].equalsIgnoreCase(teacherName)) {
                foundIndex = i;
                break;
            }
        }
        if (foundIndex != -1) {
            System.out.println("Teacher Found:");
            System.out.println("Name\tDate of Birth\tDate of Joining");
            System.out.println(name[foundIndex] + "\t" + dob[foundIndex] + "\t" + doj[foundIndex]);
        } else
            System.out.println("Teacher not found");
    }
    void sortdata() {
        for (int i = 0; i < 49; i++) {
            for (int j = 0; j < 49 - i; j++) {
                String str1 = name[j];
                if (str1.compareToIgnoreCase(name[j + 1]) > 0) {
                    name[j] = name[j + 1];
                    name[j + 1] = str1;
                    str1 = dob[j + 1];
                    dob[j + 1] = dob[j];
                    dob[j] = str1;
                    str1 = doj[j + 1];
                    doj[j + 1] = doj[j];
                    doj[j] = str1;
                }
            }
        }
    }

}