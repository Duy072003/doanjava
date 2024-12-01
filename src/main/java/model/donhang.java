package model;

public class donhang {
	public donhang(String madonhang, String manguoidung, String ngaydat, String tongtien, String trangthai) {
		super();
		this.madonhang = madonhang;
		this.manguoidung = manguoidung;
		this.ngaydat = ngaydat;
		this.tongtien = tongtien;
		this.trangthai = trangthai;
	}
	String madonhang;
	String manguoidung;
	String ngaydat;
	String tongtien;
	String trangthai;
	public String getMadonhang() {
		return madonhang;
	}
	public void setMadonhang(String madonhang) {
		this.madonhang = madonhang;
	}
	public String getManguoidung() {
		return manguoidung;
	}
	public void setManguoidung(String manguoidung) {
		this.manguoidung = manguoidung;
	}
	public String getNgaydat() {
		return ngaydat;
	}
	public void setNgaydat(String ngaydat) {
		this.ngaydat = ngaydat;
	}
	public String getTongtien() {
		return tongtien;
	}
	public void setTongtien(String tongtien) {
		this.tongtien = tongtien;
	}
	public String getTrangthai() {
		return trangthai;
	}
	public void setTrangthai(String trangthai) {
		this.trangthai = trangthai;
	}
	@Override
	public String toString() {
		return "donhang [madonhang=" + madonhang + ", manguoidung=" + manguoidung + ", ngaydat=" + ngaydat
				+ ", tongtien=" + tongtien + ", trangthai=" + trangthai + "]";
	}
	
}
