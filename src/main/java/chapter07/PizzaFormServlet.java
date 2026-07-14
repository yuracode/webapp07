package chapter07;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import model.PizzaResult;
import model.PizzaCalculator;

@WebServlet("/pizza")
public class PizzaFormServlet extends HttpServlet {

    // 入力フォーム表示
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.getRequestDispatcher("/WEB-INF/jsp/form.jsp")
               .forward(request, response);
    }

    // 計算処理→結果表示
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Double.parseDouble(),Integer.parseInt()で文字列を数値に変換する際に、
        // NumberFormatExceptionが発生する可能性があるため、try-catchで例外処理を行うことが望ましいです。
        double radius = Double.parseDouble(request.getParameter("radius"));
        int people = Integer.parseInt(request.getParameter("people"));
        // できるだけ、ロジックはServletに書かず、別クラスに切り出すことが望ましいです。
        PizzaResult result = PizzaCalculator.calculate(radius, people);

        request.setAttribute("result", result);
        request.getRequestDispatcher("/WEB-INF/jsp/result.jsp")
               .forward(request, response);
    }
}