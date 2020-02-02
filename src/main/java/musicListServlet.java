import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;

@WebServlet(name = "musicListServlet", urlPatterns = "/myappcontext/list")
public class musicListServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        ResultSet rset = null;
        Statement stmt = null;
        Connection conn = null;

        try {
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");

            String absPath = getServletContext().getRealPath("/") + "../../db";

            conn = DriverManager.getConnection("jdbc:derby:" + absPath,
                    "theresa",
                    "theresa");
            stmt = conn.createStatement();
            rset = stmt.executeQuery("SELECT title, composer, detailId FROM sheet_music");

            StringBuilder sb = new StringBuilder("<html><body>");

            while(rset.next()){
                sb.append("<li>");
                String title = rset.getString("title");
                String composer = rset.getString("composer");
                int detailId = rset.getInt(3);

                sb.append(title + ", " + composer + ", " + detailId);

                sb.append("</li>");
            }
            sb.append("</body></html>");

            response.setContentType("text/html");
            response.getWriter().print(sb.toString());

        } catch (ClassNotFoundException | SQLException e) {
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