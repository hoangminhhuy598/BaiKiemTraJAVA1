package Ex3;

public class MainTest3 {
    public static void main(String[] args) {
        VanBan v1 = new VanBan();
        v1.setNoiDung("  Chào mừng     các bạn   đến với Khoá Học lập trình Website với ngôn ngữ Php  ");

        // Số từ : 15
        System.out.println("Số từ : " + v1.demSoTu());

        // Chuyển sang dạng văn bản chuẩn
        v1.setNoiDung(v1.chuanHoaVanBan());
        System.out.println(v1);

        // Viết thường toàn bộ
        v1.setNoiDung(v1.vietThuongToanBo());
        System.out.println(v1);

        // Viết hoa toàn bộ
        v1.setNoiDung(v1.vietHoaToanBo());
        System.out.println(v1);

        // Viết hoa các từ đầu tiên
        v1.setNoiDung(v1.vietHoaMoiChuDauTien());
        System.out.println(v1);
    }
}