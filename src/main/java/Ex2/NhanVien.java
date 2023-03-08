package Ex2;

public abstract class NhanVien {
    private String maNhanVien;
    private String hoTen;
    private String namSinh;

    private String diaChi;

    public NhanVien(String maNhanVien, String hoTen) {
        this.maNhanVien = maNhanVien;
        this.hoTen = hoTen;
    }

    public NhanVien(String maNhanVien, String hoTen, String namSinh, String diaChi) {
        this.maNhanVien = maNhanVien;
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.diaChi = diaChi;
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(String namSinh) {
        this.namSinh = namSinh;
    }

    public String getdiaChi() {
        return diaChi;
    }

    public void setdiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    @Override
    public String toString() {
        return "NhanVien[" +
                " Mã nhân viên='" + maNhanVien + '\'' +
                ", Họ tên='" + hoTen + '\'' +
                ", Năm sinh='" + namSinh + '\'' +
                ", Địa chỉ='" + diaChi + '\'' +
                ']';
    }

    public abstract String moTaCongViec();
}