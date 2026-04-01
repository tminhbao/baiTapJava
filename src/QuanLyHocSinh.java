import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyHocSinh {
    private ArrayList<HocSinh> danhSachHocSinh = new ArrayList<>();
    public void themHocSinh(Scanner sc) {
        System.out.println("Thêm học sinh");
        System.out.println("Nhập id: ");
        String id = sc.nextLine();
        // Check id duplicated

        System.out.println("Nhập họ tên: ");
        String hoTen = sc.nextLine();
        System.out.println("Nhập lớp: ");
        String lop = sc.nextLine();
        System.out.println("Nhập địa chỉ: ");
        String diaChi = sc.nextLine();
        System.out.println("Nhập điểm Toán: ");
        double toan = Double.parseDouble(sc.nextLine());
        System.out.println("Nhập điểm Lý: ");
        double ly = Double.parseDouble(sc.nextLine());
        System.out.println("Nhập điểm Hóa: ");
        double hoa = Double.parseDouble(sc.nextLine());
        HocSinh hs = new HocSinh(id, hoTen, lop, diaChi, toan, ly. hoa);
        danhSachHocSinh.add(hs);
        System.out.println("Thêm học sinh thành công");
    }
}
