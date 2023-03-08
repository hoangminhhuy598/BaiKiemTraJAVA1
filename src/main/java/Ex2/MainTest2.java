package Ex2;

import java.util.Scanner;
public class MainTest2 {
    public static void main(String[] args) {
        //truyền vào đối tượng 1 nhân viên tạo sẵn
        NhanVien kt1 = new KyThuat("SS5998","Hoàng Minh Huy", "02/09/1999","Hà Nội", "An Toàn Thông Tin");
        System.out.println(kt1);
        System.out.println("Mô tả công việc: " + kt1.moTaCongViec());

        // Nhập các dữ liệu từ bàn phím thông tin của nhân viên
        Scanner in = new Scanner(System.in);
        System.out.print("\nNhập mã nhân viên: ");
        String maNhanVien = in.nextLine();
        System.out.print("Nhập họ và tên: ");
        String hoTen = in.nextLine();
        System.out.print("Nhập năm sinh: ");
        String namSinh = in.nextLine();
        System.out.print("Nhập địa chỉ: ");
        String diaChi = in.nextLine();
        System.out.print("Nhập chuyên nghành: ");
        String chuyenNghanh = in.nextLine();

        NhanVien kt2 = new KyThuat(maNhanVien,hoTen, namSinh, diaChi, chuyenNghanh);
        System.out.println(kt2);
        System.out.println("Mô tả công việc: " + kt2.moTaCongViec());

    }
}
