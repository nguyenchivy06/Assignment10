package OOP_Nguoi;

import java.util.Scanner;

public class SinhVien extends Nguoi {
    private int maSinhVien;
    private String renLuyen;

    @Override
    public void nhapThongTin() {
        super.nhapThongTin();
        Scanner sc = new Scanner(System.in);
        System.out.print("Ma sinh vien: ");
        maSinhVien = Integer.parseInt(sc.nextLine());

        System.out.println("Danh gia ren luyen:");
        System.out.println("Chon 1-gioi, 2-kha, 3-trung binh, 4-yeu");
        int chon = Integer.parseInt(sc.nextLine());
        switch (chon) {
            case 1 -> renLuyen = "Gioi";
            case 2 -> renLuyen = "Kha";
            case 3 -> renLuyen = "Trung binh";
            case 4 -> renLuyen = "Yeu";
            default -> renLuyen = "Khong hop le";
        }
        System.out.println(renLuyen);
    }

    @Override
    public void xuatThongTin() {
        super.xuatThongTin();
        System.out.println(" , maSinhVien=" + maSinhVien + ", renLuyen=" + renLuyen);
    }
}
