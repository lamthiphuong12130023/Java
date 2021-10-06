package Day1;

public class Day1HW1 {
        public static void main(String [] args) {
            Tinh(3.5);
        }
        public static void Tinh(double mark) {

                if (mark >= 0 && mark < 3.5) {
                    System.out.println("Loại kém");
                } else if (mark >= 3.5 && mark < 5.0) {
                    System.out.println("Loại Yếu");
                } else if (mark >= 5.0 && mark < 6.5) {
                    System.out.println("Loại Trung Bình");
                } else if (mark >= 6.5 && mark < 8.0) {
                    System.out.println("Loại Khá");
                } else if (mark >= 8.0 && mark < 10) {
                    System.out.println("Loại Giỏi");
                }
            }
    }

