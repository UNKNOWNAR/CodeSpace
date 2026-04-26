import java.util.*;
public class SchoolManagement {
    public static void main(String[] args) {
        Principal principal = new Principal();
        Scanner sc = new Scanner(System.in);
        principal.getdata();
        principal.show_getdata();
        principal.sortdata();
        principal.display();
        System.out.println("Enter a teacher name to search:");
        String searchName = sc.nextLine();
        principal.searchdata(searchName);
    }
}
