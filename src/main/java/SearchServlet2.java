import entity.Music;
import entity.MusicDetail;
import entity.MusicInstrument;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "SearchServlet2", urlPatterns = "/search2")
public class SearchServlet2 extends HttpServlet {
    private final String DRIVER_NAME = "jdbc:derby:";
    private final String DATABASE_PATH = "../../db";
    private final String SCHEMA = "theresa";
    private final String PASSWORD = "theresa";

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rset = null;

        try {
            String searchTerm = request.getParameter("title");

            //driver
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");

            //path
            String absPath = getServletContext().getRealPath("/") + DATABASE_PATH;

            StringBuilder sql = new StringBuilder(" SELECT title, composer, type, difficulty "); // DON'T FORGET THE SPACES
            sql.append(" FROM sheet_music ");
            sql.append(" join detail on (sheet_music.detailId = detail.detailId) ");
            sql.append(" join instrument on (detail.instrumentId = instrument.instrumentId) ");
            sql.append(" where title = ? " );
            sql.append(" order by title ");

            //connection
            conn = DriverManager.getConnection(DRIVER_NAME + absPath, SCHEMA, PASSWORD);
            // statement to execute SQL
            pstmt = conn.prepareStatement(sql.toString());
            // Fill the prepared statement params
            pstmt.setString(1, searchTerm);
            // Execute a SELECT query and get a result set
            rset = pstmt.executeQuery();

            List<Music> musicList = new ArrayList<Music>();

          /*  while (rset.next()) {
                Music music = new Music();
                *//*MusicDetail difficulty = new MusicDetail();
                MusicInstrument type = new MusicInstrument();
*//*
                music.setTitle(rset.getString(1));
                music.setComposer(rset.getString(2));
                music.setType(rset.getString(3));
                music.setDifficulty(rset.getString(4));
                musicList.add(music);
            }
*/
            request.setAttribute("musicPiece", musicList);
            request.getRequestDispatcher("search2.jsp").forward(request, response);

        } catch (SQLException | ClassNotFoundException e) {
            // If there's an exception locating the driver, send IT as the response
            response.getWriter().print(e.getMessage());
            e.printStackTrace();
        } finally {
            if (rset != null) {
                try {
                    rset.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (pstmt != null) {
                try {
                    pstmt.close();
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
}
