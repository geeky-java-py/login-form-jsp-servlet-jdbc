package net.form.login.website;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import net.form.login.database.DatabaseTerminus;
import net.form.login.model.LoginTerminus;


/**
 * Servlet implementation class Serve
 */
@WebServlet("/Serve")
public class Serve extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private DatabaseTerminus dataTerm;
	
	public void init() {
		
		dataTerm = new DatabaseTerminus();
		
	}

    /**
     * Default constructor. 
     */
    public Serve() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		String username = request.getParameter("username");
        String password = request.getParameter("password");
        LoginTerminus loginTerm = new LoginTerminus();
        loginTerm.setUsername(username);
        loginTerm.setPassword(password);
        
        try {
        	if(dataTerm.validate(loginTerm)) {
        		response.sendRedirect("SuccessInLogging.jsp");
        	}else {
        		
        		HttpSession session = request.getSession();
        	}
        	
        }catch(ClassNotFoundException cnf) {
        	
        	cnf.printStackTrace();
        }
	}

}
