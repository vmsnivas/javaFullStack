var num1 = 98;
var num2 = 2;
var operator = "";

switch(operator){
    case 'add':
        console.log("Sum : " , num1 + num2);
        break;
    case 'subtract':
        console.log("Difference : " , num1 - num2);
        break;
    case 'multiply':
        console.log("Product : " , num1 * num2);
        break;
    case 'divide':
        console.log("Quotient : " , num1 / num2);
        break;
    default:
        console.log("Invalid operation!");
}