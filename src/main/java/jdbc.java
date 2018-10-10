import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static java.sql.DriverManager.*;

public class jdbc {
    private static Connection connection;
    static{
        try {
            //1.加载驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
            //2.创建连接
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/min?useSSL=false","root","min");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static List<min> queryDB(String sql) throws SQLException {
        List<min> min = new ArrayList<min>();
        Statement stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        while(rs.next()){
            //获取表中字段值
            int id = rs.getInt(1);
            String name = rs.getString("name");
            min m = new min();
            m.setId(id);
            m.setName(name);
            min.add(m);
        }
        return min;
    }

    public static void main(String[] args) throws SQLException {
        // //4.创建Statement
        // PreparedStatement pstmt = connection.prepareStatement("select * from min where name= ?");
        // pstmt.setString(1,"min");
        // //5.创建ResultSet
        // ResultSet rs= pstmt.executeQuery();
        // System.out.println(rs);
        List<min> minList = queryDB("select * from users");
        for(min m:minList){
            System.out.println(m.getId()+"-"+m.getName());
        }
    }
}
