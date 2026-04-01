public class HocSinh {
    private String id;
    private String hoTen;
    private String lop;
    private String diaChi;
    private double toan;
    private double ly;
    private double hoa;

    public HocSinh(String id, String hoTen, String lop, String diaChi, double toan, double ly, double hoa) {
        this.id = id;
        this.hoTen = hoTen;
        this.lop = lop;
        this.diaChi = diaChi;
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
    }
    public void hienThiThongTinHocSinh() {
        System.out.println("ID: " + id
                + " | Họ Tên: " + hoTen
                + " | Lớp: " + lop
                + " | Địa chỉ: " + diaChi
                + " | Toán: " + toan
                + " | Lý: " + ly
                + " | Hóa: " + hoa);
    }
    public String getId() {
        return id;
    }
    public String getHoTen() {
        return hoTen;
    }
    public double getDiemTrungBinh() {
        return (double)((toan + ly + hoa)/3);
    }
    public double getTongDiem() {
        return (double)(toan + ly + hoa);
    }
}
