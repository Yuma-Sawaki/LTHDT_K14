import java.util.Date;

import java.util.Scanner;
import java.text.ParseException;
public class QuanLyHangHoaTestDrive {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        DanhSachHangHoa dSHangHoa = new DanhSachHangHoa();
        Date date = new Date();
        int chon;int temp;String tim;
        QuanLyHangHoa ThucPham1 = new ThucPham("001", " Mi SieuKay vi Bò", 200, 27000, date, date, "Acecook");
        QuanLyHangHoa ThucPham2 = new ThucPham("002", " Mi SieuKay vi Hai san ", 100, 27000,date, date, "Acecook");
        QuanLyHangHoa ThucPham3 = new ThucPham("003", " Mi Hao Hao tom chua cay ", 500, 10000,date, date, "Acecook");
        QuanLyHangHoa ThucPham4 = new ThucPham("004", " Mi cay Nissin vi Pho mai", 1000, 25000,date, date, "Nissin"); 
        // Do em thích ăn mì nên giới thiệu chút Mì siêu cay hai vị Bò và Hải sản cay cấp độ 7 ăn rất dễ hư bao tử hoặc dạ dày khi ăn lúc đói ( vì em đã bị loét dạ dày do ăn nó quá nhiều )
        // Mì cay Nissin vị Phô mai ăn có vị cay thanh tao kết hợp vị phô mai béo ngậy ăn rất tuyệt và không quá là cay, có điều hơi ít sợi mì, ăn rất nhanh ngán nếu ăn liên tục
        QuanLyHangHoa SanhSu1 = new SanhSu("011", "Bo am tra ", 100, 500000, "Bat Trang", date);
        QuanLyHangHoa SanhSu2 = new SanhSu("012", "Binh hoa su ", 200, 7000000, "Bat Trang", date);
        QuanLyHangHoa SanhSu3 = new SanhSu("013", "Bo do an Bat Trang ", 50, 500000, "Bat Trang", date);
        QuanLyHangHoa DienMay1 = new DienMay("021", "laptop", 23, 5999000, 12, 210);// Phải chi có con Laptop bao ngon nghẻ mà rẻ vầy để mua thì sướng
        QuanLyHangHoa DienMay2 = new DienMay("022", "Tivi GL", 17, 13999000, 24, 240);
        QuanLyHangHoa DienMay3 = new DienMay("023", "May quat ", 40, 2999000, 24, 200);

        do {
            System.out.println("------- Muc Lua Chon -------");
            System.out.println("\t|0|I.Them hang hoa               |0| ");
            System.out.println("\t|0|II.Xoa hang hoa               |0|");
            System.out.println("\t|0|III.Sua hang hoa              |0|");
            System.out.println("\t|0|IV.in xuat hang hoa co san    |0|");
            System.out.println("\t|0|V.Tim kiem hang hoa theo ma   |0|");
            System.out.println("\t|0|VI.Thoat|0|");
            System.out.print("Hay lua chon: ");
            chon = new Scanner(System.in).nextInt();
            switch (chon) {
                case 1:
                do {
                    System.out.println("------- Muc Lua Chon Chi Tiet Hon ------");
                    System.out.println("[0]I.Them hang thuc pham");
                    System.out.println("[0]II.Them hang sanh su");
                    System.out.println("[0]III.Them hang dien may");
                    System.out.println("[0]IV.Thoat\n");
                    System.out.print("Nao! Hay lua chon tiep nao: ");
                    temp = new Scanner(System.in).nextInt();
                    switch (temp) {
                        case 1:
                            dSHangHoa.NhapHangHoa(1);
                            break;
                        case 2:
                            dSHangHoa.NhapHangHoa(2);
                            break;
                        case 3:
                            dSHangHoa.NhapHangHoa(3);
                            break;
                    }
                } while (temp != 0);
                ;
                    break;
                case 2:
                System.out.println("Dien ma hang hoa can xoa: ");
                new Scanner(System.in).nextLine();
                tim = new Scanner(System.in).nextLine();
                System.out.println("Hang hoa can dang xuat khoi trai dat (@_@) "); // Câu đùa "Đăng xuất khỏi trái đất" ý nói là làm một người hoặc một vật thể biến mất ý là xóa bỏ sự tồn tại trên Trái Đất (@w@)
                dSHangHoa.xoaHangHoa(dSHangHoa.timHangHoaTheoMa(tim));
                System.out.println("Danh sach hang hoa sau khi bi dang xuat");

                dSHangHoa.inDSHangHoa();
                    break;
                case 3:
                dSHangHoa.TimHangHoaTheoViTri(SanhSu1);
                dSHangHoa.suaHangHoa(4,SanhSu1);
                    break;
                case 4:
                dSHangHoa.them(ThucPham1);
                dSHangHoa.them(ThucPham2);
                dSHangHoa.them(ThucPham3);
                dSHangHoa.them(ThucPham4);
                dSHangHoa.them(SanhSu1);
                dSHangHoa.them(SanhSu2);
                dSHangHoa.them(SanhSu3);
                dSHangHoa.them(DienMay1);
                dSHangHoa.them(DienMay2);
                dSHangHoa.them(DienMay3);
                dSHangHoa.inDSHangHoa();
                    break;
                case 5:
                System.out.println("Dien ma hang hoa dang can tim kiem : ");
                    new Scanner(System.in).nextLine();
                    tim = new Scanner(System.in).nextLine();
                    dSHangHoa.timHangHoaTheoMa(tim);
                    break;
            }
        } while (chon != 0);
    }
    
}
