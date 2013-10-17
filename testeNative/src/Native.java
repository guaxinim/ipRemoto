

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Native
 */
@WebServlet("/get")
public class Native extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Native() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("######### Entrou na Servlet");
		//HelloWorld hello = new HelloWorld();
		//hello.carregaLib();
		String sysout = "<br><br>######### Client Addr: " + request.getRemoteAddr() + 
				"<br>" + "######### Client Host: " + request.getRemoteHost() +
				"<br>" + "######### Client Host: " + request.getRemotePort() + "<br>";
		System.out.println("######### Client Addr: " + request.getRemoteAddr());
		System.out.println("######### Client Host: " + request.getRemoteHost());
		System.out.println("######### Client Port: " + request.getRemotePort());
		PrintWriter writer = response.getWriter();
		writer.write(sysout);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
