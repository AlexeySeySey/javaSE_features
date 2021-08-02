import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.stream.Stream;

public class Main {

  public static void run() throws Exception {

    String url = "jdbc:mysql://localhost:3306/java_test";
    String username = "root";
    String password = "root";

    Statement statement = DriverManager.getConnection(url, username, password).createStatement();

    statement.executeUpdate("create table if not exists todos(id int primary key auto_increment, text varchar(255) null);");
    Stream.of("foo", "bar", "baz")
        .forEach((item) -> {
          try {
            statement.executeUpdate(
                String.format("insert into todos (text) values (\"%s\");", item)
            );
          } catch (Exception e) {
            e.printStackTrace();
          }
        });
    ResultSet todos = statement.executeQuery("select * from todos");
    while(todos.next()) {
      System.out.println(todos.getString("text"));
    }
  }

  public static void main(String args[]) {
    try {
      run();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
