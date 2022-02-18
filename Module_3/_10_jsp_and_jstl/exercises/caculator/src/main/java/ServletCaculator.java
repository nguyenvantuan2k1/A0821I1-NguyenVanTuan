import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "ServletCaculator", value = "/ServletCaculator")
public class ServletCaculator extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        float num1 = Float.parseFloat(request.getParameter("num1"));
        System.out.println(num1);
        float num2 = Float.parseFloat(request.getParameter("num2"));
        System.out.println(num2);
        String operator = String.valueOf(request.getParameter("operator"));
        float result=0 ;
        try{
            switch (operator) {
                case "+":{
                    result=num1+num2;
                    break;
                }
                case "-":{
                    result=num1-num2;
                    break;
                }
                case "*":{
                    result=num1*num2;
                    break;
                }
                case "/":{
                    result=num1/num2;
                    break;
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }

        request.setAttribute("result",result);
        RequestDispatcher rd = request.getRequestDispatcher("/result.jsp");
        rd.forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
