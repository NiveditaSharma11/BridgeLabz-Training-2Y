import java.sql.*;
import java.util.Scanner;

public class MiniJDBC {

    static final String URL = "jdbc:mysql://localhost:3306/school_db";
    static final String USER = "root";
    static final String PASS = "nivi123";

    public static void main(String[] args) throws Exception {

        Connection con = DriverManager.getConnection(URL, USER, PASS);
        Scanner sc = new Scanner(System.in);

        // --- CREATE TABLES ---
        Statement st = con.createStatement();
        st.execute("CREATE TABLE IF NOT EXISTS STUDENT (ID INT PRIMARY KEY, NAME VARCHAR(50), COURSE VARCHAR(50))");
        st.execute("CREATE TABLE IF NOT EXISTS RESULT (ID INT PRIMARY KEY, MARKS INT, GRADE VARCHAR(5))");

        int choice;
        do {
            System.out.println("\n1.Insert Student\n2.Insert Result\n3.Fetch\n4.Update Result\n5.Delete Student\n6.Drop Tables\n7.Exit");
            choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("ID: ");
                int id = sc.nextInt();

                System.out.print("Name: ");
                String name = sc.next();

                System.out.print("Course: ");
                String course = sc.next();

                PreparedStatement ps = con.prepareStatement("INSERT INTO STUDENT VALUES(?,?,?)");
                ps.setInt(1, id);
                ps.setString(2, name);
                ps.setString(3, course);
                ps.executeUpdate();

                System.out.println("Student inserted.");


            } else if (choice == 2) {
                System.out.print("ID: ");
                int id = sc.nextInt();

                System.out.print("Marks: ");
                int marks = sc.nextInt();

                System.out.print("Grade: ");
                String grade = sc.next();

                PreparedStatement ps = con.prepareStatement("INSERT INTO RESULT VALUES(?,?,?)");
                ps.setInt(1, id);
                ps.setInt(2, marks);
                ps.setString(3, grade);
                ps.executeUpdate();

                System.out.println("Result inserted.");


            } else if (choice == 3) {
                Statement st2 = con.createStatement();
                ResultSet rs = st2.executeQuery(
                        "SELECT s.id, s.name, s.course, r.marks, r.grade " +
                                "FROM STUDENT s JOIN RESULT r ON s.id = r.id");

                while (rs.next()) {
                    System.out.println(
                            rs.getInt(1) + " | " +
                                    rs.getString(2) + " | " +
                                    rs.getString(3) + " | Marks: " +
                                    rs.getInt(4) + " | Grade: " + rs.getString(5)
                    );
                }


                } else if (choice == 4) {
                System.out.print("Enter ID to update marks: ");
                int uid = sc.nextInt();

                System.out.print("New Marks: ");
                int newMarks = sc.nextInt();

                PreparedStatement ps = con.prepareStatement("UPDATE RESULT SET marks=? WHERE id=?");
                ps.setInt(1, newMarks);
                ps.setInt(2, uid);
                ps.executeUpdate();

                System.out.println("Result updated.");


            } else if (choice == 5) {
                System.out.print("Enter ID to delete: ");
                int did = sc.nextInt();

                PreparedStatement ps = con.prepareStatement("DELETE FROM STUDENT WHERE id=?");
                ps.setInt(1, did);
                ps.executeUpdate();

                System.out.println("Student deleted.");


            } else if (choice == 6) {
                Statement st3 = con.createStatement();
                st3.execute("DROP TABLE RESULT");
                st3.execute("DROP TABLE STUDENT");

                System.out.println("Tables Dropped!");

            }

        } while (choice != 7);

        con.close();
        System.out.println("Exited.");
    }
}

