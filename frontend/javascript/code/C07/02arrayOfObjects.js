const employees = [
    {
        name: "Sireesha",
        designation: "React Developer",
        salary: 98765,
        onsite: true
    },
    {
        name: "Sanjay",
        designation: "Node Developer",
        salary: 87654,
        onsite: true
    },
    {
        name: "Praveen",
        designation: "React Developer",
        salary: 76543,
        onsite: false
    },
    {
        name: "Sam",
        designation: "React Developer",
        salary: 65432,
        onsite: true
    },
    {
        name: "Prem",
        designation: "Node Developer",
        salary: 54321,
        onsite: false
    },
]

employees.forEach((e) => {
    console.log(e.name)
})

const frontendDevs = employees.filter((e) => {
    return e.designation === "React Developer" && e.onsite
})

console.log(frontendDevs)

const backendDev = employees.find((e) => {
    return e.designation === "Node Developer" && e.onsite
})

console.log(backendDev)