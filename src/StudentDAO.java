import java.sql.*;

public class StudentDAO {
    
    // Student add karo
    public void addStudent(Student s) {
        String query = "INSERT INTO students (name, email, phone, section, cgpa) VALUES (?, ?, ?, ?, ?)";
        try {
            Connection con = DatabaseConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, s.getName());
            ps.setString(2, s.getEmail());
            ps.setString(3, s.getPhone());
            ps.setString(4, s.getSection());
            ps.setDouble(5, s.getCgpa());
            ps.executeUpdate();
            System.out.println("Student added successfully!");
            con.close();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    // Saare students dekho
    public void getAllStudents() {
        String query = "SELECT * FROM students";
        try {
            Connection con = DatabaseConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            System.out.println("\nID | Name | Email | Phone | Section | CGPA");
            System.out.println("--------------------------------------------------");
            while (rs.next()) {
                System.out.println(
                    rs.getInt("id") + " | " +
                    rs.getString("name") + " | " +
                    rs.getString("email") + " | " +
                    rs.getString("phone") + " | " +
                    rs.getString("section") + " | " +
                    rs.getDouble("cgpa")
                );
            }
            con.close();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    // Student update karo
    public void updateStudent(int id, String email) {
        String query = "UPDATE students SET email=? WHERE id=?";
        try {
            Connection con = DatabaseConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, email);
            ps.setInt(2, id);
            ps.executeUpdate();
            System.out.println("Student updated successfully!");
            con.close();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    // Student delete karo
    public void deleteStudent(int id) {
        String query = "DELETE FROM students WHERE id=?";
        try {
            Connection con = DatabaseConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Student deleted successfully!");
            con.close();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
    

