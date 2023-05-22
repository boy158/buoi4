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
class DiemHocVien {
    private String hoTen;
    private int namSinh;
    private List<Double> diemMonHoc;

    public DiemHocVien(String hoTen, int namSinh, List<Double> diemMonHoc) {
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.diemMonHoc = diemMonHoc;
    }

    public String getHoTen() {
        return hoTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public List<Double> getDiemMonHoc() {
        return diemMonHoc;
    }

    public boolean coLamLuanVanTotNghiep() {
        double diemTrungBinh = tinhDiemTrungBinh();
        if (diemTrungBinh > 7) {
            for (double diem : diemMonHoc) {
                if (diem < 5) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public boolean coThiTotNghiep() {
        double diemTrungBinh = tinhDiemTrungBinh();
        if (diemTrungBinh <= 7) {
            for (double diem : diemMonHoc) {
                if (diem < 5) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public boolean coThiLai() {
        for (double diem : diemMonHoc) {
            if (diem < 5) {
                return true;
            }
        }
        return false;
    }

    public List<String> getMonThiLai() {
        List<String> monThiLai = new ArrayList<>();
        String[] monHoc = {"Toan", "Ly", "Hoa", "Sinh", "Van"};
        for (int i = 0; i < diemMonHoc.size(); i++) {
            if (diemMonHoc.get(i) < 5) {
                monThiLai.add(monHoc[i]);
            }
        }
        return monThiLai;
    }

    public double tinhDiemTrungBinh() {
        double tongDiem = 0;
        for (double diem : diemMonHoc) {
            tongDiem += diem;
        }
        return tongDiem / diemMonHoc.size();
    }
}

