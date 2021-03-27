//每次循环都会执行一遍所有语句，抽离成方法的思路不是很清晰，坐等答疑


package sql1;
import java.sql.*;


public class sql_1 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/csa?serverTimezone=UTC","root","123456");
            Statement stmt = conn.createStatement();
            ResultSet rs;
            String sql="create table if not exists student (" +
                    "`SNO` varchar(20)," +
                    "`Name` varchar(10)," +
                    "`Age` INTEGER," +
                    "`college` VARCHAR(30));";
            stmt.executeUpdate(sql);
            String sql1="insert into student values" +
                    "(\"s001\",\"老大\",20,\"计算机学院\")," +
                    "(\"s002\",\"老二\",19,\"计算机学院\")," +
                    "(\"s003\",\"老三\",18,\"计算机学院\")," +
                    "(\"s004\",\"老四\",17,\"计算机学院\");";
            stmt.executeUpdate(sql1);

            String select1="select * from student";
            rs= stmt.executeQuery(select1);
            ResultSetMetaData rsmd = rs.getMetaData();
            int  columnCount = rsmd.getColumnCount();
            System.out.println("第一题效果");
            while (rs.next()) {
                for (int i = 0; i < columnCount; i++) {
                    if(i!=columnCount-1) {
                        System.out.print(rs.getString(i + 1) + ",");
                    }
                    else System.out.print(rs.getString(i + 1));
                }
                System.out.println("");
            }
//            System.out.println("第二题效果");
//            while (rs.next()) {
//                for (int i = 0; i < columnCount; i++) {
//                    if(i!=columnCount-1) {
//                        System.out.print(rs.getString(i + 1) + ",");
//                    }
//                    else System.out.print(rs.getString(i + 1));
//                }
//                System.out.println("");
//            }

            String sql2="delete from student where sno=\"s004\";";
            stmt.executeUpdate(sql2);

            String sql3="select * from student where sno=\"s003\";";
            stmt.executeQuery(sql3);

            String sql4="update student set college=\"通信学院\" where sno=\"s001\"";
            stmt.executeUpdate(sql4);


            conn.close();
            } catch (ClassNotFoundException classNotFoundException) {
            classNotFoundException.printStackTrace();
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }
}
