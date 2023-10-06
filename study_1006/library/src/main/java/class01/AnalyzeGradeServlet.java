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
 * Servlet implementation class AnalyzeGradeServlet
 */
@WebServlet("/analyze")
public class AnalyzeGradeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AnalyzeGradeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html; charset=utf-8");
        PrintWriter out = response.getWriter();
        out.append("<html><body>");

        ServletContext context = getServletContext();
        @SuppressWarnings("unchecked")
		ArrayList<Student> students = (ArrayList<Student>) context.getAttribute("students");

        for (Student student : students) {
            int totalScore = student.getEnglish() + student.getMath() + student.getScience();
            student.setTotalScore(totalScore);
            student.setAvgScore(totalScore/3);
        }
        
        

        out.append("<h2>성적 분석 결과</h2><hr>");
        out.append("<table border='1px'>");
        out.append("<tr><th>이름</th><th>영어</th><th>수학</th><th>과학</th><th>총점</th><th>평균</th></tr>");
        
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            out.append("<tr>");
            out.append("<td>" + student.getName() + "</td>");
            out.append("<td>" + student.getEnglish() + "</td>");
            out.append("<td>" + student.getMath() + "</td>");
            out.append("<td>" + student.getScience() + "</td>");
            out.append("<td>" + student.getTotalScore() + "</td>");
            out.append("<td>" + student.getAvgScore() + "</td>");
            out.append("</tr>");
        }
        out.append("</table><br><br>");

        out.println("<a href='/Seon/class01/main.html'>메인 페이지로 돌아가기</a>");
        out.append("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
