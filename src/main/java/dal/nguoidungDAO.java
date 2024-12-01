package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import model.nguoidung;

public class nguoidungDAO extends DBContext	 {
	public nguoidung check(String username, String password) {
		String sql = "SELECT * FROM WebsiteBanHang.nguoidung\r\n"
			+ " Where tendangnhap=? and matkhau=?";
		
		try {
			connection = getConnection();
			PreparedStatement st = connection.prepareStatement(sql);
			
			st.setString(1, username);
			st.setString(2, password);
			
			ResultSet rs = st.executeQuery();
			if(rs.next()) {
				nguoidung a = new nguoidung(rs.getString("tendangnhap"),rs.getString("matkhau"),rs.getString("email"),rs.getString("dienthoai"),rs.getString("diachi"),rs.getString("manguoidung"),rs.getInt("vaitro"));
				return a;
		}
	} catch (Exception e) {
		System.out.println(e);
	}
	return null;
	}
}
