package org.example.hellofx.repository;

import org.example.hellofx.entity.Article;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ArticleRepository {
private final String MYSQL_CONNECTION = "jdbc:mysql://localhost:3306/student_manager";
private final String MYSQL_USERNAME = "root";
private final String MYSQL_PASSWORD = "";

public void save(Article obj) {
    try{
        Connection connection = DriverManager.getConnection(MYSQL_CONNECTION,MYSQL_USERNAME,MYSQL_PASSWORD);
        String strSql = "insert into  articles (title, description, content) values (?,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(strSql);
        preparedStatement.setString(1, obj.getTitle());
        preparedStatement.setString(2, obj.getDescription());
        preparedStatement.setString(3, obj.getContent());
        preparedStatement.execute();
        preparedStatement.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }

}

}
