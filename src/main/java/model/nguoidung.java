package model;

public class nguoidung {
    private String manguoidung;
    private String tendangnhap;
    private String matkhau;
    private String email;
    private String dienthoai;
    private String diachi;
    private int vaitro;

    public nguoidung(String manguoidung, String tendangnhap, String matkhau, String email, String dienthoai, String diachi, int vaitro) {
        this.manguoidung = manguoidung;
        this.tendangnhap = tendangnhap;
        this.matkhau = matkhau;
        this.email = email;
        this.dienthoai = dienthoai;
        this.diachi = diachi;
        this.vaitro = vaitro;
    }

    public String getManguoidung() {
        return manguoidung;
    }

    public void setManguoidung(String manguoidung) {
        this.manguoidung = manguoidung;
    }

    public String getTendangnhap() {
        return tendangnhap;
    }

    public void setTendangnhap(String tendangnhap) {
        this.tendangnhap = tendangnhap;
    }

    public String getMatkhau() {
        return matkhau;
    }

    public void setMatkhau(String matkhau) {
        this.matkhau = matkhau;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDienthoai() {
        return dienthoai;
    }

    public void setDienthoai(String dienthoai) {
        this.dienthoai = dienthoai;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public int getvaitro() {
        return vaitro;
    }

    public void setvaitro(int vaitro) {
        this.vaitro = vaitro;
    }

    @Override
    public String toString() {
        return "nguoidung [manguoidung=" + manguoidung + ", tendangnhap=" + tendangnhap + ", matkhau=" + matkhau
                + ", email=" + email + ", dienthoai=" + dienthoai + ", diachi=" + diachi + ", vaitro=" + vaitro + "]";
    }
}
