import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Query {

    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
       // ResultSet resultSet = null;
        try {
            try {
                // 创建数据库连接Connection
                connection = DBUtil.getConnection2();
                // 根据数据库连接创建操作命令对象Statement
                statement = connection.createStatement();
                String sql = "math,english from exam_result"+"where name =？";
                // 操作命令对象执行sql语句，返回结果集resultSet
                // resultSet类似  List<Map<String, Object>>
                statement.
                int num = statement.executeUpdate(sql);
                if(num>0){
                    System.out.println("修改成功");
                }
                else{
                    System.out.println("修改失败");
                }
            } finally {
                // 释放资源
                DBUtil.close(connection, statement, null);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
