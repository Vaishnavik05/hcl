class AgeInvalidException extends java.lang.Exception {
    public AgeInvalidException(String message) {
        super(message);
    }
}
public class CustomException {
    static void validateAge(int age) throws AgeInvalidException {
        if (age < 18) {
            throw new AgeInvalidException("Age " + age + " is not allowed. Must be 18 or above.");
        }
        System.out.println("Age " + age + " is valid. Access granted!");
    }

    public static void main(String[] args) {
        int[] ages = {25, 15, 18};
        for (int age : ages) {
            try {
                validateAge(age);
            } catch (AgeInvalidException e) {
                System.out.println("Custom Exception: " + e.getMessage());
            }
        }
    }
}