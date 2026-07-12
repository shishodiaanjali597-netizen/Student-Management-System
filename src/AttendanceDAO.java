import java.sql.*;

public class AttendanceDAO {
    
    // Attendance mark karo
    public void markAttendance(int studentId, String date, String status) {
        String query = "INSERT INTO attendance (student_id, date, status) VALUES (?, ?, ?)";
        try {
            Connection con = DatabaseConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, studentId);
            ps.setString(2, date);
            ps.setString(3, status);
            ps.executeUpdate();
            System.out.println("Attendance marked successfully!");
            con.close();
        } catch(SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    // Student ki attendance dekho
    public void getAttendanceByStudent(int studentId) {
        String query = "SELECT * FROM attendance WHERE student_id=?";
        try {
            Connection con = DatabaseConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, studentId);
            ResultSet rs = ps.executeQuery();
            System.out.println("\nDate | Status");
            System.out.println("-------------");
            while(rs.next()) {
                System.out.println(
                    rs.getString("date") + " | " +
                    rs.getString("status")
                );
            }
            con.close();
        } catch(SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}