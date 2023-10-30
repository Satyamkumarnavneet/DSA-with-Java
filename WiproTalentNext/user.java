package WiproTalentNext;

public class user {
    public class UserMainCode {
        public static String userIdGeneration(String firstName, String lastName, int pin, int n) {
            // Step 1 - Determine the smaller and longer names
            String smallerName;
            String longerName;
            if (firstName.length() == lastName.length()) {
                // If both names are of equal length, use alphabetical order to determine smaller and longer names
                if (firstName.compareTo(lastName) < 0) {
                    smallerName = firstName;
                    longerName = lastName;
                } else {
                    smallerName = lastName;
                    longerName = firstName;
                }
            } else if (firstName.length() < lastName.length()) {
                smallerName = firstName;
                longerName = lastName;
            } else {
                smallerName = lastName;
                longerName = firstName;
            }

            char firstLetterOfSmallerName = smallerName.charAt(0);
            char digitAtPositionNLeftToRight = getDigitAtPositionN(pin, n);
            char digitAtPositionNRightToLeft = getDigitAtPositionNReversed(pin, n);

            String userId = firstLetterOfSmallerName + longerName + digitAtPositionNLeftToRight + digitAtPositionNRightToLeft;

            // Step 3 - Toggle the alphabets in the user ID
            StringBuilder toggledUserId = new StringBuilder();
            for (char c : userId.toCharArray()) {
                if (Character.isUpperCase(c)) {
                    toggledUserId.append(Character.toLowerCase(c));
                } else {
                    toggledUserId.append(Character.toUpperCase(c));
                }
            }
            return toggledUserId.toString();
        }

        private static char getDigitAtPositionN(int number, int n) {
            String numberString = String.valueOf(number);
            if (n > 0 && n <= numberString.length()) {
                return numberString.charAt(n - 1);
            }
            return '0';
        }

        private static char getDigitAtPositionNReversed(int number, int n) {
            String numberString = String.valueOf(number);
            if (n > 0 && n <= numberString.length()) {
                return numberString.charAt(numberString.length() - n);
            }
            return '0'; // Return 0 if n is out of range
        }
    }
    public static void main(String[] args) {
//        String firstName = "Rajiv";
//        String lastName = "Roy";
//        int pin = 560037;
//        int n = 6;

        String firstName = "Manoj";
        String lastName = "Kumar";
        int pin = 561327;
        int n = 2;

        String userId = UserMainCode.userIdGeneration(firstName, lastName, pin, n);
        System.out.println(userId); // Output: "rrAJIV75"
    }


}
