package seon01;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UserController
 */
@WebServlet("/user")
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UserController() {
		super();
		// TODO Auto-generated constructor stub
	}

	private Map<String, String> users;

	@Override
	public void init() throws ServletException {
		users = new HashMap<>();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		String userId = request.getParameter("userId");
		String password = request.getParameter("password");

		response.setContentType("text/html; charset=utf-8");

		if (isVaildUser(userId, password)) {
			response.setStatus(HttpServletResponse.SC_OK);
			response.getWriter().println("로그인 성공<br><br>");
			response.getWriter().println("<a href='/Seon/seon01/login.jsp'>로그인 페이지로 돌아가기</a>");
		} else {
			response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
			response.getWriter().println("로그인 실패<br><br>");
			response.getWriter().println("<a href='/Seon/seon01/login.jsp'>로그인 페이지로 돌아가기</a>");
		}
	}

	private boolean isVaildUser(String userId, String password) {

		if (users.containsKey(userId)) {
			String storedPassword = users.get(userId);
			return password.equals(storedPassword);
		}

		return false;
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String userId = request.getParameter("userId");
		String password = request.getParameter("password");

		if (!users.containsKey(userId)) {
			users.put(userId, password);
		}

		for (Map.Entry<String, String> entry : users.entrySet()) {
			System.out.println("ID: " + entry.getKey() + ", password: " + entry.getValue());
		}

		response.sendRedirect(request.getContextPath() + "/seon01/login.jsp");
	}
}
