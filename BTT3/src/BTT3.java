import java.util.Scanner;

public class BTT3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap ma sach: ");
        String maSach = sc.nextLine();

        System.out.print("Nhap ten sach: ");
        String tenSach = sc.nextLine();

        System.out.print("Nhap tac gia: ");
        String tacGia = sc.nextLine();

        System.out.print("Nhap nam xuat ban: ");
        int namXuatBan = sc.nextInt();

        System.out.print("Nhap don gia: ");
        double donGia = sc.nextDouble();

        System.out.print("Nhap so luong: ");
        int soLuong = sc.nextInt();

        double thanhTien = donGia * soLuong;
        double phiVanChuyen = thanhTien * 0.05;
        double tongTien = thanhTien + phiVanChuyen;

        System.out.println("\nTHONG TIN SACH");
        System.out.println("Ma sach: " + maSach);
        System.out.println("Ten sach: " + tenSach);
        System.out.println("Tac gia: " + tacGia);
        System.out.println("Nam xuat ban: " + namXuatBan);
        System.out.println("Don gia: " + donGia);
        System.out.println("So luong: " + soLuong);

        System.out.println("\nKET QUA NHAP KHO");
        System.out.println("Thanh tien: " + thanhTien);
        System.out.println("Phi van chuyen: " + phiVanChuyen);
        System.out.println("Tong tien nhap: " + tongTien);

        if (donGia > 0 && soLuong > 0 && namXuatBan > 0 && namXuatBan < 2027)
        {
            System.out.println("Sach hop le");
        }
        else
        {
            System.out.println("Sach khong hop le");
        }

        if (donGia < 50000) {
            System.out.println("Sach gia thap");
        }
        else if (donGia <= 100000) {
            System.out.println("Sach gia trung binh");
        }
        else if (donGia <= 200000) {
            System.out.println("Sach gia cao");
        }
        else {
            System.out.println("Sach gia dac biet");
        }

        if (soLuong == 0) {
            System.out.println("Het sach");
        }
        else if (soLuong <= 5) {
            System.out.println("Sach sap het");
        }
        else if (soLuong <= 20) {
            System.out.println("Sach con it");
        }
        else {
            System.out.println("Sach con nhieu");
        }

        System.out.println("1. Sach giao khoa");
        System.out.println("2. Sach tham khao");
        System.out.println("3. Sach chuyen nganh");
        System.out.println("4. Sach khac");

        System.out.print("Chon loai sach: ");
        int loaiSach = sc.nextInt();

        switch (loaiSach) {
            case 1:
                System.out.println("Sach giao khoa");
                break;

            case 2:
                System.out.println("Sach tham khao");
                break;

            case 3:
                System.out.println("Sach chuyen nganh");
                break;

            case 4:
                System.out.println("Sach khac");
                break;

            default:
                System.out.println("Lua chon khong hop le");
        };

        sc.close();
    }

}
