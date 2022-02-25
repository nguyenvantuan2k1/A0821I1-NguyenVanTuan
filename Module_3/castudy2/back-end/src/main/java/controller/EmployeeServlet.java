package controller;

import model.Employee;
import service.EmployeeService;
import service.impl.EmployeeServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "EmployeeServlet", urlPatterns = "/EmployeeServlet")
public class EmployeeServlet extends HttpServlet {
    EmployeeService employeeService = new EmployeeServiceImpl();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) action = "";
        switch (action) {
            case "sort":
//                    sortByName(request, response);
                break;
            default:
                listEmployees(request, response);
                break;
        }

    }

    private void listEmployees(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       List<Employee> employees = employeeService.findAll();
       request.setAttribute("listEmployee",employees);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("views/employee/employee.jsp");
        requestDispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action==null){
            action ="";
        }
        switch (action){
            case "add":
//                save(request,response);
                // thêm mới
                break;
            case "edit":
                // chỉnh sửa
                break;
            case "delete":
//                delete(request, response);
                break;
            case "search":
//                search(request, response);
                break;
            default:
                listEmployees(request, response);
                // hien thi danh sách

        }
    }
}
