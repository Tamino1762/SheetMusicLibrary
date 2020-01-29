import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;

@WebServlet(name = "searchServlet", urlPatterns = "/myappcontext/search")

public class searchServlet extends HttpServlet {

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

            StringBuilder sql = new StringBuilder("select title, composer, difficulty, instrument");
            sql.append("from sheet_music");
            sql.append("join detail on (sheet_music.detailId = detail.detailId");
            sql.append("join detail on (detail.instrumentId = instrument.instrumentId");
            sql.append("where title = ?");

            //connection
            conn = DriverManager.getConnection(DRIVER_NAME + absPath, SCHEMA, PASSWORD);
            // statement to execute SQL
            pstmt = conn.prepareStatement(sql.toString());
            // Fill the prepared statement params
            pstmt.setString(1, searchTerm);
            // Execute a SELECT query and get a result set
            rset = pstmt.executeQuery();

            //output string builder
            StringBuilder output = new StringBuilder();

            //html
            output.append ("<html><head><link type='text/css' rel='stylesheet' href='css/styles.css'></head>");
            output.append("<body");

            //table
            output.append("<table>");
            output.append("<tr>");
            //headers
            output.append("<th>Title</th><th>Composer</th><th>Difficulty</th><th>Instrument</th>");
            output.append("</tr>");

            while (rset.next()) {
                output.append("<tr>");

                String title = rset.getString(1);
                output.append("<td>" + title + "</td>");

                String composer = rset.getString(1);
                output.append("<td>" + composer + "</td>");

                String difficulty = rset.getString(1);
                output.append("<td>" + difficulty + "</td>");

                String instrument = rset.getString(1);
                output.append("<td>" + instrument + "</td>");

                output.append("</tr>");
            }

            // Close all opening tags
            output.append("</table></body></html>");

            // Send the HTML as the response
            response.setContentType("text/html");
            response.getWriter().print(output.toString());

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
