class SqueakyClean {
    static String clean(String identifier) {
        StringBuilder output = new StringBuilder();
        boolean nextUpper = false;
        for (int i = 0; i < identifier.length(); i++) {
            char c = identifier.charAt(i);
            if (Character.isWhitespace(c)) {
                output.append('_');
            } else if (c == '-') {
                nextUpper = true;
            } else if (Character.isDigit(c)) {
                switch (c) {
                    case '0' -> output.append('o');
                    case '1' -> output.append('l');
                    case '3' -> output.append('e');
                    case '4' -> output.append('a');
                    case '7' -> output.append('t');
                    default -> {
                    }
                }
            } else if (Character.isLetter(c)) {
                if (nextUpper) {
                    output.append(Character.toUpperCase(c));
                    nextUpper = false;
                } else {
                    output.append(c);
                }
            }
        }
        return output.toString();
    }
}
