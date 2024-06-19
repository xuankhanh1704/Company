import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QLCB  {
    static List<Canbo> Canbo = new ArrayList<>();

    public static  void addCongNhan() {
        while (true){
            Scanner sc = new  Scanner(System.in);
            CongNhan cn = new CongNhan();
            System.out.println("Enter id : ");
            cn.setId(sc.nextInt());
            System.out.println("Enter name : ");
            cn.setName(sc.next());
            sc.nextLine();
            System.out.println("Enter Age : ");
            cn.setAge(sc.nextInt());
            System.out.println("Enter gender : ");
            cn.setGender(sc.next());
            sc.nextLine();
            System.out.println("Enter Address : ");
            cn.setAddress(sc.nextLine());
            System.out.println("Enter level : ");
            cn.setLevel(sc.nextInt());

            Canbo.add(cn);
            System.out.println("Bạn có muốn thêm người ? y/n ");
            String answer = sc.next();
            sc.nextLine();
            if(answer.equals("n")){
                break;
            }
        }
    }
    public static void addKySu(){
        while (true){
            Scanner sc = new Scanner(System.in);
            KySu ks = new KySu();
            System.out.println("Enter id : ");
            ks.setId(sc.nextInt());
            System.out.println("Enter name : ");
            ks.setName(sc.next());
            sc.nextLine();
            System.out.println("Enter Age : ");
            ks.setAge(sc.nextInt());
            System.out.println("Enter gender : ");
            ks.setGender(sc.next());
            sc.nextLine();
            System.out.println("Enter Address : ");
            ks.setAddress(sc.nextLine());
            System.out.println("Enter major : ");
            ks.setMajor(sc.next());

            Canbo.add(ks);
            System.out.println("Bạn có muốn thêm người ? y/n ");
            String answer = sc.next();
            sc.nextLine();
            if(answer.equals("n")){
                break;
            }
        }
    }
    public static void addNhanVien(){
        while (true){
            Scanner sc = new Scanner(System.in);
            NhanVien nv = new NhanVien();
            System.out.println("Enter id : ");
            nv.setId(sc.nextInt());
            System.out.println("Enter name : ");
            nv.setName(sc.next());
            sc.nextLine();
            System.out.println("Enter Age : ");
            nv.setAge(sc.nextInt());
            System.out.println("Enter gender : ");
            nv.setGender(sc.next());
            sc.nextLine();
            System.out.println("Enter Address : ");
            nv.setAddress(sc.nextLine());
            System.out.println("Enter position : ");
            nv.setPosition(sc.next());
            Canbo.add(nv);
            System.out.println("Bạn có muốn thêm người ? y/n ");
            String answer = sc.next();
            sc.nextLine();
            if(answer.equals("n")){
                break;
            }
        }
    }
    public static void searchCanbo(){
        for(int i = 0;i < Canbo.size(); i++){
            Canbo canbo = Canbo.get(i);
            Scanner sc = new Scanner(System.in);
            System.out.println("Mời nhập id bạn cần tìm : ");
            int id = sc.nextInt();
            if(canbo.getId()== id ){
                System.out.println(canbo.toString());
            }
        }
    }
    public static void printCanbo() {
        int choice;
        do {
            System.out.println("1.In danh sách công nhân :");
            System.out.println("2.In danh sách kỹ sư  :");
            System.out.println("3.In danh sách nhân viên :");
            System.out.println("4.In toàn bộ danh sách nhân viên :");
            System.out.println("5.Thoát");
            System.out.println("Chọn mục :");
            Scanner sc = new Scanner(System.in);
            choice = sc.nextInt();
        } while (1 > choice || choice >5);
        switch (choice) {
            case 1:
                System.out.println("Danh sách công nhân : ");
                for (int i = 0 ; i < Canbo.size() ; i++) {
                    CongNhan a = null;
                    try {
                        a = (CongNhan) Canbo.get(i);
                    }catch (Exception e){
                    }
                    if(a!=null&&a.getLevel()>0){
                        System.out.println(Canbo.get(i).getId()+ " " +Canbo.get(i).getName()+ " " +Canbo.get(i).getAge()+ " " +Canbo.get(i).getGender()+ " " +Canbo.get(i).getAddress()+ " " +a.getLevel());
                    }
                }
                break;
            case 2:
                System.out.println("Danh sách kỹ sư : ");
                for (int i = 0 ; i < Canbo.size() ; i++) {
                    KySu a = null;
                    try {
                        a = (KySu) Canbo.get(i);
                    }catch (Exception e){
                    }
                    if(!a.equals("null")&&!a.getMajor().equals("null")){
                        System.out.println(Canbo.get(i).getId()+ " " + Canbo.get(i).getName()+ " " +Canbo.get(i).getAge()+ " " +Canbo.get(i).getGender()+ " " +Canbo.get(i).getAddress()+ " " +a.getMajor());
                    }
                }
                break;
            case 3:
                System.out.println("Danh sách nhân viên : ");
                for (int i = 0 ; i < Canbo.size() ; i++) {
                    NhanVien a = null;
                    try {
                        a = (NhanVien) Canbo.get(i);
                    }catch (Exception e){
                    }
                    if (!a.equals("null")&&!a.getPosition().equals("null")){
                        System.out.println(Canbo.get(i).getId()+ " " + Canbo.get(i).getName()+ " " +Canbo.get(i).getAge()+ " " +Canbo.get(i).getGender()+ " " +Canbo.get(i).getAddress()+ " " +a.getPosition());
                    }
                }
                break;
            case 4:
                System.out.println("Danh sách toàn bộ thành viên công ty  : ");
                for (int i = 0 ; i < Canbo.size() ; i++) {
                    Canbo cb = Canbo.get(i);
                    if(!cb.toString().equals("null")){
                        System.out.println(cb.toString());
                    }
                }
            case 5:
                break;
        }
    }
}
