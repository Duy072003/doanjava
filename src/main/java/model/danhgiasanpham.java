package model;

public class danhgiasanpham {
	public danhgiasanpham(String madanhgia, String masanpham, String manguoidung, String danhgia, String binhluan,
			String ngaydanh_gia) {
		super();
		this.madanhgia = madanhgia;
		this.masanpham = masanpham;
		this.manguoidung = manguoidung;
		this.danhgia = danhgia;
		this.binhluan = binhluan;
		this.ngaydanh_gia = ngaydanh_gia;
	}
	String madanhgia;
	String masanpham;
	String manguoidung;
	String danhgia;
	String binhluan;
	String ngaydanh_gia;
	public String getMadanhgia() {
		return madanhgia;
	}
	public void setMadanhgia(String madanhgia) {
		this.madanhgia = madanhgia;
	}
	public String getMasanpham() {
		return masanpham;
	}
	public void setMasanpham(String masanpham) {
		this.masanpham = masanpham;
	}
	public String getManguoidung() {
		return manguoidung;
	}
	public void setManguoidung(String manguoidung) {
		this.manguoidung = manguoidung;
	}
	public String getDanhgia() {
		return danhgia;
	}
	public void setDanhgia(String danhgia) {
		this.danhgia = danhgia;
	}
	public String getBinhluan() {
		return binhluan;
	}
	public void setBinhluan(String binhluan) {
		this.binhluan = binhluan;
	}
	public String getNgaydanh_gia() {
		return ngaydanh_gia;
	}
	public void setNgaydanh_gia(String ngaydanh_gia) {
		this.ngaydanh_gia = ngaydanh_gia;
	}
	@Override
	public String toString() {
		return "danhgiasanpham [madanhgia=" + madanhgia + ", masanpham=" + masanpham + ", manguoidung=" + manguoidung
				+ ", danhgia=" + danhgia + ", binhluan=" + binhluan + ", ngaydanh_gia=" + ngaydanh_gia + "]";
	}
	
}
