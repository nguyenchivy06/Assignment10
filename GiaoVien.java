package OOP_Nguoi;

import java.util.Scanner;

public class GiaoVien extends Nguoi {
    private int maGiaoVien;
    private String xepLoaiThiDua;

    @Override
    public void nhapThongTin() {
        super.nhapThongTin();
        Scanner sc = new Scanner(System.in);
        System.out.print("Ma giao vien: ");
        maGiaoVien = Integer.parseInt(sc.nextLine());

        System.out.println("Chon xep loai thi dua:");
        System.out.println("1-loai A, 2-loai B, 3-loai C");
        int chon = Integer.parseInt(sc.nextLine());
        switch (chon) {
            case 1 -> xepLoaiThiDua = "Loai A";
            case 2 -> xepLoaiThiDua = "Loai B";
            case 3 -> xepLoaiThiDua = "Loai C";
            default -> xepLoaiThiDua = "Khong hop le";
        }
        System.out.println("Thi dua " + xepLoaiThiDua);
    }

    @Override
    public void xuatThongTin() {
        super.xuatThongTin();
        System.out.println(" , maGiaoVien=" + maGiaoVien + ", xepLoaiThiDua=" + xepLoaiThiDua);
    }
}
