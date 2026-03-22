const personalData = {
    name: "Arjun",
    mobile: ""
}

const professionalData = {
    company: "LinuxLibrary",
    salary: 98789,
    designation: "React Developer",
    onsite: false
}

let data = { ...personalData, ...professionalData }
data = { ...data, mobile: "9876543210" }
data = { ...data, email: "arjun@gmail.com" }
console.log(data);