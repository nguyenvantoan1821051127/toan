import java.util.Scanner;
public class Bai_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age, year;
        String name, ageGroup;
        Scanner scanner = new Scanner(System.in);
         
        System.out.println("Nhập vào tên: ");
        name = scanner.nextLine();
        System.out.println("Nhập vào năm sinh: ");
        year = scanner.nextInt();
         
        // Xác định độ tuổi tương ứng
        age = 2020 - year;  // 2020 là năm hiện tại
        if (age < 16) {
            ageGroup = "tuổi vị thành niên.";
        } else if (age >= 16 || age < 18) {
            ageGroup = "tuổi trưởng thành.";
        } else {
            ageGroup = "già rồi!";
        }
         
        System.out.println("Bạn " + name + " thuộc nhóm " + ageGroup);
	}

}
