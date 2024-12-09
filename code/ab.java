public class ab {
    public static void main(String[] args) {
        char value = 1;
        int a = 2;
        switch (value) {
            case 1: // This is allowed
                break;
            case 1 + 2: // This is allowed
                break;
            case 2 * 2: // This is allowed
                break;
            case 7 - 2: // This is allowed
                break;
            case 6 / 3: // This is allowed
                break;
            case a + 1:  // This is not allowed 
            // we can not use variable in case for arithmetic operation
                break;
            default:
                // This case will run if no value match with any case
        }

    }

}
