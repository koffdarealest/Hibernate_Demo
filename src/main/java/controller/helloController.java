package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.UUID;

public class helloController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();

    }

    public static String generateTransactionCode() {
        UUID uuid = UUID.randomUUID();
        String randomUUIDString = uuid.toString().replace("-", "");
        return randomUUIDString.substring(0,12);
    }

    public static void main(String[] args) {
        System.out.println(generateTransactionCode());
    }
}
