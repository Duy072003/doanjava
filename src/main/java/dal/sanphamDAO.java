package dal;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import dal.DBContext;
import model.sanpham;

public class sanphamDAO {

    // Lấy tất cả sản phẩm từ cơ sở dữ liệu
    public List<sanpham> getAllSanPham() throws SQLException {
        List<sanpham> products = new ArrayList<>();
        String query = "SELECT * FROM sanpham"; // Thay đổi tên bảng nếu cần

        try (Connection conn = DBContext.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                products.add(new sanpham(
                        rs.getString("masanpham"),
                        rs.getString("tensanpham"),
                        rs.getString("mota"),
                        rs.getString("gia"),
                        rs.getString("soluongtonkho"),
                        rs.getString("hinhanh"),
                        rs.getString("madanhmuc")
                ));
            }
        }
        return products;
    }

    // Lấy sản phẩm theo mã sản phẩm
    public sanpham getSanPhamById(String masanpham) throws SQLException {
        String query = "SELECT * FROM sanpham WHERE masanpham = ?";
        sanpham product = null;

        try (Connection conn = DBContext.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, masanpham);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    product = new sanpham(
                            rs.getString("masanpham"),
                            rs.getString("tensanpham"),
                            rs.getString("mota"),
                            rs.getString("gia"),
                            rs.getString("soluongtonkho"),
                            rs.getString("hinhanh"),
                            rs.getString("madanhmuc")
                    );
                }
            }
        }
        return product;
    }

    // Thêm mới sản phẩm
    public boolean addSanPham(sanpham product) throws SQLException {
        String query = "INSERT INTO sanpham (masanpham, tensanpham, mota, gia, soluongtonkho, hinhanh, madanhmuc) VALUES (?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = DBContext.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, product.getMasanpham());
            stmt.setString(2, product.getTensanpham());
            stmt.setString(3, product.getMota());
            stmt.setString(4, product.getGia());
            stmt.setString(5, product.getSoluongtonkho());
            stmt.setString(6, product.getHinhanh());
            stmt.setString(7, product.getMadanhmuc());

            return stmt.executeUpdate() > 0;
        }
    }

    // Cập nhật sản phẩm
    public boolean updateSanPham(sanpham product) throws SQLException {
        String query = "UPDATE sanpham SET tensanpham = ?, mota = ?, gia = ?, soluongtonkho = ?, hinhanh = ?, madanhmuc = ? WHERE masanpham = ?";

        try (Connection conn = DBContext.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, product.getTensanpham());
            stmt.setString(2, product.getMota());
            stmt.setString(3, product.getGia());
            stmt.setString(4, product.getSoluongtonkho());
            stmt.setString(5, product.getHinhanh());
            stmt.setString(6, product.getMadanhmuc());
            stmt.setString(7, product.getMasanpham());

            return stmt.executeUpdate() > 0;
        }
    }

    // Xóa sản phẩm theo mã
    public boolean deleteSanPham(String masanpham) throws SQLException {
        String query = "DELETE FROM sanpham WHERE masanpham = ?";

        try (Connection conn = DBContext.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, masanpham);
            return stmt.executeUpdate() > 0;
        }
    }
    public class Main {
        public static void main(String[] args) {
            sanphamDAO dao = new sanphamDAO();

            try {
                // Lấy danh sách sản phẩm
                List<sanpham> products = dao.getAllSanPham();
                for (sanpham product : products) {
                    System.out.println(product);
                }

                // Thêm mới sản phẩm
                sanpham newProduct = new sanpham("SP05", "Sản phẩm mới", "Mô tả", "200000", "10", "image.jpg", "DM02");
                if (dao.addSanPham(newProduct)) {
                    System.out.println("Thêm sản phẩm thành công!");
                }

                // Cập nhật sản phẩm
                newProduct.setGia("250000");
                if (dao.updateSanPham(newProduct)) {
                    System.out.println("Cập nhật sản phẩm thành công!");
                }

                // Xóa sản phẩm
                if (dao.deleteSanPham("SP05")) {
                    System.out.println("Xóa sản phẩm thành công!");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}
