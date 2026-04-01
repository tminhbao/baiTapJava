import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyHocSinh {
    private ArrayList<HocSinh> danhSachHocSinh = new ArrayList<>();

    public HocSinh timHocSinhTheoId(String id) {
        for (HocSinh hs: danhSachHocSinh) {
            if (hs.getId().equals(id)) {
                return hs;
            }
        }
        return null;
    }

    public void themHocSinh(Scanner sc) {
        System.out.println("Thêm học sinh");
        System.out.println("Nhập id: ");
        String id = sc.nextLine();
        if (timHocSinhTheoId(id) != null) {
            System.out.println("ID đã tồn tại. Vui lòng nhập ID khác");
            return;
        }
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
        HocSinh hs = new HocSinh(id, hoTen, lop, diaChi, toan, ly, hoa);
        danhSachHocSinh.add(hs);
        System.out.println("Thêm học sinh thành công");
    }

    public void hienThiDanhSachHocSinh() {
        if (danhSachHocSinh.isEmpty()) {
            System.out.println("Danh sách học sinh trống");
            return;
        }
        for (HocSinh hs: danhSachHocSinh) {
            hs.hienThiThongTinHocSinh();
        }
    }

    public void xoaHocSinhTheoId(Scanner sc) {
        System.out.println("Nhập ID học sinh cần xóa");
        String id = sc.nextLine();
        boolean found = false;
        for (HocSinh hs: danhSachHocSinh) {
            if (hs.getId().equals((id))) {
                danhSachHocSinh.remove(hs);
                System.out.println("Xóa học sinh thành công");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy học sinh với ID: " + id);
        }
    }

    public void timKiemHocSinhTheoId(Scanner sc) {
        System.out.println("Nhập ID học sinh cần tìm kiếm: ");
        String id = sc.nextLine();
        boolean found = false;
        for (HocSinh hs: danhSachHocSinh) {
            if (hs.getId().equals(id)) {
                hs.hienThiThongTinHocSinh();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy học sinh với ID: " + id);
        }
    }
    public void timKiemHocSinhCoDTBCaoNhat() {
        if (danhSachHocSinh.isEmpty()) {
            System.out.println("Danh sách học sinh trống");
            return;
        }
        HocSinh maxHS = danhSachHocSinh.get(0);
        for (HocSinh hs: danhSachHocSinh) {
            if (hs.getDiemTrungBinh() > maxHS.getDiemTrungBinh()) {
                maxHS = hs;
            }
        }
        System.out.println("Học sinh có điểm trung bình cao nhất là: ");
        maxHS.hienThiThongTinHocSinh();
    }

    public void timKiemHocSinhCoDTBThapNhat() {
        if (danhSachHocSinh.isEmpty()) {
            System.out.println("Danh sách học sinh trống");
            return;
        }
        HocSinh minHS = danhSachHocSinh.get(0);
        for (HocSinh hs: danhSachHocSinh) {
            if (hs.getDiemTrungBinh() < minHS.getDiemTrungBinh()) {
                minHS = hs;
            }
        }
        System.out.println("Học sinh có điểm trung bình thấp nhất là: ");
        minHS.hienThiThongTinHocSinh();
    }

    public void sapXepHocSinhTheoTen() {
        if (danhSachHocSinh.isEmpty()) {
            System.out.println("Danh sách học sinh trống");
            return;
        }
        danhSachHocSinh.sort((hs1, hs2) -> hs1.getHoTen().compareTo(hs2.getHoTen()));
        System.out.println("Danh sách học sinh sau khi sắp xếp");
        hienThiDanhSachHocSinh();
    }

    public void capNhatThongTinHocSinh(Scanner sc){
        if (danhSachHocSinh.isEmpty()) {
            System.out.println("Danh sách học sinh trống");
            return;
        }
        System.out.println("Nhập ID học sinh cần cập nhật: ");
        String id = sc.nextLine();
        HocSinh hs = timHocSinhTheoId(id);
        if (hs == null) {
            System.out.println("Không tìm thấy học sinh với ID "+ id);
            return;
        }
        System.out.println("Nhập tên mới: ");
        String hoTen = sc.nextLine();
        System.out.println("Nhập lớp mới: ");
        String lop = sc.nextLine();
        System.out.println("Nhập địa chỉ mới: ");
        String diaChi = sc.nextLine();
        System.out.println("Nhập điểm Toán mới: ");
        double toan = Double.parseDouble(sc.nextLine());
        System.out.println("Nhập điểm Lý mới: ");
        double ly = Double.parseDouble(sc.nextLine());
        System.out.println("Nhập điểm Hóa mới: ");
        double hoa = Double.parseDouble(sc.nextLine());
        hs = new HocSinh(id, hoTen, lop, diaChi, toan, ly, hoa);
        for (int i = 0; i < danhSachHocSinh.size(); i++) {
            if (danhSachHocSinh.get(i).getId().equals(id)) {
                danhSachHocSinh.set(i, hs);
                break;
            }
        }
        System.out.println("Cập nhật thông tin thành công");
    }

    public void hienThiHocSinhCoTongDiemTren24() {
        if (danhSachHocSinh.isEmpty()) {
            System.out.println("Danh sách học sinh trống");
            return;
        }
        ArrayList<HocSinh> hocSinhCoTongDiemTren24 = new ArrayList<>();
        for (HocSinh hs: danhSachHocSinh) {
            if (hs.getTongDiem() > 24) {
                hocSinhCoTongDiemTren24.add(hs);
            }
        }
        if (hocSinhCoTongDiemTren24.isEmpty()) {
            System.out.println("KHông có một học sinh nào");
        } else {
            for (HocSinh hs: hocSinhCoTongDiemTren24) {
                hs.hienThiThongTinHocSinh();
            }
        }
    }

    public void hienThiHocSinhCoTongDiemDuo18() {
        if (danhSachHocSinh.isEmpty()) {
            System.out.println("Danh sách học sinh trống");
            return;
        }
        ArrayList<HocSinh> hocSinhCoTongDiemDuo18 = new ArrayList<>();
        for (HocSinh hs: danhSachHocSinh) {
            if (hs.getTongDiem() < 18) {
                hocSinhCoTongDiemDuo18.add(hs);
            }
        }
        if (hocSinhCoTongDiemDuo18.isEmpty()) {
            System.out.println("KHông có một học sinh nào");
        } else {
            for (HocSinh hs: hocSinhCoTongDiemDuo18) {
                hs.hienThiThongTinHocSinh();
            }
        }
    }

    public void hienThiHocSinhGioi() {
        if (danhSachHocSinh.isEmpty()) {
            System.out.println("Danh sách học sinh trống");
            return;
        }
        ArrayList<HocSinh> hocSinhGioi = new ArrayList<>();
        for (HocSinh hs: danhSachHocSinh) {
            if (hs.getDiemTrungBinh() > 8) {
                hocSinhGioi.add(hs);
            }
        }
        if (hocSinhGioi.isEmpty()) {
            System.out.println("KHông có một học sinh nào");
        } else {
            for (HocSinh hs: hocSinhGioi) {
                hs.hienThiThongTinHocSinh();
            }
        }
    }
}
