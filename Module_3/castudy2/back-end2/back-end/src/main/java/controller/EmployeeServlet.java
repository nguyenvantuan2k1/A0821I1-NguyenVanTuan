package controller;

import model.entity.Employee;
import service.EmployeeService;
import service.impl.EmployeeServiceImpl;

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
                     sortByName(request, response);
                break;
            default:
                listEmployees(employeeService.findAll(),request, response);
        }

    }

    private void sortByName(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        listEmployees(employeeService.sort(),request,response);
    }

    private void listEmployees(List<Employee> list,HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("listEmployee", list);
        request.getRequestDispatcher("views/employee/employee.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action==null){
            action ="";
        }
        switch (action){
            case "save":
                save(request,response);
                // thêm mới
                break;
            case "edit":
                edit(request, response);
                break;
            case "delete":
                delete(request, response);
                break;
            case "search":
                search(request, response);
                break;
            default:
                listEmployees(employeeService.findAll(),request, response);
                // hien thi danh sách

        }
    }

    private void search(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        listEmployees(employeeService.find("find"), request, response);
    }

    private void save(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String dob = request.getParameter("dob");
        String idCard = request.getParameter("idCard");
        Double salary = Double.parseDouble(request.getParameter("salary"));
        String phoneNumber = request.getParameter("phoneNumber");
        String address = request.getParameter("address");
        employeeService.save(new Employee(id, name, dob, idCard, salary,phoneNumber,email,address));
        response.sendRedirect("/EmployeeServlet");
    }

    private void edit(HttpServletRequest request, HttpServletResponse response) {


    }

    private void delete(HttpServletRequest request, HttpServletResponse response) throws IOException {
       employeeService.delete(Integer.parseInt(request.getParameter("id")));
        response.sendRedirect("/EmployeeServlet");
    }
}
