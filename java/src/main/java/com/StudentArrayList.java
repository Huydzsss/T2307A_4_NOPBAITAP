package com;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentArrayList {

    class Students {
        int id;
        String ten;
        int tuoi;
        double diem;

        public Students(int id, String ten, int tuoi, double diem) {
            this.id = id;
            this.ten = ten;
            this.tuoi = tuoi;
            this.diem = diem;
        }

        @Override
        public String toString() {
            return "Id: " + id + ", Tên: " + ten + ", Tuổi: " + tuoi + ", Điểm: " + diem;
        }
    }

    public class QuanLySinhVien {
        ArrayList<Students> danhSach = new ArrayList<>();

        public void themSinhVien(Students sv) {
            danhSach.add(sv);
        }

        public void hienThiDanhSach() {
            if (danhSach.isEmpty()) {
                System.out.println("Danh sách sinh viên trống.");
            } else {
                for (Students sv : danhSach) {
                    System.out.println(sv);
                }
            }
        }

        public void xoaSinhVien(int id) {
            boolean found = false;
            for (Students sv : danhSach) {
                if (sv.id == id) {
                    danhSach.remove(sv);
                    System.out.println("Đã xóa sinh viên có Id: " + id);
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("Không tìm thấy sinh viên có Id: " + id);
            }
        }
    }
    public class SuaSv {
        QuanLySinhVien qlsv;

        public SuaSv(QuanLySinhVien qlsv) {
            this.qlsv = qlsv;
        }
        public void suaSinhVien(int id, String tenMoi, int tuoiMoi, double diemMoi) {
            for (Students sv : qlsv.danhSach) {
                if (sv.id == id) {
                    sv.ten = tenMoi;
                    sv.tuoi = tuoiMoi;
                    sv.diem = diemMoi;
                    System.out.println("Đã cập nhật sinh viên có Id: " + id);
                    return;
                }
            }
            System.out.println("Không tìm thấy sinh viên có Id: " + id);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentArrayList outer = new StudentArrayList();
        QuanLySinhVien qlsv = outer.new QuanLySinhVien();
        SuaSv suaSv = outer.new SuaSv(qlsv);

        boolean isRunning = true;

        while (isRunning) {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Thêm sinh viên");
            System.out.println("2. Sửa thông tin sinh viên");
            System.out.println("3. Xóa sinh viên");
            System.out.println("4. Hiển thị danh sách sinh viên");
            System.out.println("5. Thoát");
            System.out.print("Chọn hành động (1-5): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Nhập thông tin sinh viên:");
                    System.out.print("Id: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Tên: ");
                    String ten = scanner.nextLine();
                    System.out.print("Tuổi: ");
                    int tuoi = scanner.nextInt();
                    System.out.print("Điểm: ");
                    double diem = scanner.nextDouble();

                    Students sv = outer.new Students(id, ten, tuoi, diem);
                    qlsv.themSinhVien(sv);
                    break;

                case 2:
                    System.out.print("Nhập Id sinh viên cần sửa: ");
                    int idSua = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Tên mới: ");
                    String tenMoi = scanner.nextLine();
                    System.out.print("Tuổi mới: ");
                    int tuoiMoi = scanner.nextInt();
                    System.out.print("Điểm mới: ");
                    double diemMoi = scanner.nextDouble();

                    suaSv.suaSinhVien(idSua, tenMoi, tuoiMoi, diemMoi);
                    break;

                case 3:
                    System.out.print("Nhập Id sinh viên cần xóa: ");
                    int idXoa = scanner.nextInt();
                    qlsv.xoaSinhVien(idXoa);
                    break;

                case 4:
                    System.out.println("Danh sách sinh viên:");
                    qlsv.hienThiDanhSach();
                    break;

                case 5:
                    System.out.println("Thoát chương trình.");
                    isRunning = false;
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng thử lại.");
            }
        }

        scanner.close();
    }
}
