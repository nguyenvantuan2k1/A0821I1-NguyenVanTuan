import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "ServletCustomers", urlPatterns = {"/listcustomers"})
public class ServletCustomers extends HttpServlet {
    static ArrayList<Customer> listCustomers = new ArrayList<Customer>();

    @Override
    public void init() throws ServletException {
        listCustomers.add(new Customer("Nguyễn Văn Tuấn", "10-08-2001", "Quảng Nam", "img/art-light-pattern-design-wallpaper-preview.jpg"));
        listCustomers.add(new Customer("Trần Văn A", "10-08-2001", "Quảng Nam", "img/art-light-pattern-design-wallpaper-preview.jpg"));
        listCustomers.add(new Customer("Nguyễn Văn B", "10-08-2001", "Quảng Nam", "img/art-light-pattern-design-wallpaper-preview.jpg"));
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("view/listCustomers.jsp");
        request.setAttribute("listCustomers", listCustomers);
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
