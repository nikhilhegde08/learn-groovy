// groovy program to demo basic calc with two inputs

def add(int firstNumber, int secondNumber){
    println("Addition Function")
    println("First Number -- "+ firstNumber)
    println("Second Number -- "+ secondNumber)
    return firstNumber + secondNumber
}

def subtract(int firstNumber, int secondNumber){
    println("Subtraction Function")
    println("First Number -- "+ firstNumber)
    println("Second Number -- "+ secondNumber)
    return firstNumber - secondNumber
}

def multiply(int firstNumber, int secondNumber){
    println("Multiply Function")
    println("First Number -- "+ firstNumber)
    println("Second Number -- "+ secondNumber)
    return firstNumber * secondNumber
}

def divide(int firstNumber, int secondNumber){
    println("Division Function")
    println("First Number -- "+ firstNumber)
    println("Second Number -- "+ secondNumber)
    if (secondNumber == 0){
        println("Division by zero error")
        return null
    }
    return firstNumber / secondNumber

}

def test_calc(){
    assert add(3, 4) == 7 :"Addition failed"
    assert subtract(7, 3) == 4 : "Subtraction failed"
    assert multiply(5, 6) == 30 : "Multiply failed"
    assert divide(10, 0) == null : "Division failed"
}

// run the calc
test_calc()