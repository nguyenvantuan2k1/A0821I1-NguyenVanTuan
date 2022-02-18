package com.codegym.controller;

import com.codegym.model.UserCRUD;
import com.codegym.model.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "UserServlet", value = "/users")
public class UserServlet extends HttpServlet {
    private UserCRUD userCRUD;

    public void init() {
        userCRUD = new UserCRUD();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) action = "";
        try {
            switch (action) {
                case "save":
                    save(request, response);
                    break;
                case "find":
                    find(request, response);
                    break;
                case "delete":
                    deleteUser(request, response);
                    break;
                default:
                    listUser(userCRUD.selectAllUsers(), request, response);
                    break;
            }
        } catch (SQLException ex) {
            throw new ServletException(ex);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) action = "";
        try {
            switch (action) {
                case "sort":
                    sortByName(request, response);
                    break;
                default:
                    listUser(userCRUD.selectAllUsers(), request, response);
                    break;
            }
        } catch (SQLException ex) {
            throw new ServletException(ex);
        }
    }

    private void listUser(List<User> list, HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException {
        request.setAttribute("listUser", list);
        request.getRequestDispatcher("user/list.jsp").forward(request, response);
    }

    private void sortByName(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException {
        listUser(userCRUD.sortByName(), request, response);
    }

    private void find(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException {
        listUser(userCRUD.find(request.getParameter("find")), request, response);
    }

    private void save(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String country = request.getParameter("country");
        userCRUD.saveUser(new User(id, name, email, country));
        response.sendRedirect("/users");
    }

    private void deleteUser(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
        userCRUD.deleteUser(Integer.parseInt(request.getParameter("id")));
        response.sendRedirect("/users");
    }

//    private void insertUser(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException {
//        String name = request.getParameter("name");
//        String email = request.getParameter("email");
//        String country = request.getParameter("country");
//
//        User newUser = new User(name, email, country);
//        userCRUD.insertUser(newUser);
//        response.sendRedirect("/users");
//    }

//    private void showEdition(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
//
//        int id = Integer.parseInt(request.getParameter("id"));
//        User currentUser = userCRUD.selectUser(id);
//
//        request.setAttribute("user", currentUser);
//        request.getRequestDispatcher("user/list.jsp").forward(request, response);
//    }

//    private void updateUser(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException {
//        int id = Integer.parseInt(request.getParameter("id"));
//        String name = request.getParameter("name");
//        String email = request.getParameter("email");
//        String country = request.getParameter("country");
//
//        User updatedUser = new User(id, name, email, country);
//        userCRUD.updateUser(updatedUser);
//        response.sendRedirect("/users");
//    }

}
