import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        JDBCConnectionPool pool = new JDBCConnectionPool("org.hsqldb.jdbcDriver", "jdbc:hsqldb://localhost/mydb",
                "sa", "secret");
        Connection connection = pool.checkOut();

        pool.checkIn(connection);
    }
}
