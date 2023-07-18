package heroes;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class AbstractModel {
    protected Connection connection;

    public AbstractModel() {
        try {
            // Membuat koneksi
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/one", "root", "");
        } catch (SQLException e) {
            System.err.println("Koneksi gagal: " + e.getMessage());
        }
    }

    public abstract void create();
    public abstract void read();
    public abstract void update();
    public abstract void delete();

    // Metode tambahan dan implementasi lainnya
}
