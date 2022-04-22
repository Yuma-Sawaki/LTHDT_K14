public class DienMay extends QuanLyHangHoa {
    // implementtation
    private double thoiGianBaoHanh;
    private double HieuNang;

    // interfaces
    //constructor
    public DienMay() {

    }

    public DienMay(String maHang, String tenHang, int soLuongTonKho, double donGia, double thoiGianBH,
            double hieuNang) {
        super(maHang, tenHang, soLuongTonKho, donGia);
        setThoiGianBH(thoiGianBH);
        setHieuNang(hieuNang);
    }

    public void setThoiGianBH(double thoiGianBH) {
        if (thoiGianBH >= 0) {
            this.thoiGianBaoHanh = thoiGianBH;
        } else {
            System.out.println("time insurance phai lon hon hoac bang 0 !");
        }
    }

    public double getThoiGianBH() {
        return thoiGianBaoHanh;
    }

    public double getHieuNang() {
        return HieuNang;
    }

    public void setHieuNang(double HieuNang) {
        if (HieuNang > 0) {
            this.HieuNang = HieuNang;
        } else {
            System.out.println("hieu nang phai lon hon 0 !");
        }
    }
    //Nhap hang dien may
    @Override
    public void nhap() {
        super.nhap();
        System.out.print("Nhap thoi gian bao hanh: ");
        this.thoiGianBaoHanh = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Nhap hieu nang: ");
        this.HieuNang = scanner.nextDouble();
        scanner.nextLine();
    }
    //tinh VAT
    @Override
    public double tinhVAT(double VAT) {
        return super.tinhVAT(VAT);
    }
    //toString
    @Override
    public String toString() {
        return super.toString() + " ||TG bao hanh: " + this.thoiGianBaoHanh + "||" + " Hieu nang: " + this.HieuNang;
    }

}
