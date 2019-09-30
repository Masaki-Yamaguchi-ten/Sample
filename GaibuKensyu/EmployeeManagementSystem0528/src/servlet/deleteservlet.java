package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.dao.EmployeeDAO;
import model.entity.EmployeeBean;

/**
 * Servlet implementation class deleteservlet
 */
@WebServlet("/Servlet")
public class deleteservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public deleteservlet() {
        super();
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

		//委譲する先のjspを格納する変数url
		String url = null;
		//リクエストオブジェクトのエンコーディング方式の指定
		request.setCharacterEncoding("UTF-8");

		//リクエストからのパラメータ取り出し
		String action=request.getParameter("ACTION");

		//formからの値が「従業員情報一覧」ならDAOを介してデータベースから取得しrequestスコープに格納
		if("削除".equals(action)) {
			//DAOをインスタンス化
			//EmployeeDAO dao = new EmployeeDAO();

			String emp_code = request.getParameter("emp_code");
			EmployeeDAO dao = new EmployeeDAO();

			//DAOからのreturnをBeanのListに格納
			List<EmployeeBean> employeeList = null;

			try {
				//employeeList = dao.selectAllEmployees();
				EmployeeBean emp = dao.selectEmployees(emp_code);
				if(emp !=null) {

					//委譲先の指定
					url = "Deletecheck.jsp";
					//
					HttpSession session = request.getSession();
					session.setAttribute("emp", emp);
				}else {
					//見つからなかった
					url = "DeleteFailure.html";
				}

			} catch (Exception e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}

			//リクエストオブジェクトへの情報設定
			request.setAttribute("employeeList", employeeList);

		} else if("訂正".equals(action)) {
			url = "Delete.html";

		} else if("確定".equals(action)) {
			url = "Deletecomplete.html";

		} else if("削除画面へ戻る".equals(action)) {
			url = "Delete.html";

		} else if("確定".equals(action)) {
			EmployeeDAO dao = new EmployeeDAO();
			//DAOからのreturnをBeanのListに格納
			List<EmployeeBean> employeeList = null;
			try {
				employeeList = dao.selectAllEmployees();
			} catch (Exception e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
			//リクエストオブジェクトへの情報設定
			request.setAttribute("employeeList", employeeList);
			//
			url = "Deletecomplete.html";

		}
		// 画面遷移
		RequestDispatcher rd = request.getRequestDispatcher(url);
		rd.forward(request, response);
		}

}
