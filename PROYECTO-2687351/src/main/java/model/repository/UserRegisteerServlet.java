package model.repository;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.User;

@WebServlet("/registerUser")
public class UserRegisterServlet extends HttpServlet {


    @Override


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException {


// Recoger todos los datos del formulario


        String user_firstname = request.getParameter("user_firstname");


        String user_lastname = request.getParameter("user_lastname");


        String user_email = request.getParameter("user_email");


        String user_password = request.getParameter("user_password");


// Rellenar un objeto User


        User user = new User();
        user.setUser_firstname(user_firstname);
        user.setUser_lastname(user_lastname);
        user.setUser_email(user_email);
        user.setUser_password(user_password);

        // Llamar a la capa de Repositorio y guardar el objeto User en la base de datos
        Repository<User> repository =new UserRepositoryImpl();
    }
}
