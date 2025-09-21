//Design a class ‘ComplexNum’ to manipulate Complex numbers having data members as real and img. The class should have a parameterized constructor to initialize its data members. It should also have methods displayCompNumber() to display the complex number (in the format 5+3i for example), addCompNumber() to add two Complex numbers. Test these methods by creating main method in another class.
    class ComplexNum {
        int real;
        int img;

        public ComplexNum(int real, int img) {
            this.real = real;
            this.img = img;
        }

        public void displayCompNumber() {
            System.out.println(real + "+" + img + "i");
        }

        public void addCompNumber(ComplexNum c2) {
            real += c2.real;
            img += c2.img;
        }
    }
    public class ComplexNumTest {
        public static void main(String[] args) {
            ComplexNum c1 = new ComplexNum(5, 3);
            c1.displayCompNumber();
            ComplexNum c2 = new ComplexNum(2, 4);
            c1.addCompNumber(c2);
            c1.displayCompNumber();
        }
    }