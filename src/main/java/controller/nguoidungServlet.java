package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import model.nguoidung;

import java.io.IOException;

import dal.nguoidungDAO;

/**
 * Servlet implementation class nguoidungServlet
 */
public class nguoidungServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public nguoidungServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("login.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String u = request.getParameter("user");
		String p = request.getParameter("password");
		System.out.println(u);
		System.out.println(p);
		nguoidungDAO d = new nguoidungDAO();
		nguoidung a = d.check(u, p);
		HttpSession session = request.getSession();
		if(a == null) {
			request.setAttribute("error", "Username or Password invalid!!!");
			request.getRequestDispatcher("login.jsp").forward(request, response);
			
		}else {
			session.setAttribute("account", a);
			
			if(a.getvaitro() == 1) {
				request.getRequestDispatcher("admin/nguoidung.jsp").forward(request, response);
				
			}else {
				request.getRequestDispatcher("index.jsp").forward(request, response);
			}
		}
	}

}
