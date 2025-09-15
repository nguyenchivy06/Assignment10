package OOP_Nguoi;

import java.util.Scanner;

public class Processor {
    public static void main(String[] args) {
        DanhSachNguoi danhSach = new DanhSachNguoi();
        Scanner sc = new Scanner(System.in);
        int tiepTuc;

        do {
            System.out.println("\nMenu:");
            System.out.println("0. Thoat chuong trinh");
            System.out.println("1. Nhap thong tin (Sinh Vien / Giao Vien)");
            System.out.println("2. Xuat danh sach");
            System.out.print("Chon chuc nang: ");
            int chon = Integer.parseInt(sc.nextLine());

            switch (chon) {
                case 1 -> {
                    System.out.println("\nThem moi mot nguoi vao danh sach");
                    System.out.println("Nhap ai? 1-Sinh vien, 2-Giao vien");
                    int loai = Integer.parseInt(sc.nextLine());
                    if (loai == 1) {
                        danhSach.themDanhSach(new SinhVien());
                    } else if (loai == 2) {
                        danhSach.themDanhSach(new GiaoVien());
                    } else {
                        System.out.println("Nhap sai");
                    }
                }
                case 2 -> danhSach.xuatDanhSach();
                case 0 -> {
                    return;
                }
                default -> System.out.println("Nhap sai");
            }

            System.out.print("Tiep tuc khong? 1-co, 0-khong\n");
            tiepTuc = Integer.parseInt(sc.nextLine());
        } while (tiepTuc != 0);
    }
}
