import java.util.Scanner;

public class MainQuanLyHocSinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuanLyHocSinh qlhs = new QuanLyHocSinh();
        int choice;
        do {
            System.out.println("----------MENU QUẢN LÝ HỌC SINH----------");
            System.out.println("1. Thêm học sinh");
            System.out.println("2. Hiển thị danh sách học sinh");
            System.out.println("3. Xóa học sinh dựa vào ID");
            System.out.println("4. Tìm kiếm học sinh dựa vào ID");
            System.out.println("5. Tìm học sinh có điểm trung bình cao nhất");
            System.out.println("6. Tìm học sinh có điểm trung bình thấp nhất");
            System.out.println("7. Sắp xếp học sinh theo tên");
            System.out.println("8. Cập nhật thông tin học sinh dựa vào ID");
            System.out.println("9. Hiển thị ra học sinh có tổng điểm 3 môn trên 24đ");
            System.out.println("10. Hiển thị ra học sinh có tổng điểm dưới 18đ");
            System.out.println("11. Hiển thị ra danh sách học sinh đạt chất lượng giỏi (đtb > 8)");
            System.out.println("12. Thoát khỏi chương trình");
            System.out.println("Vui lòng chọn chức năng");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    qlhs.themNhanVien(sc);
                    break;
                case 2:
                    qlhs.hienThiDanhSachNhanVien();
                    break;
                case 3:
                    qlhs.xoaNhanVienTheoId(sc);
                    break;
                case 4:
                    qlhs.timKiemNhanVienTheoId(sc);
                    break;
                case 5:
                    qlhs.timKiemNhanVienCoLuongCaoNhat();
                    break;
                case 6:
                    qlhs.timKiemNhanVienCoSoGioLamThapNhat();
                    break;
                case 7:
                    qlhs.sapXepNhanVienTheoTen();
                    break;
                case 8:
                    qlhs.sapXepNhanVienTheoSoGioLam();
                    break;
                case 9:
                    qlhs.capNhatThongTinNhanVien(sc);
                    break;
                case 10:
                    break;
                case 11:
                    break;
                case 12:
                    System.out.println("Thoát khỏi chương trình. Hẹn gặp lại!!!");
                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại");
            }
        } while (choice != 12);
    }
}
