public class findindex {
    public static void main(String[] args) {
        int[] numbers = { 2, 4, 6, 8, 10 };
        int targetElement = 6;
        int indexOfElement = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == targetElement) {
                indexOfElement = i;
                break;
            }
        }
        if (indexOfElement != -1) {
            System.out.println("The element " + targetElement + " is found at index " + indexOfElement);
        } else {
            System.out.println("The element " + targetElement + " is not found in the array.");
        }
    }
}





