package org.iridium.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class EmailServlet
 */
@WebServlet("/EmailServlet")
public class EmailServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public EmailServlet() {
    }

    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String email = request.getParameter("email");
        if (email == null || "".equals(email)) {
            out.println("email 不能为空");
        } else {
            email = new String(email.getBytes("ISO8859-1"), "UTF-8");
            if (email.equals("iridiumcao@gmail.com")) {
                out.print("Email【" + email + "】已存在，请使用其他用户名");
            } else {
                out.print("Email【" + email + "】可用");
            }
            out.println("<br/><a href=\"index.html\">返回首页</a>");
        }

    }

}
