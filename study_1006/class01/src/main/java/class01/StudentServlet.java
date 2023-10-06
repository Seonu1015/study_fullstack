package class01;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class StudentServlet
 */
@WebServlet("/student")
public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    private Map<String, Map<String, Integer>> studentGrades;//{ID,:{과목:성적}}
    
    //Map<key, value> -> {key, value}
    
    @Override
    public void init() throws ServletException {
    	studentGrades = new HashMap<>();
    }
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		
		if(action != null && action.equals("viewStudent")) {
			viewStudent(request, response);
		} else if(action != null && action.equals("calculateSubject")) {
			calculateSubject(request, response);
		} else {
			response.sendError(HttpServletResponse.SC_BAD_REQUEST);
		}
	}
	
	private void viewStudent(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String studentId = request.getParameter("studentId");
		
		if(studentGrades.containsKey(studentId)) {
			Map<String, Integer> gradesMap = studentGrades.get(studentId);
			StringBuilder resultBuilder = new StringBuilder();
			
			for(Map.Entry<String, Integer> entry : gradesMap.entrySet()) {
				resultBuilder.append(entry.getKey())
				.append(":")
				.append(entry.getValue())
				.append("<br>");
			}
			
			response.setContentType("text/html; charset=utf-8");
			PrintWriter out = response.getWriter();
			out.println("<html><head><title>학생 성적</title></head>");
			out.println("<body>");
			out.println("<h1>학생 성적</h1>");
			out.println(resultBuilder.toString());
			out.println("<br><br><a href='/Class01/class01/student.html'>메인 페이지로 돌아가기</a>");
			out.append("</body></html>");
		} else {
			response.sendError(HttpServletResponse.SC_NOT_FOUND);
		}
	}
	
	private void calculateSubject(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		String subject = request.getParameter("subject");
			
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int sum = 0;
		int size = 0;
		
		for(Map.Entry<String, Map<String, Integer>> entry : studentGrades.entrySet()) {
			Map<String, Integer> gradesMap = entry.getValue();
			
			if(gradesMap.containsKey(subject)) {
				int score = gradesMap.get(subject);
				
				if(max < score) {
					max = score;
				}
				min = Math.min(min, score);
				sum += score;
				size++;
			}
		}
		
		double avg = (size == 0) ?  0 : sum / size;
			
		PrintWriter writer = response.getWriter();
		
		writer.write(String.format(
				"과목 : %s<br>" +
				"최고 점수 : %d<br>" +
				"최저 점수 : %d<br>" +
				"평균 : %.2f", subject, max, min, avg
				));
	}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		
		String studentId = request.getParameter("studentId");
		String subject = request.getParameter("subject");
		int grade = Integer.parseInt(request.getParameter("grade"));
		
		if(!studentGrades.containsKey(studentId)) {
			studentGrades.put(studentId, new HashMap<>());
		}
		
		Map<String, Integer> gradesMap = studentGrades.get(studentId); // <- studentGrades.get(studentId) 이걸로 가져와서 입력하기 때문에 2차원 map에 입력되게 된다!!!
		gradesMap.put(subject, grade);
		
		response.getWriter().println(studentId + "의 성적이 등록되었습니다.<br>");
		response.getWriter().println("<a href='/Class01/class01/student.html'>메인 페이지로 돌아가기</a>");
	}

}
