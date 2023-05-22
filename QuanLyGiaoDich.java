
package Bai1;

import java.util.ArrayList;
import java.util.List;


public class QuanLyGiaoDich {
    private List<GiaoDich> danhSachGiaoDich;

    public QuanLyGiaoDich() {
        danhSachGiaoDich = new ArrayList<>();
    }

    public void themGiaoDich(GiaoDich giaoDich) {
        danhSachGiaoDich.add(giaoDich);
    }

    public void xuatDanhSachGiaoDich() {
        for (GiaoDich giaoDich : danhSachGiaoDich) {
            System.out.println("Ma giao dich: " + giaoDich.maGd);
            System.out.println("Ngay giao dich: " + giaoDich.ngayGd);
            System.out.println("Thanh tien: " + giaoDich.tinhThanhTien());
            System.out.println("=================================");
        }
    }

    public int demSoLuongGiaoDichDat() {
        int count = 0;
        for (GiaoDich giaoDich : danhSachGiaoDich) {
            if (giaoDich instanceof GiaoDichDat) {
                count++;
            }
        }
        return count;
    }

    public int demSoLuongGiaoDichNha() {
        int count = 0;
        for (GiaoDich giaoDich : danhSachGiaoDich) {
            if (giaoDich instanceof GiaoDichNha) {
                count++;
            }
        }
        return count;
    }

    public double tinhTrungBinhThanhTienGiaoDichDat() {
        double sum = 0;
        int count = 0;
        for (GiaoDich giaoDich : danhSachGiaoDich) {
            if (giaoDich instanceof GiaoDichDat) {
                sum += giaoDich.tinhThanhTien();
                count++;
            }
        }
        return sum / count;
    }

    public void xuatGiaoDichThang9Nam2013() {
        for (GiaoDich giaoDich : danhSachGiaoDich) {
            if (giaoDich.ngayGd.contains("05/2013")) {
                System.out.println("Ma giao dich: " + giaoDich.maGd);
                System.out.println("Ngay giao dich: " + giaoDich.ngayGd);
                System.out.println("Thanh tien: " + giaoDich.tinhThanhTien());
                System.out.println("=================================");
            }
        }
    }

 public static void main(String[] args) {
        QuanLyGiaoDich qlgd = new QuanLyGiaoDich();

        GiaoDichDat gdDat1 = new GiaoDichDat("01", "19/05/2013", 100, 200, "A");
        GiaoDichDat gdDat2 = new GiaoDichDat("02", "20/05/2013", 150, 300, "B");
        GiaoDichNha gdNha1 = new GiaoDichNha("03", "21/05/2013", 200, 150, "cao cấp", "123 Le van si");
        GiaoDichNha gdNha2 = new GiaoDichNha("04", "22/05/2013", 180, 200, "thường", "456 an lac");

        qlgd.themGiaoDich(gdDat1);
        qlgd.themGiaoDich(gdDat2);
        qlgd.themGiaoDich(gdNha1);
        qlgd.themGiaoDich(gdNha2);

        qlgd.xuatDanhSachGiaoDich();

        int soLuongGiaoDichDat = qlgd.demSoLuongGiaoDichDat();
        int soLuongGiaoDichNha = qlgd.demSoLuongGiaoDichNha();
        double trungBinhThanhTienGiaoDichDat = qlgd.tinhTrungBinhThanhTienGiaoDichDat();

        System.out.println("So luong giao dich dat: " + soLuongGiaoDichDat);
        System.out.println("So luong giao dich nha: " + soLuongGiaoDichNha);
        System.out.println("Trung binh thanh tien giao dich dat: " + trungBinhThanhTienGiaoDichDat);

        System.out.println("Cac giao dich thang 9 nam 2013:");
        qlgd.xuatGiaoDichThang9Nam2013();
    }
}