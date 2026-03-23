const employees = ["Arjun","Mallik","Nivas"];

try{
    employee.splice(2,0, "Shri");
}
catch(err){
    console.log(err.name, ' : ', err.message);
}
finally{
    console.log(employees);
    console.log('Task Completed!');
}