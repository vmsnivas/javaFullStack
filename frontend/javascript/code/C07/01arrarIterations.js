const employees = ["Raju","Rahil","Sidhartha","Praveen","Sharan"];

const emails1 = employees.forEach((e, i) => {
    return e.toLowerCase() + i + '@elearn.com'
})

const emails2 = employees.map((e, i) => {
    return e.toLowerCase() + i + '@elearn.com'
})

console.log(emails1);
console.log(emails2);

const salaries = [98, 85, 41, 93, 95, 99, 23];
const highSalaries = salaries.filter((sal) => {
    return sal > 90;
})

console.log(highSalaries);

const salaries2 = [98, 85, 41, 93, 95, 99, 23];

const total = salaries2.reduce((prev, curr) => {
    return prev + curr;
}, 0)

console.log(total);
