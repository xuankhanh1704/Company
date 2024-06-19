import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean aa = true;
        while (aa) {
            int choice;
//            do {
                System.out.println("1 . Thêm cán bộ ");
                System.out.println("2 . Tìm kiếm cán bộ");
                System.out.println("3 . Xuất danh sách cán bộ");
                System.out.println("4 . Thoát");
                System.out.println("Vui lòng nhập lựa chọn của bản ");
                Scanner sc = new Scanner(System.in);
                choice = validation.inputInt();
//            } while (choice > 1 || choice < 4);
            switch (choice){
                case 1:
                    System.out.println("Thêm cán bộ ");
                    int choose;
                    do {
                        System.out.println("1 . Nhập thông tin công nhân : ");
                        System.out.println("2 . Nhập thông tin kỹ sư ");
                        System.out.println("3 . Nhập thông tin nhân viên ");
                        System.out.println("4 . Thooát ");
//                        Scanner sc = new Scanner(System.in);
                        System.out.println("Bạn muốn nhập mục nào : ");
                        choose =validation.inputInt();;
                        switch (choose) {
                            case 1:
                                System.out.println("Nhập thông tin của công nhân : ");
                                QLCB canboo = new QLCB();
                                QLCB.addCongNhan();
                                break;
                            case 2:
                                System.out.println("Nhập thông tin của kỹ sư : ");
                                QLCB canboo2 = new QLCB();
                                QLCB.addKySu();
                                break;
                            case 3:
                                System.out.println("Nhập thông tin của nhân viên : ");
                                QLCB canbo3 = new QLCB();
                                QLCB.addNhanVien();
                                break;
                            case 4:
                                break;
                        }
                        break;
                    } while (choose>0||choose<4);
                case 2:
                    System.out.println("Tìm kiếm cán bộ ");
                    QLCB qlcb = new QLCB();
                    QLCB.searchCanbo();
                    break;
                case 3:
                    System.out.println("Danh sách cán bộ :");
                    QLCB qlcb2 = new QLCB();
                    QLCB.printCanbo();
                    break;
                case 4:
                    aa = false;
                    break;
                default:
                    System.out.println("a");
                    break;
            }
//            if (choice == 1) {
//
//            }
//            if (choice == 2) {
//
//            }
//            if (choice == 3) {
//
//            }
//            if (choice == 4) {
//
//            }
        }
    }
}