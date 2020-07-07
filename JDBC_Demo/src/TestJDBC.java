import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestJDBC {
    public static void main(String[] args){
        // 初始化驱动
        try {
            //驱动类com.mysql.jdbc.Driver
            //就在 mysql-connector-java-5.0.8-bin.jar中
            //如果忘记了第一个步骤的导包，就会抛出ClassNotFoundException
//            Class.forName("com.mysql.jdbc.Driver");
//            System.out.println("数据库驱动加载成功 ！");
            //
            // 建立与数据库的Connection连接
            // 这里需要提供：
            // 数据库所处于的ip:127.0.0.1 (本机)
            // 数据库的端口号： 3306 （mysql专用端口号）
            // 数据库名称 demo
            // 编码方式 UTF-8
            // 账号 root
            // 密码 root
            // 加了static 就可以不用new了，直接使用类方法
            Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/demo?characterEncoding=UTF-8&&serverTimezone=UTC",
                    "root", "root");
//            System.out.println("连接成功，获取对象："+ c);
            // 获取 Statement
            // 注意：使用的是 java.sql.Statement
            // 不要不小心使用到： com.mysql.jdbc.Statement;
            Statement s = c.createStatement();
            System.out.println("获取 Statement对象： " + s);
            // 准备sql 语句
            // 注意：字符串要用单引号
            String sql = "insert into hero values(null, "+" '提莫'"+","+313.0f+","+50+")";
            s.execute(sql);
            System.out.println("执行插入语句成功");
        }catch (SQLException e){
            //
            e.printStackTrace();
        }


    }

}
