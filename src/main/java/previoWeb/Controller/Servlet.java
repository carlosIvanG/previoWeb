package previoWeb.Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import previoWeb.dao.DocumentoDao;
import previoWeb.dao.EstamentoDao;
import previoWeb.modelo.Documento;
import previoWeb.modelo.Estamento;

/**
 * Servlet implementation class Servlet
 */
@WebServlet({""})
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private EstamentoDao eDao;
	private DocumentoDao dDao;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Servlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		this.eDao = new EstamentoDao();
		this.dDao = new DocumentoDao();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<Estamento> estamentos = eDao.listar();
		List<Documento> documentos = dDao.listar();
		request.setAttribute("estamentos", estamentos);
		request.setAttribute("documentos", documentos);
		
		request.setAttribute("titulo", "registro");
		RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
		dispatcher.forward(request, response);
		System.out.println("=>" + estamentos);
		// TODO Auto-generated method stub
		
		
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
