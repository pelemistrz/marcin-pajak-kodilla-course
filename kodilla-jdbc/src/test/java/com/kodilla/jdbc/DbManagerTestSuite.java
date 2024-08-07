package com.kodilla.jdbc;

import org.junit.jupiter.api.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static org.junit.jupiter.api.Assertions.*;

public class DbManagerTestSuite {
    @Test
    public void testConnect() throws SQLException {
        //given
        //when
        DbManager dbManager = DbManager.getInstance();//mozna DbManager.INSTANCE;
        //then
        assertNotNull(dbManager.getConnection());
    }
    @Test
    void testSelectUsers() throws SQLException {
        //given
        DbManager dbManager = DbManager.getInstance();
        //when
        String sqlQuery = "select * from users";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(sqlQuery);
        //then
        int count = 0;
        while (rs.next()) {
            System.out.println(rs.getInt(1)+". "+
                    rs.getString(2)+", "+
                    rs.getString(3));
            count++;
        }
        rs.close();
        statement.close();
        assertEquals(count, 15);
    }
    @Test
    void testSelectUsersAndPosts() throws SQLException {
        //given
        DbManager dbManager = DbManager.getInstance();
        //when
        String sqlQuery = """
        select u.firstname, u.lastname, count(posts.USER_ID)
                        from users u join posts on posts.user_id = u.id
                        group by posts.USER_ID
                        having count(posts.USER_ID) > 1;  
        """;
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(sqlQuery);
        //then
        int count = 0;
        while (rs.next()){
            System.out.println(rs.getString(1)+", "+rs.getString(2)+", "+rs.getInt(3));
            count++;
        }
        rs.close();
        statement.close();
        assertEquals(1,count);

    }
}
