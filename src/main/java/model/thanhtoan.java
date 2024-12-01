package model;

public class thanhtoan {
	public thanhtoan(String mathanhtoan, String madonhang, String ngaythanhtoan, String phuongthucthanhtoan,
			String trangthaithanhtoan, String sotien) {
		super();
		this.mathanhtoan = mathanhtoan;
		this.madonhang = madonhang;
		this.ngaythanhtoan = ngaythanhtoan;
		this.phuongthucthanhtoan = phuongthucthanhtoan;
		this.trangthaithanhtoan = trangthaithanhtoan;
		this.sotien = sotien;
	}
	String mathanhtoan;
	String madonhang;
	String ngaythanhtoan;
	String phuongthucthanhtoan;
	String trangthaithanhtoan;
	String sotien;
	public String getMathanhtoan() {
		return mathanhtoan;
	}
	public void setMathanhtoan(String mathanhtoan) {
		this.mathanhtoan = mathanhtoan;
	}
	public String getMadonhang() {
		return madonhang;
	}
	public void setMadonhang(String madonhang) {
		this.madonhang = madonhang;
	}
	public String getNgaythanhtoan() {
		return ngaythanhtoan;
	}
	public void setNgaythanhtoan(String ngaythanhtoan) {
		this.ngaythanhtoan = ngaythanhtoan;
	}
	public String getPhuongthucthanhtoan() {
		return phuongthucthanhtoan;
	}
	public void setPhuongthucthanhtoan(String phuongthucthanhtoan) {
		this.phuongthucthanhtoan = phuongthucthanhtoan;
	}
	public String getTrangthaithanhtoan() {
		return trangthaithanhtoan;
	}
	public void setTrangthaithanhtoan(String trangthaithanhtoan) {
		this.trangthaithanhtoan = trangthaithanhtoan;
	}
	public String getSotien() {
		return sotien;
	}
	public void setSotien(String sotien) {
		this.sotien = sotien;
	}
	@Override
	public String toString() {
		return "thanhtoan [mathanhtoan=" + mathanhtoan + ", madonhang=" + madonhang + ", ngaythanhtoan=" + ngaythanhtoan
				+ ", phuongthucthanhtoan=" + phuongthucthanhtoan + ", trangthaithanhtoan=" + trangthaithanhtoan
				+ ", sotien=" + sotien + "]";
	}
	
}
