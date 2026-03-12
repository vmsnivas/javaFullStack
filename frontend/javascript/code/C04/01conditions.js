var cibil = 718;
var salary = 85986;

if (cibil >= 800 && salary >= 60000){
    console.log("Congratulations! You are eligible for loan of 20 Lakhs.");
}
else if (cibil >= 780 && salary >= 50000){
    console.log("Congratulations! You are eligible for loan of 15 Lakhs.");
}
else if (cibil >= 750 && salary >= 40000){
    console.log("Congratulations! You are eligible for loan of 10 Lakhs.");
}
else if (cibil >= 720 && salary >= 30000){
    console.log("Congratulations! You are eligible for loan of 5 Lakhs.");
}
else if (cibil >= 700 || salary >= 60000){
    console.log("Congratulations! You are eligible for loan of 2 Lakhs with interest of 36%.");
}
else {
    console.log("Better Luck Next Time !!");
}