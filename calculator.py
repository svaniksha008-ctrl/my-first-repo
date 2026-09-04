def add(num1, num2):
    """Add two numbers"""
    return num1 + num2

def subtract(num1, num2):
    """Subtract two numbers"""
    return num1 - num2

def multiply(num1, num2):
    """Multiply two numbers"""
    return num1 * num2

def divide(num1, num2):
    """Divide two numbers"""
    if num2 == 0:
        print("Error: Cannot divide by zero!")
        return None
    return num1 / num2

def main():
    """Main function to run the calculator"""
    print("=== Simple Calculator ===")
    print("Operations: + (add), - (subtract), * (multiply), / (divide)")
    print()
    
    while True:
        try:
            # Get user input
            num1 = float(input("Enter first number: "))
            operation = input("Enter operation (+, -, *, /): ")
            num2 = float(input("Enter second number: "))
            
            # Perform calculation
            if operation == '+':
                result = add(num1, num2)
                print(f"Result: {num1} + {num2} = {result}")
            
            elif operation == '-':
                result = subtract(num1, num2)
                print(f"Result: {num1} - {num2} = {result}")
            
            elif operation == '*':
                result = multiply(num1, num2)
                print(f"Result: {num1} * {num2} = {result}")
            
            elif operation == '/':
                result = divide(num1, num2)
                if result is not None:
                    print(f"Result: {num1} / {num2} = {result}")
            
            else:
                print("Invalid operation! Please use +, -, *, or /")
            
            # Ask if user wants to continue
            response = input("\nContinue calculating? (yes/no): ").lower()
            if response in ['no', 'n']:
                break
            print()
        
        except ValueError:
            print("Invalid input! Please enter valid numbers.")
            print()
    
    print("Thank you for using the calculator!")

if __name__ == "__main__":
    main()
