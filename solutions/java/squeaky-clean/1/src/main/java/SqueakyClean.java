public class SqueakyClean {
    public static String clean(String identifier) {
        // Step 1: Replace spaces with underscores
        identifier = identifier.replace(' ', '_');
        
        // Step 2: Convert kebab-case (my-variable) → camelCase (myVariable)
        StringBuilder result = new StringBuilder();
        boolean toUpperCase = false;
        for (char ch : identifier.toCharArray()) {
            if (ch == '-') {
                // The next character should be uppercase
                toUpperCase = true;
            } else {
                if (toUpperCase) {
                    result.append(Character.toUpperCase(ch));
                    toUpperCase = false;
                } else {
                    result.append(ch);
                }
            }
        }
        
        // Step 3: Convert leetspeak numbers → normal letters
        String converted = result.toString()
            .replace('4', 'a')
            .replace('3', 'e')
            .replace('0', 'o')
            .replace('1', 'l')
            .replace('7', 't');
        
        // Step 4: Omit any characters that are not letters or underscores
        StringBuilder finalResult = new StringBuilder();
        for (char ch : converted.toCharArray()) {
            if (Character.isLetter(ch) || ch == '_') {
                finalResult.append(ch);
            }
        }
        
        // Return the fully cleaned name
        return finalResult.toString();
    }
}






