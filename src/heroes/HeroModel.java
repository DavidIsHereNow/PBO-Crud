package heroes;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class HeroModel extends AbstractModel {
    private String heroId;
    private int heroRank;
    private String heroName;

    public HeroModel() {
        // Panggil konstruktor superclass AbstractModel untuk mendapatkan koneksi ke database
        super();
    }

    public HeroModel(String heroId, int heroRank, String heroName) {
        this.heroId = heroId;
        this.heroRank = heroRank;
        this.heroName = heroName;
    }

    // Setter, getter, dan metode lainnya

    @Override
public void create() {
    String query = "INSERT INTO hero (hero_id, hero_rank, hero_name) VALUES (?, ?, ?)";

    try {
        PreparedStatement statement = connection.prepareStatement(query);
        if (heroId == null) {
            statement.setNull(1, java.sql.Types.NULL);
        } else {
            statement.setString(1, heroId);
        }
        statement.setInt(2, heroRank);
        statement.setString(3, heroName);
        statement.executeUpdate();
        System.out.println("Data hero berhasil ditambahkan");
    } catch (SQLException e) {
        System.err.println("Error saat menambahkan data hero: " + e.getMessage());
    }
}

    @Override
    public void read() {
        String query = "SELECT * FROM hero";

        try {
            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();

            List<HeroModel> heroes = new ArrayList<>();
            while (resultSet.next()) {
                String id = resultSet.getString("hero_id");
                int rank = resultSet.getInt("hero_rank");
                String name = resultSet.getString("hero_name");
                HeroModel hero = new HeroModel(id, rank, name);
                heroes.add(hero);
            }

            // Lakukan sesuatu dengan data hero yang telah dibaca, misalnya menampilkannya di GUI
            for (HeroModel hero : heroes) {
                System.out.println(hero);
            }
        } catch (SQLException e) {
            System.err.println("Error saat membaca data hero: " + e.getMessage());
        }
    }

  @Override
public void update() {
    String query = "UPDATE hero SET hero_rank = ?, hero_name = ? WHERE hero_id = ?";

    try {
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setInt(1, heroRank);
        statement.setString(2, heroName);
        statement.setString(3, heroId);
        statement.executeUpdate();
        System.out.println("Data hero berhasil diperbarui");
    } catch (SQLException e) {
        System.err.println("Error saat memperbarui data hero: " + e.getMessage());
    }
}

    @Override
    public void delete() {
        String query = "DELETE FROM hero WHERE hero_id = ?";

        try {
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, heroId);
            statement.executeUpdate();
            System.out.println("Data hero berhasil dihapus");
        } catch (SQLException e) {
            System.err.println("Error saat menghapus data hero: " + e.getMessage());
        }
    }
     public void setHeroId(String heroId) {
        this.heroId = heroId;
    }
     public void setHeroName(String heroName) {
        this.heroName = heroName;
    }
    
    public void setHeroRank(int heroRank) {
        this.heroRank = heroRank;
    }

    @Override
    public String toString() {
        return "Hero [id=" + heroId + ", rank=" + heroRank + ", name=" + heroName + "]";
    }
}
