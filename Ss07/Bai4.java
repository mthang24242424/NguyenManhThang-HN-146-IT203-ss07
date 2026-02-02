package Ss07;

class ClassRoom {
    private String tenSinhVien;
    public static double classFund = 0;

    public ClassRoom(String tenSinhVien) {
        this.tenSinhVien = tenSinhVien;
    }

    public void dongTien(double soTien) {
        classFund += soTien;
        System.out.println(tenSinhVien + " dong " + soTien);
    }

    public static void xemQuyLop() {
        System.out.println("Tong quy lop: " + classFund);
    }
}

public class Bai4 {
    public static void main(String[] args) {
        ClassRoom sv1 = new ClassRoom("An");
        ClassRoom sv2 = new ClassRoom("Binh");
        ClassRoom sv3 = new ClassRoom("Cuong");

        sv1.dongTien(100000);
        sv2.dongTien(150000);
        sv3.dongTien(200000);

        ClassRoom.xemQuyLop();
    }
}
