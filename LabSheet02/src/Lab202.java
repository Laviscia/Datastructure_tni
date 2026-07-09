import java.util.ArrayList;
import java.util.Scanner;

public class Lab202 {
    public static void main(String[] args) {
        Scanner sa = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        int[] initial_numbers = {10, 11, 12, 13, 14, 15, 16, 17, 18, 19};

        //นำตัวเลขทั้งหมดในอาร์เรย์ initial_numbers เก็บไว้ใน ArrayList numbers
        for (int value : initial_numbers) {
            numbers.add(value);
        }
        System.out.println("หลังจากคัดลอกข้อมูลจาก initial_numbers: " + numbers);

        // รับรหัสนักศึกษา เพื่อใช้คำนวณตำแหน่งต่าง ๆ
        System.out.print("กรอกรหัสนักศึกษา: ");
        String studentId = sa.next();

        int len = studentId.length();
        int lastDigit = Character.getNumericValue(studentId.charAt(len - 1));
        int secondLastDigit = Character.getNumericValue(studentId.charAt(len - 2)); 
        int thirdLastDigit = Character.getNumericValue(studentId.charAt(len - 3));  

        // รับค่าตัวเลขที่ต้องการเพิ่มเข้า numbers เพิ่มต่อท้ายข้อมูลตัวสุดท้ายใน numbers
        System.out.print("กรอกตัวเลขที่ต้องการเพิ่มต่อท้าย : ");
        int addValue1 = sa.nextInt();
        numbers.add(addValue1); 
        System.out.println("หลังเพิ่มต่อท้าย: " + numbers);

        //บค่าตัวเลขที่ต้องการเพิ่มเข้า numbers  แทรกที่ตำแหน่งตามเลขสุดท้ายของรหัสนักศึกษา
        System.out.print("กรอกตัวเลขที่ต้องการแทรกเข้า: ");
        int addValue2 = sa.nextInt();
        int insertPos = lastDigit;
        if (insertPos > numbers.size()) insertPos = numbers.size();
        numbers.add(insertPos, addValue2);
        System.out.println("หลังแทรกที่ตำแหน่ง " + insertPos + " เลขสุดท้ายรหัสนักศึกษา = " + lastDigit + ": " + numbers);

        //ลบข้อมูลใน numbers ที่ตำแหน่งตามเลขรองสุดท้ายของรหัสนักศึกษา
        int deletePos = secondLastDigit;
        if (deletePos >= numbers.size()) deletePos = numbers.size() - 1;
        int removedValue = numbers.remove(deletePos);
        System.out.println("ลบตัวเลข " + removedValue + " ที่ตำแหน่ง " + deletePos + " เลขรองสุดท้ายรหัสนักศึกษา = " + secondLastDigit + ": " + numbers);

        //อัปเดตตัวเลขใน numbers ที่ตำแหน่งตามเลขก่อนรองสุดท้ายของรหัสนักศึกษา เป็นวันที่ ณ วันที่เรียน
        int classDate = 7; 
        int updatePos = thirdLastDigit;
        if (updatePos >= numbers.size()) updatePos = numbers.size() - 1;
        numbers.set(updatePos, classDate);
        System.out.println("อัปเดตตำแหน่งเลขก่อนรองสุดท้ายรหัสนักศึกษา ป็น " + classDate + ": " + numbers);

        //แสดงผลสุดท้าย
        System.out.println("\nข้อมูลสุดท้ายใน ArrayList numbers");
        System.out.println(numbers);

        sa.close();
    }
}