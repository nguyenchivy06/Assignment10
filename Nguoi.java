package OOP_Nguoi;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Nguoi {
    protected String hoVaTen;
    protected Date ngaySinh;
    protected String gioiTinh;
    protected int cmnd;

    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ho va ten: ");
        hoVaTen = sc.nextLine();

        System.out.print("Ngay sinh(dd/MM/yyyy): ");
        String ns = sc.nextLine();
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            ngaySinh = sdf.parse(ns);
        } catch (Exception e) {
            ngaySinh = new Date();
        }

        System.out.print("Gioi tinh: ");
        gioiTinh = sc.nextLine();

        System.out.print("CMND: ");
        cmnd = Integer.parseInt(sc.nextLine());
    }

    public void xuatThongTin() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.print("hoVaTen=" + hoVaTen
                + ", ngaySinh=" + sdf.format(ngaySinh)
                + ", gioiTinh=" + gioiTinh
                + ", cmnd=" + cmnd);
    }
}
