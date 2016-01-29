public class DrawAsterisk {

    public void oneAsterisk() {
        System.out.println("*");
    }

    public void horizontalLine(int size) {
        drawAsterisk(size);
    }

    public void verticalLine(int line) {
        while (line-- != 0){
            drawAsterisk(1);
        }
    }

    public void normalTriangle(int line) {
        for (int i = 0; i < line; i++){
            drawAsterisk(i + 1);
        }
    }

    public void isoscelesTriangle(int line) {
        for (int i = 0; i < line; i++) {
            drawOneLine(line - i - 1, 2 * i + 1);
        }
    }

    public void diamond(int midleLine) {
        isoscelesTriangle(midleLine);

        int secondHight = midleLine - 1;

        for (int i = secondHight - 1; i >= 0; i--) {
            drawOneLine(midleLine - i - 1, 2 * i + 1);
        }
    }

    public void diamondWithName(int middleLine) {
        int secondMidleLine = middleLine - 1;
        for (int i = 0; i < secondMidleLine; i++) {
            drawOneLine(middleLine - i - 1, 2 * i + 1);
        }

        int secondHight = middleLine - 1;

        System.out.println("Sli");

        for (int i = secondHight - 1; i >= 0; i--) {
            drawSpace(middleLine - i - 1);
            drawAsterisk(2 * i + 1);
        }

    }

    public void drawOneLine(int spaceNumber, int asteriskNumber) {
        DrawAsterisk.drawSpace(spaceNumber);
        DrawAsterisk.drawAsterisk(asteriskNumber);
    }

    private static void drawAsterisk(int asteriskNumber) {
        while (asteriskNumber-- > 0) {
            System.out.print("*");
        }
        System.out.println();
    }

    private static void drawSpace(int spaceNumber) {
        while (spaceNumber-- > 0) {
            System.out.print(" ");
        }
    }
}
