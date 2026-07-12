import java.sql.*;

public class MarksDAO {
    
    // Marks add karo
    public void addMarks(int studentId, String subject, int marks) {
        String query = "INSERT INTO marks (student_id, subject, marks) VALUES (?, ?, ?)";
        try {
            Connection con = DatabaseConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, studentId);
            ps.setString(2, subject);
            ps.setInt(3, marks);
            ps.executeUpdate();
            System.out.println("Marks added successfully!");
            con.close();
        } catch(SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    // Student ke marks dekho
    public void getMarksByStudent(int studentId) {
        String query = "SELECT * FROM marks WHERE student_id=?";
        try {
            Connection con = DatabaseConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, studentId);
            ResultSet rs = ps.executeQuery();
            System.out.println("\nSubject | Marks");
            System.out.println("---------------");
            while(rs.next()) {
                System.out.println(
                    rs.getString("subject") + " | " +
                    rs.getInt("marks")
                );
            }
            con.close();
        } catch(SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
    

