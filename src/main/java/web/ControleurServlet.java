package web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.IproduitDqo;
import dao.ProduitDaoImpl;
import produit.entities.Produit;

@WebServlet("/epsilon")
public class ControleurServlet extends HttpServlet {
	private IproduitDqo metier;
	
	@Override
	public void init() throws ServletException {
		metier = new ProduitDaoImpl();	
	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String path=request.getServletPath();
		if(path.equals("/epsilon")) {
			String motCle=request.getParameter("motCle");
			ProduitModel model=new ProduitModel();
			model.setMotCle(motCle);
			List<Produit> produits=metier.produitsParMC("%"+motCle+"%");
			model.setProduits(produits);
			request.setAttribute("model", model);
			request.getRequestDispatcher("epsilon.jsp").forward(request, response);
		}
		request.getRequestDispatcher("epsilon.jsp").forward(request, response);
		
	}
	
	

}
