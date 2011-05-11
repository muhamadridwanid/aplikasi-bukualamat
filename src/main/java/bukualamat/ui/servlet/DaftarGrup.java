package bukualamat.ui.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class DaftarGrup extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		resp.setContentType("text/html");
		
		String output = "<html>";
		output += "<head>";
		output += "<title>Daftar Grup</title>";
		output += "</head>";
		output += "<body>";
		output += "<h1>Daftar Grup</h1>";
		
		output += "<table>";
		output += "<tr>";
		output += "<td>Kode</td>";
		output += "<td>Nama</td>";
		output += "</tr>";

		output += "<tr>";
		output += "<td>G-001</td>";
		output += "<td>Grup 001</td>";
		output += "</tr>";

		output += "<tr>";
		output += "<td>G-001</td>";
		output += "<td>Grup 001</td>";
		output += "</tr>";

		output += "<tr>";
		output += "<td>G-001</td>";
		output += "<td>Grup 001</td>";
		output += "</tr>";

		output += "</table>";
		
		output += "</body>";
		output += "</html>";
		
		resp.getWriter().print(output);
		resp.getWriter().close();
		
	}
	
}