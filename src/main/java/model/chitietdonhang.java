package model;

public class chitietdonhang {
	public chitietdonhang(String machitietdonhang, String madonhang, String masanpham, String soluong, String giahan) {
		super();
		this.machitietdonhang = machitietdonhang;
		this.madonhang = madonhang;
		this.masanpham = masanpham;
		this.soluong = soluong;
		this.giahan = giahan;
	}
	String machitietdonhang;
	String madonhang;
	String masanpham;
	String soluong;
	String giahan;
	public String getMachitietdonhang() {
		return machitietdonhang;
	}
	public void setMachitietdonhang(String machitietdonhang) {
		this.machitietdonhang = machitietdonhang;
	}
	public String getMadonhang() {
		return madonhang;
	}
	public void setMadonhang(String madonhang) {
		this.madonhang = madonhang;
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
	public String getGiahan() {
		return giahan;
	}
	public void setGiahan(String giahan) {
		this.giahan = giahan;
	}
	@Override
	public String toString() {
		return "chitietdonhang [machitietdonhang=" + machitietdonhang + ", madonhang=" + madonhang + ", masanpham="
				+ masanpham + ", soluong=" + soluong + ", giahan=" + giahan + "]";
	}
	
}
