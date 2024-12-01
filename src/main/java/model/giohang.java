package model;

public class giohang {
	public giohang(String magiohang, String manguoidung, String ngaytao) {
		super();
		this.magiohang = magiohang;
		this.manguoidung = manguoidung;
		this.ngaytao = ngaytao;
	}
	String magiohang;
	String manguoidung;
	String ngaytao;
	public String getMagiohang() {
		return magiohang;
	}
	public void setMagiohang(String magiohang) {
		this.magiohang = magiohang;
	}
	public String getManguoidung() {
		return manguoidung;
	}
	public void setManguoidung(String manguoidung) {
		this.manguoidung = manguoidung;
	}
	public String getNgaytao() {
		return ngaytao;
	}
	public void setNgaytao(String ngaytao) {
		this.ngaytao = ngaytao;
	}
	@Override
	public String toString() {
		return "giohang [magiohang=" + magiohang + ", manguoidung=" + manguoidung + ", ngaytao=" + ngaytao + "]";
	}
	
}
