/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage2;

import java.util.List;

/**
 *
 * @author ADMIN
 */
public class Main {
    public static void main(String[] args) {
        DiemHocVien hocVien1 = new DiemHocVien("Nguyen Van Binh", 2000, List.of(7.5, 6.8, 8.2, 7.1, 6.5));
        DiemHocVien hocVien2 = new DiemHocVien("Tran Thi Binh", 2001, List.of(6.9, 5.2, 6.7, 5.9, 4.8));
        DiemHocVien hocVien3 = new DiemHocVien("Le Van Ci", 2002, List.of(8.6, 9.1, 8.9, 8.7, 9.3));
        DiemHocVien hocVien4 = new DiemHocVien("Pham Thi chong", 2003, List.of(5.4, 6.3, 4.9, 6.2, 7.0));

        QuanLyHocVien qlhv = new QuanLyHocVien();
        qlhv.themHocVien(hocVien1);
        qlhv.themHocVien(hocVien2);
        qlhv.themHocVien(hocVien3);
        qlhv.themHocVien(hocVien4);

        int soLuongLamLuanVanTotNghiep = qlhv.demSoLuongLamLuanVanTotNghiep();
        System.out.println("So nguoi lam luan van tot nghiep: " + soLuongLamLuanVanTotNghiep);

        int soLuongThiTotNghiep = qlhv.demSoLuongThiTotNghiep();
        System.out.println("So nguoi thi tot nghiep: " + soLuongThiTotNghiep);

        int soLuongThiLai = qlhv.demSoLuongThiLai();
        System.out.println("So nguoi phai thi lai: " + soLuongThiLai);

        qlhv.xuatDanhSachThiLai();
    }
}
