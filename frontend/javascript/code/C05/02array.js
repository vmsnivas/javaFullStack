var employees = ["Raju","Rahil","Sidhartha","Praveen","Sharan"];

for(var i = 0; i < employees.length; i++){
    console.log(employees[i])
}

console.log("");

for(emp of employees){
    console.log(emp)
}