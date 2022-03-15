package controller;

import model.dto.EmployeeDTO;
import model.entity.Employee;
import model.entity.Position;
import service.impl.EmployeeService;
import service.impl.PositionService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "EmployeeServlet", urlPatterns = "/EmployeeServlet")
public class EmployeeServlet extends HttpServlet {
    EmployeeService employeeService = new EmployeeService();
    PositionService positionService = new PositionService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) action = "";
        switch (action) {
//            case "sort":
////                     sortByName(request, response);
//                break;
            default:
                listEmployees(employeeService.getAll(), request, response);
        }

    }

//    private void sortByName(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        listEmployees(employeeService.sort(),request,response);
//    }

//    private void sortByName(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        listEmployees(employeeService.sortDTO(),request,response);
//    }

    private void listEmployees(List<EmployeeDTO> list, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("listEmployee", list);
        List<Position> listpositions = positionService.SelectPosition();
        request.setAttribute("listpositions", listpositions);
        request.getRequestDispatcher("views/employee/employee.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "save":
                save(request, response);
                // thêm mới
                break;
            case "edit":
                edit(request, response);
                break;
            case "delete":
                delete(request, response);
                break;
            case "find":
                search(request, response);
                break;
            default:
                listEmployees(employeeService.getAll(), request, response);
                // hien thi danh sách
        }
    }

    private void search(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String find = request.getParameter("find");
        listEmployees(employeeService.search(find),request,response);
    }

    private void edit(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        double price = Double.parseDouble(request.getParameter("price"));
        int quantity = Integer.parseInt(request.getParameter("quantity"));
        String color = request.getParameter("color");
        int categoryid = Integer.parseInt(request.getParameter("categoryid"));
        employeeService.save(new Employee(id, name,price,quantity,color,categoryid));
    }

    private void delete(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        employeeService.delete(id);
        response.sendRedirect("/EmployeeServlet");
    }

    private void save(HttpServletRequest request, HttpServletResponse response) throws IOException {
//        int id = Integer.parseInt(request.getParameter("id"));
//        String name = request.getParameter("name");
//        String dob = request.getParameter("dob");
//        String idCard = request.getParameter("idCard");
//        double salary = Double.parseDouble(request.getParameter("salary"));
//        String phoneNumber = request.getParameter("phoneNumber");
//        int position = Integer.parseInt(request.getParameter("position"));
//        employeeService.save(new Employee(id, name, dob, idCard, salary, phoneNumber, position));
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        double price = Double.parseDouble(request.getParameter("price"));
        int quantity = Integer.parseInt(request.getParameter("quantity"));
        String color = request.getParameter("color");
        int categoryid = Integer.parseInt(request.getParameter("categoryid"));
        employeeService.save(new Employee(id, name,price,quantity,color,categoryid));
        response.sendRedirect("/EmployeeServlet");
    }
}
