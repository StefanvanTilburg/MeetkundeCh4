package controller;


import java.sql.*;


/**
 * @author Stefan van Tilburg
 * <p>
 * Opdracht OOP Meetkunde (rode draad document)
 * <p>
 * Doel     Main methode voor Meetkunde opdracht.
 */
public class MeetkundeLauncher {
    private static final String MYSQL_DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String PREFIX_CONNECTION_URL = "jdbc:mysql://localhost:3306/";
    private static final String CONNECTION_SETTINGS = "?useSSL=false" +
                                                        "&allowPublicKeyRetrieval=true" +
                                                        "&useJDBCCompliantTimezoneShift=true" +
                                                        "&useLegacyDatetimeCode=false" +
                                                        "&serverTimezone=UTC";

    public static void main(String[] args) {
        String databaseName = "Figuren";
        String mainUser = "userFiguren";
        String mainUserPassword = "userFigurenPW";

        String connectionURL = PREFIX_CONNECTION_URL + databaseName +
                CONNECTION_SETTINGS;
        Connection connection = null;
        try {
            Class.forName(MYSQL_DRIVER);
            connection = DriverManager.getConnection(connectionURL, mainUser, mainUserPassword);
        } catch (ClassNotFoundException driverFout) {
            System.out.println("Driver niet gevonden");
        } catch (SQLException sqlFout) {
            System.out.println("SQL Exception: " + sqlFout.getMessage());
        }

        if (connection != null) {
            System.out.println("De verbinding is gemaakt!");
            String sql = "SELECT * FROM cirkel WHERE straal > 5;";
            try {
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                ResultSet resultSet = preparedStatement.executeQuery();
                while (resultSet.next()) {
                    double xCoordinaat = resultSet.getDouble("xcoordinaat");
                    double yCoordinaat = resultSet.getDouble("ycoordinaat");
                    System.out.printf("(%.2f, %.2f)\n", xCoordinaat, yCoordinaat);
                }
                connection.close();
            } catch (SQLException sqlFout) {
                System.out.println(sqlFout);
            }
        }
    }
}
