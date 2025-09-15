package OOP_Nguoi;

import java.util.ArrayList;

public class DanhSachNguoi {
    ArrayList<Nguoi> danhSach = new ArrayList<>();

    public void themDanhSach(Nguoi n) {
        n.nhapThongTin();
        danhSach.add(n);
        System.out.println("Them thanh cong");
    }

    public void xuatDanhSach() {
        if (danhSach.isEmpty()) {
            System.out.println("Danh sach rong");
        } else {
            System.out.println("\n-Danh sach tat ca moi nguoi:");
            for (Nguoi n : danhSach) {
                n.xuatThongTin();
            }
        }
    }
}
