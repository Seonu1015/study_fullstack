package Class01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Grade
 */
@WebServlet("/grade")
public class GradeServlet extends HttpServlet {
	
//	ArrayList score = new 
	
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GradeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String studName = request.getParameter("studName");
		int english = Integer.parseInt(request.getParameter("english"));
		int math = Integer.parseInt(request.getParameter("math"));
		int science = Integer.parseInt(request.getParameter("math"));
		
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		out.append("<html><body><h2>" + studName + "의 성적</h2><hr>")
		.append("영어 : " + english + ", 수학 : " + math + ", 과학 : " + science);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String studName = request.getParameter("studName");
		int english = Integer.parseInt(request.getParameter("english"));
		int math = Integer.parseInt(request.getParameter("math"));
		int science = Integer.parseInt(request.getParameter("math"));
		
		response.setContentType("text/html; charset=utf-8");
		response.getWriter().println(studName);
		response.getWriter().println("영어 : " + english + ", 수학 : " + math + ", 과학 : " + science);
	}
	
	

}
