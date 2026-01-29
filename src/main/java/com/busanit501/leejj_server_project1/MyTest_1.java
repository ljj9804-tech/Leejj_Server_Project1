package com.busanit501.leejj_server_project1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "MyServlet", value = "/my")
public class MyTest_1 extends HttpServlet {

    @Override
//    protected void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse)
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        // 지금 작성하는 코드는 절대 치지말고, 구경하세요.
        // 기본 원리를 한번 보여주는 용도, 절대 이렇게 작업안해요.
//        resp.setContentType("text/html");
        resp.setContentType("text/html;charset=UTF-8");
        resp.setCharacterEncoding("UTF-8");

        // 서버에서 작성한 내용을, 웹문서 형식에 맞게 조정해서, 보내기.
        PrintWriter out = resp.getWriter();
        out.println("<html><body>");
        out.println("<h1>안녕하세요 이진주입니다.<h1>");
        out.println("</body><html>");
    }
}
