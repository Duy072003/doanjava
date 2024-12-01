package controller;

import dal.sanphamDAO;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.sanpham;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet("/sanphamServlet") // URL mapping cho servlet
public class sanphamServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private sanphamDAO dao;

    @Override
    public void init() throws ServletException {
        super.init();
        dao = new sanphamDAO(); // Khởi tạo DAO
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) action = "list";

        try {
            switch (action) {
                case "new":
                    showNewForm(request, response);
                    break;
                case "edit":
                    showEditForm(request, response);
                    break;
                case "delete":
                    deleteSanPham(request, response);
                    break;
                default:
                    listSanPham(request, response);
                    break;
            }
        } catch (SQLException ex) {
            throw new ServletException(ex);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        try {
            switch (action) {
                case "insert":
                    insertSanPham(request, response);
                    break;
                case "update":
                    updateSanPham(request, response);
                    break;
                default:
                    listSanPham(request, response);
                    break;
            }
        } catch (SQLException ex) {
            throw new ServletException(ex);
        }
    }

    private void listSanPham(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, ServletException, IOException {
        List<sanpham> listSanPham = dao.getAllSanPham();
        request.setAttribute("listSanPham", listSanPham);
        RequestDispatcher dispatcher = request.getRequestDispatcher("sanpham-list.jsp");
        dispatcher.forward(request, response);
    }

    private void showNewForm(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("sanpham-form.jsp");
        dispatcher.forward(request, response);
    }

    private void showEditForm(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, ServletException, IOException {
        String masanpham = request.getParameter("id");
        sanpham existingSanPham = dao.getSanPhamById(masanpham);
        request.setAttribute("sanpham", existingSanPham);
        RequestDispatcher dispatcher = request.getRequestDispatcher("sanpham-form.jsp");
        dispatcher.forward(request, response);
    }

    private void insertSanPham(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException {
        String masanpham = request.getParameter("masanpham");
        String tensanpham = request.getParameter("tensanpham");
        String mota = request.getParameter("mota");
        String gia = request.getParameter("gia");
        String soluongtonkho = request.getParameter("soluongtonkho");
        String hinhanh = request.getParameter("hinhanh");
        String madanhmuc = request.getParameter("madanhmuc");

        sanpham newSanPham = new sanpham(masanpham, tensanpham, mota, gia, soluongtonkho, hinhanh, madanhmuc);
        dao.addSanPham(newSanPham);
        response.sendRedirect("sanphamServlet");
    }

    private void updateSanPham(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException {
        String masanpham = request.getParameter("masanpham");
        String tensanpham = request.getParameter("tensanpham");
        String mota = request.getParameter("mota");
        String gia = request.getParameter("gia");
        String soluongtonkho = request.getParameter("soluongtonkho");
        String hinhanh = request.getParameter("hinhanh");
        String madanhmuc = request.getParameter("madanhmuc");

        sanpham updatedSanPham = new sanpham(masanpham, tensanpham, mota, gia, soluongtonkho, hinhanh, madanhmuc);
        dao.updateSanPham(updatedSanPham);
        response.sendRedirect("sanphamServlet");
    }

    private void deleteSanPham(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException {
        String masanpham = request.getParameter("id");
        dao.deleteSanPham(masanpham);
        response.sendRedirect("sanphamServlet");
    }
}
