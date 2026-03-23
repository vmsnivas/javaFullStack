try{
    const employee = "Arjun";
    employee.map((e) => {
        console.log(e); 
    })
}
catch(err){
    console.log(err.name, ' : ', err.message);
}
finally{
    console.log("Execution Completed!");
}
