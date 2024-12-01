package model;

public class danhmuc {
	public danhmuc(String madanhmuc, String tendanhmuc, String mota) {
		super();
		this.madanhmuc = madanhmuc;
		this.tendanhmuc = tendanhmuc;
		this.mota = mota;
	}
	String madanhmuc;
	String tendanhmuc;
	String mota;
	public String getMadanhmuc() {
		return madanhmuc;
	}
	public void setMadanhmuc(String madanhmuc) {
		this.madanhmuc = madanhmuc;
	}
	public String getTendanhmuc() {
		return tendanhmuc;
	}
	public void setTendanhmuc(String tendanhmuc) {
		this.tendanhmuc = tendanhmuc;
	}
	public String getMota() {
		return mota;
	}
	public void setMota(String mota) {
		this.mota = mota;
	}
	@Override
	public String toString() {
		return "danhmuc [madanhmuc=" + madanhmuc + ", tendanhmuc=" + tendanhmuc + ", mota=" + mota + "]";
	}
	
}
