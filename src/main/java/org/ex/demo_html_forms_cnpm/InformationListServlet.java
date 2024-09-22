package org.ex.demo_html_forms_cnpm;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@WebServlet(name = "InformationListServlet", value = "/InformationListServlet")
public class InformationListServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String url = "/index.html";

        String action = request.getParameter("action");
        if(action == null){
            action = "join";
        }

        if(action.equals("join")){
            url = "/index.html";
        }
        else if(action.equals("add")){
            String firstName = request.getParameter("firstName");
            String lastName = request.getParameter("lastName");
            String email = request.getParameter("email");

            String date = request.getParameter("date");
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate dob = LocalDate.parse(date, formatter);

            String hearFrom = request.getParameter("optionMedia");

            String[] confirm = request.getParameterValues("confirm");
            String confirmed = "";
            if (confirm != null && confirm.length > 0) {
                confirmed = String.join(System.lineSeparator(), confirm);
            }

            String contact = request.getParameter("contact");

            User user = new User(firstName, lastName, email, dob, hearFrom, confirmed, contact);


            request.setAttribute("user", user);
            url = "/thanks.jsp";
        }
        getServletContext()
                .getRequestDispatcher(url)
                .forward(request, response);
    }
}