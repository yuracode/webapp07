package chapter07;

import java.io.IOException;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.RequestDispatcher;

import model.Human;

@WebServlet("/Simple")
public class SimpleServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, 
        HttpServletResponse response) throws ServletException, IOException {
        // リクエスト/レスポンスで文字化けしないようにUTF-8を使用
        request.setCharacterEncoding("UTF-8");
            Human human = new Human("佐々木", 56);
            request.setAttribute("human", human);
            RequestDispatcher dispatcher = request.getRequestDispatcher("/simple.jsp");
            dispatcher.forward(request, response);
    }
}
