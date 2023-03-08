package Ex2;

public class KyThuat extends NhanVien {
    private String chuyenNghanh;

    public KyThuat(String maNhanVien, String hoTen) {
        super(maNhanVien, hoTen);
    }

    public KyThuat(String maNhanVien, String hoTen, String namSinh, String diaChi, String chuyenNghanh) {
        super(maNhanVien, hoTen, namSinh, diaChi);
        this.chuyenNghanh = chuyenNghanh;
    }

    public String getChuyenNghanh() {
        return chuyenNghanh;
    }

    public void setChuyenNghanh(String chuyenNghanh) {
        this.chuyenNghanh = chuyenNghanh;
    }

    @Override
    public String moTaCongViec() {
        return "Lập trình viên";
    }

    @Override
    public String toString() {
        return "KyThuat[" + super.toString() +
                ", Chuyên ngành='" + chuyenNghanh + '\'' +
                ']';
    }
}
