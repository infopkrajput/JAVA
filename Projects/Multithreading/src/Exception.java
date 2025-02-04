public class Exception {
    public static void validateCustomer(String name) {
        if (name == null || name.isEmpty()) {
            throw new NullPointerException("Customer name cannot be null or empty");
        }
        System.out.println("Customer name is valid: " + name);
    }

    public static void main(String[] args) {
        try {
            validateCustomer("");
        } catch (NullPointerException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
