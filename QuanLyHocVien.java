/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADMIN
 */
class QuanLyHocVien {
    private List<DiemHocVien> danhSachHocVien;

    public QuanLyHocVien() {
        danhSachHocVien = new ArrayList<>();
    }

    public void themHocVien(DiemHocVien hocVien) {
        danhSachHocVien.add(hocVien);
    }

    public int demSoLuongLamLuanVanTotNghiep() {
        int count = 0;
        for (DiemHocVien hocVien : danhSachHocVien) {
            if (hocVien.coLamLuanVanTotNghiep()) {
                count++;
            }
        }
        return count;
    }

    public int demSoLuongThiTotNghiep() {
        int count = 0;
        for (DiemHocVien hocVien : danhSachHocVien) {
            if (hocVien.coThiTotNghiep()) {
                count++;
            }
        }
        return count;
    }

    public int demSoLuongThiLai() {
        int count = 0;
        for (DiemHocVien hocVien : danhSachHocVien) {
            if (hocVien.coThiLai()) {
                count++;
            }
        }
        return count;
    }

    public void xuatDanhSachThiLai() {
        System.out.println("Danh sach hoc vien phai thi lai:");
        for (DiemHocVien hocVien : danhSachHocVien) {
            if (hocVien.coThiLai()) {
                System.out.println("- " + hocVien.getHoTen() + ":");
                List<String> monThiLai = hocVien.getMonThiLai();
                for (String mon : monThiLai) {
                    System.out.println("  + " + mon);
                }
            }
        }
    }
}

