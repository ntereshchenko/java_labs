package edu.ntudp.fit.lab5;
import java.sql.*;

public class StudentDatabase {

    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/university?user=root&password=";


    public static void main(String[] args) {
        try {
            StudentDatabase studentDatabase = new StudentDatabase();

            // Вивід усіх студентів
            studentDatabase.getAllStudents();

            // Вивід студентів, які народилися в червні
            studentDatabase.getStudentsByBirthMonth(6);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public StudentDatabase() {
        // Здійснюємо реєстрацію драйвера при створенні об'єкта класу
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection(JDBC_URL);
    }

    public void getAllStudents() throws SQLException {
        try (Connection connection = getConnection()) {

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM students");

            while (resultSet.next()) {
                Student student = extractStudentFromResultSet(resultSet);
                System.out.println(student.toString());
            }
        }
    }

    public void getStudentsByBirthMonth(int targetMonth) throws SQLException {
        try (Connection connection = getConnection()) {

            String sql = "SELECT * FROM students WHERE MONTH(birth_date) = ?";
            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                preparedStatement.setInt(1, targetMonth);

                ResultSet resultSet = preparedStatement.executeQuery();
                while (resultSet.next()) {
                    Student student = extractStudentFromResultSet(resultSet);
                    System.out.println(student.toString());
                }
            }
        }
    }

    private Student extractStudentFromResultSet(ResultSet resultSet) throws SQLException {
        return new Student(
                resultSet.getInt("id"),
                resultSet.getString("last_name"),
                resultSet.getString("first_name"),
                resultSet.getString("middle_name"),
                resultSet.getDate("birth_date"),
                resultSet.getInt("student_id_card")
        );
    }
}
