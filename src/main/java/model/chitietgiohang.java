package model;

public class chitietgiohang {
	public chitietgiohang(String machitietgiohang, String magiohang, String masanpham, String soluong) {
		super();
		this.machitietgiohang = machitietgiohang;
		this.magiohang = magiohang;
		this.masanpham = masanpham;
		this.soluong = soluong;
	}
	String machitietgiohang;
	String magiohang;
	String masanpham;
	String soluong;
	public String getMachitietgiohang() {
		return machitietgiohang;
	}
	public void setMachitietgiohang(String machitietgiohang) {
		this.machitietgiohang = machitietgiohang;
	}
	public String getMagiohang() {
		return magiohang;
	}
	public void setMagiohang(String magiohang) {
		this.magiohang = magiohang;
	}
	public String getMasanpham() {
		return masanpham;
	}
	public void setMasanpham(String masanpham) {
		this.masanpham = masanpham;
	}
	public String getSoluong() {
		return soluong;
	}
	public void setSoluong(String soluong) {
		this.soluong = soluong;
	}
	@Override
	public String toString() {
		return "chitietgiohang [machitietgiohang=" + machitietgiohang + ", magiohang=" + magiohang + ", masanpham="
				+ masanpham + ", soluong=" + soluong + "]";
	}

}
