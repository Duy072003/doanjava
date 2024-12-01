package model;

public class sanpham {
	public sanpham(String masanpham, String tensanpham, String mota, String gia, String soluongtonkho, String hinhanh,
			String madanhmuc) {
		super();
		this.masanpham = masanpham;
		this.tensanpham = tensanpham;
		this.mota = mota;
		this.gia = gia;
		this.soluongtonkho = soluongtonkho;
		this.hinhanh = hinhanh;
		this.madanhmuc = madanhmuc;
	}
	String masanpham;
	String tensanpham;
	String mota;
	String gia;
	String soluongtonkho;
	String hinhanh;
	String madanhmuc;
	public String getMasanpham() {
		return masanpham;
	}
	public void setMasanpham(String masanpham) {
		this.masanpham = masanpham;
	}
	public String getTensanpham() {
		return tensanpham;
	}
	public void setTensanpham(String tensanpham) {
		this.tensanpham = tensanpham;
	}
	public String getMota() {
		return mota;
	}
	public void setMota(String mota) {
		this.mota = mota;
	}
	public String getGia() {
		return gia;
	}
	public void setGia(String gia) {
		this.gia = gia;
	}
	public String getSoluongtonkho() {
		return soluongtonkho;
	}
	public void setSoluongtonkho(String soluongtonkho) {
		this.soluongtonkho = soluongtonkho;
	}
	public String getHinhanh() {
		return hinhanh;
	}
	public void setHinhanh(String hinhanh) {
		this.hinhanh = hinhanh;
	}
	public String getMadanhmuc() {
		return madanhmuc;
	}
	public void setMadanhmuc(String madanhmuc) {
		this.madanhmuc = madanhmuc;
	}
	@Override
	public String toString() {
		return "sanpham [masanpham=" + masanpham + ", tensanpham=" + tensanpham + ", mota=" + mota + ", gia=" + gia
				+ ", soluongtonkho=" + soluongtonkho + ", hinhanh=" + hinhanh + ", madanhmuc=" + madanhmuc + "]";
	}
	
}
