const data = {
  name: 'Arjun',
  mobile: '9876543210',
  company: 'LinuxLibrary',
  salary: 98789,
  designation: 'React Developer',
  onsite: false,
  email: 'arjun@gmail.com'
}

const name = data.name;
const designation = data.designation;

console.log(name, designation)

const { company, email } = data;

console.log(company, email)

const { salary, mobile, ...displayData }  = data;

console.log(displayData);