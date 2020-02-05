import entity.Music;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "ListServlet2", urlPatterns = "/list2")
public class ListServlet2 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        ResultSet rset = null;
        Statement stmt = null;
        Connection conn = null;

        try {
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");

            String absPath = getServletContext().getRealPath("/") + "../../db";

            StringBuilder sql = new StringBuilder(" SELECT title, composer, type, difficulty "); // DON'T FORGET THE SPACES
            sql.append(" FROM sheet_music ");
            sql.append(" join detail on (sheet_music.detailId = detail.detailId) ");
            sql.append(" join instrument on (detail.instrumentId = instrument.instrumentId) ");
            sql.append(" order by title ");
            conn = DriverManager.getConnection("jdbc:derby:" + absPath,
                    "theresa",
                    "theresa");
            stmt = conn.createStatement();
            rset = stmt.executeQuery(sql.toString());

            List<Music> musicList = new ArrayList<Music>();

            while(rset.next()){
                Music music = new Music();
                music.setTitle(rset.getString(1));
                music.setComposer(rset.getString(2));
                music.setType(rset.getString(3));
                music.setDifficulty(rset.getString(4));
                musicList.add(music);
            }
            request.setAttribute("myMusic", musicList);
            request.getRequestDispatcher("list2.jsp").forward(request, response);

        } catch (ClassNotFoundException | SQLException e) {
            response.getWriter().print(e.getMessage());
            e.printStackTrace();
        }
        finally {
            closeAll(conn,stmt, rset);
        }

    }

    public void closeAll(Connection conn, Statement stmt, ResultSet rset) {
        if (rset != null) {
            try {
                rset.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (stmt != null) {
            try {
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
