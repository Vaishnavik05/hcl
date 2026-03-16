// const a=10
// a=20

//? variables
// for(var i=0;i<10;i++){
//     console.log("Hello world")
// }
// console.log(i)

//? Hello world
// for(let i=0;i<10;i++){
//     console.log("Hello world")
// }
// console.log(i)

//? Increment
// let num1=5
// let num2=num1++
// console.log(num2)

// let num1=5
// let num2=++num1
// console.log(num2)

// let num1=5
// let num2=num1++
// console.log(num2, num1)

// let num=5
// console.log(typeof (num))

//? Greet
// person={
//     name:"John",
//     age:30,
//     greet: function() {
//         console.log(`${this.name} says Hello!`);
//     }
// }
// person.greet()

//? if else
// var ans = "yes";
// if (ans === "yes") {
//   console.log("Great Job");
// } else if (ans === "no") {
//   console.log("Finish homework before playing");
// }

//? Arrow fn
// const add=(a,b)=>a+b;

// const add=(a,b)=>{
//     return a+b;
// }

//? Power
// const Power = (base, power) => base**power;
// console.log(Power(2, 3));

//? arrow fn
// let nums=[1,2,3,4,5]
// nums=nums.map(num=>num*2)
// console.log(nums)

//? Destructuring array
// nums=[10,20,30,40]
// const [a, ,b]=nums
// console.log(a,b)

//? Swap values by destructuring
// let x=5;
// let y=10;
// [x,y]=[y,x]
// console.log(x,y)

//? object destructuring
// let person={
//     name:"Alice",
//     age:25,
//     city:"New York"
// }

// let {name, age, city}=person
// console.log(name, age, city)

// let {name:username, age:years}=person
// console.log(username, years)

// let{country='India'}=person
// console.log(country)

//? Spread with arrays
// let arr1=[1,2,3]
// let arr2=[4,5]
// let combined=[...arr1,...arr2]
// console.log(combined)

//? copy array using spread
// nums=[10,20,30]
// copy=[...nums]
// copy.push(40)
// console.log(nums)

//? Spread with objects
// let person={name:"Pattu", age:21};
// let details={...person, city:"Delhi"};
// console.log(details)

//? Spread in fn call
// let nums=[2,4,6];
// function sum(a,b,c){
//     return a+b+c;
// }
// console.log(sum(...nums));

//? Rest operators
// function add(...nums){
//     sum=0
//     for(let i=0;i<nums.length;i++){
//         sum+=nums[i]
//     }
//     return sum
// }
// console.log(add(1,2,3,4,5))

//? rest in destructuring array
// let nums=[10,20,30,40,50]
// const [first, second, ...rest]=nums
// console.log(first, second, rest)

//? rest in destructuring object
// let person={
//     name:"Alice",
//     age:25,
//     city:"New York"
// }
// let {name, ...details}=person
// console.log(name, details)

