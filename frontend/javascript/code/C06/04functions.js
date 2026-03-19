function greet(){
    console.log('Welcome to Functions in JavaScript');
}

const a = function (){
    console.log('Welcome to Anonymus functions!');
}

const arrow = () => {
    console.log('Welcome to Arrow functions');
}

greet();
a();
arrow();

//IIFE

(()=>{
    console.log('This is executed immediately.');
})()