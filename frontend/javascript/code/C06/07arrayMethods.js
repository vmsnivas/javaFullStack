var employees = ["Raju","Rahil","Sidhartha","Praveen","Sharan"];

console.log(employees);
employees.pop()
console.log(employees);
employees.push("Rajesh")
console.log(employees);
employees.shift()
console.log(employees);
employees.unshift("Sowmya")
console.log(employees);
employees.splice(2,1)
console.log(employees);
employees.splice(2,1,"Suresh")
console.log(employees);
employees.splice(2,1,"Suresh","Mahesh")
console.log(employees);
console.log(employees.sort());
console.log(employees.sort().reverse());
