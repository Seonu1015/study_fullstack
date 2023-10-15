package class01;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GradeServlet
 */
@WebServlet("/grade")
public class GradeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static ArrayList<Student> students = new ArrayList<>();
       
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
		String studName = request.getParameter("searchName");
		
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		out.append("<html><body>");
		
		for (Student student : students) {
			if (!studName.equals(student.getName())) {
				continue;
			} else {
			    out.append("<h2>" + studName + "의 성적</h2><hr>");
				out.println("영어 : " + student.getEnglish() + "<br>");
		        out.println("수학 : " + student.getMath() + "<br>");
		        out.println("과학 : " + student.getScience() + "<br><br>");
			}
		}
	    out.println("<a href='/Class01/class01/main.html'>메인 페이지로 돌아가기</a>");
	    out.append("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String studName = request.getParameter("enterName");
	    int english = Integer.parseInt(request.getParameter("english"));
	    int math = Integer.parseInt(request.getParameter("math"));
	    int science = Integer.parseInt(request.getParameter("science"));

	    Student student = new Student(studName, english, math, science);
	    
	    ServletContext application = getServletContext();
	    application.setAttribute("students", students);
	    @SuppressWarnings("unchecked")
		ArrayList<Student> students = (ArrayList<Student>) application.getAttribute("students");
	    students.add(student);
	    
	    // ArrayList에는 저장되고 있는 것 같은데
	    System.out.println("Students in ArrayList:");
	    for (Student stud : students) {
	        System.out.println("Name: " + stud.getName() + ", English: " + stud.getEnglish() +
	                           ", Math: " + stud.getMath() + ", Science: " + stud.getScience());
	    }

	    response.setContentType("text/html; charset=utf-8");
	    response.getWriter().println(studName + "의 성적이 등록되었습니다.<br>");
	    response.getWriter().println("영어 : " + english + ", 수학 : " + math + ", 과학 : " + science + "<br><br>");		
	    
	    
	    
	    response.getWriter().println("<a href='/Class01/class01/main.html'>메인 페이지로 돌아가기</a>");
	}
}