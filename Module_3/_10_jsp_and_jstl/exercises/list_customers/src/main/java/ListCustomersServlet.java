import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "ListCustomersServlet", value = "/ListCustomersServlet", urlPatterns = {"/listcustomers"})
public class ListCustomersServlet extends HttpServlet {
 static ArrayList listCustomer= new ArrayList();

    @Override
    public void init() throws ServletException {
        listCustomer.add(new Customers("Nguyễn Văn Tuấn", "10-08-2001", "Quảng Nam", "resources/imgs/2.jpg"));
        listCustomer.add(new Customers("Trần Văn A", "10-08-2001", "Quảng Nam", "resources/imgs/2.jpg"));
        listCustomer.add(new Customers("Nguyễn Văn B", "10-08-2001", "Quảng Nam", "resources/imgs/2.jpg"));
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("webapp/view/listC/listCustomers.jsp");
        request.setAttribute("listCustomers", listCustomer);
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
