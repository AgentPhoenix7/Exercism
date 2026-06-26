class CalculatorConundrum {
    public String calculate(int operand1, int operand2, String operation) {
        if (operation == null) {
            throw new IllegalArgumentException("Operation cannot be null");
        }
        if (operation.isEmpty()) {
            throw new IllegalArgumentException("Operation cannot be empty");
        }
        try {
            return switch (operation) {
                case "+" -> operand1 + " + " + operand2 + " = " + (operand1 + operand2);
                case "*" -> operand1 + " * " + operand2 + " = " + (operand1 * operand2);
                case "/" -> operand1 + " / " + operand2 + " = " + (operand1 / operand2);
                default -> throw new IllegalOperationException("Operation '" + operation + "' does not exist");
            };
        } catch (ArithmeticException e) {
            throw new IllegalOperationException("Division by zero is not allowed", e);
        }
    }
}
