var employee = {
    name : "Sharan",
    designation : "React Developer",
    salary : "90000",
    onsite : true,
    hike : undefined
}

for(key in employee){
    console.log(key, ":", employee[key]);
}