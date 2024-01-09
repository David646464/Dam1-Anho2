package paquete;

import java.sql.*;

public class Conexion {
    static final String HOST = "sql.freedb.tech:3306";
    static final String DATABASE = "freedb_Base1DePruebas";
    static final String USER = "freedb_DavidDmc64";
    static final String PASSWORD = "KNbMj9%64MuT4Fy";

    public static boolean existeUsuario(String nombreUsuario) {
        String url = "jdbc:mysql://" + HOST + "/" + DATABASE;

        try (Connection connection = DriverManager.getConnection(url, USER, PASSWORD)) {
            String query = "SELECT COUNT(*) FROM user WHERE username = ?";
            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                preparedStatement.setString(1, nombreUsuario);
                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    if (resultSet.next()) {
                        int count = resultSet.getInt(1);
                        return count > 0;
                    }
                }
            }
        } catch (SQLException e) {
            System.err.println("Error de conexión: " + e.getMessage()); // Manejo básico de excepciones, puedes personalizarlo según tus necesidades.
        }

        return false;
    }

    public static String obtenerEmail(String nombreUsuario) {
        String url = "jdbc:mysql://" + HOST + "/" + DATABASE;

        try (Connection connection = DriverManager.getConnection(url, USER, PASSWORD)) {
            String query = "SELECT email FROM user WHERE username = ?";
            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                preparedStatement.setString(1, nombreUsuario);
                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    if (resultSet.next()) {
                        return resultSet.getString("email");
                    }
                }
            }
        } catch (SQLException e) {
            System.err.println("Error de conexión: " + e.getMessage()); // Manejo básico de excepciones, puedes personalizarlo según tus necesidades.
        }

        return "";
    }

    public static void main(String[] args) {
        String nombreUsuario = "vruagome";
        if (existeUsuario(nombreUsuario)) {
            System.out.println(obtenerEmail(nombreUsuario));
        }
    }
}
