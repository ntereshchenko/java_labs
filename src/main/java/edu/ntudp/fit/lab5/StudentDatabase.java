package edu.ntudp.fit.lab5;
import java.sql.*;
import java.util.Scanner;


public class StudentDatabase {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/university?user=root&password=";

    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(JDBC_URL)) {
            // Menu display
            System.out.println("1. View all students");
            System.out.println("2. Search for students by birth month");
            System.out.print("Select an option: ");

            Scanner scanner = new Scanner(System.in);
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    displayAllStudents(connection);
                    break;
                case 2:
                    System.out.print("Enter the birth month (1-12): ");
                    int month = scanner.nextInt();
                    displayStudentsByBirthMonth(connection, month);
                    break;
                default:
                    System.out.println("Invalid option.");
            }

            // Connection close
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void displayAllStudents(Connection connection) throws SQLException {
        String sql = "SELECT * FROM students";
        try (Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(sql)) {
            while (resultSet.next()) {
                Student student = extractStudentFromResultSet(resultSet);
                System.out.println(student.toString());
            }
        }
    }

    private static void displayStudentsByBirthMonth(Connection connection, int month) throws SQLException {
        String sql = "SELECT * FROM students WHERE MONTH(birth_date) = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setInt(1, month);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (!resultSet.isBeforeFirst()) {
                    System.out.println("No students born in the specified month.");
                } else {
                    while (resultSet.next()) {
                        Student student = extractStudentFromResultSet(resultSet);
                        System.out.println(student.toString());
                    }
                }
            }
        }
    }

    private static Student extractStudentFromResultSet(ResultSet resultSet) throws SQLException {
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
