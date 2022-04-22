import java.util.ArrayList;
import java.util.List;

public class DanhSachHangHoa {private List<QuanLyHangHoa> dshangHoa = new ArrayList<>();

    public void them(QuanLyHangHoa quanLyhangHoa) {
        dshangHoa.add(quanLyhangHoa);
    }
    //them hang hoa tu ban phim
    public void NhapHangHoa(int loaiHangHoa) {
        if (loaiHangHoa == 1) {
            ThucPham ThucPham = new ThucPham();
            ThucPham.nhap();
            this.dshangHoa.add(ThucPham);
        } else if (loaiHangHoa == 2) {
            SanhSu SanhSu = new SanhSu();
            SanhSu.nhap();
            this.dshangHoa.add(SanhSu);
        } else if (loaiHangHoa == 3) {
            DienMay DienMay = new DienMay();
            DienMay.nhap();
            this.dshangHoa.add(DienMay);
        }
    }
    //in danh sach hang hoa
    public void inDSHangHoa() {
        for (QuanLyHangHoa quanLyHangHoa : dshangHoa) {
            System.out.println(quanLyHangHoa);
        }
    }
    //tim hang hoa theo ma
    public QuanLyHangHoa timHangHoaTheoMa(String maHH) {
        QuanLyHangHoa quanLyHangHoa = null;
        for (QuanLyHangHoa qlhh : dshangHoa) {
            if (qlhh.getMaHang().equals(maHH)) {
                quanLyHangHoa = qlhh;
            }
        }
        System.out.println(quanLyHangHoa);
        return quanLyHangHoa;
    }
    //Xoa hang hoa
    public void xoaHangHoa(QuanLyHangHoa quanlyhangHoa) {
        dshangHoa.remove(quanlyhangHoa);

    }
    //Tim hang hoa theo vi tri
    public int TimHangHoaTheoViTri(QuanLyHangHoa quanlyhangHoa) {
        int location = -1;
        location = dshangHoa.indexOf(quanlyhangHoa);
        return location;
    }
    //Sua hang hoa
    public QuanLyHangHoa suaHangHoa(int viTri, QuanLyHangHoa quanlyhangHoa) {
        TimHangHoaTheoViTri(quanlyhangHoa);
        dshangHoa.set(viTri, quanlyhangHoa);
        quanlyhangHoa.nhap();
        return quanlyhangHoa;
    }
    
}
