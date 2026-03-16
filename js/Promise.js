let myPromise = new Promise((resolve, reject) => {
    let isSuccess = true;
    if (isSuccess) {
        resolve("Order Delivered");
    } else {
        reject("Order Cancelled.");
    }
})
myPromise.then(result=>{
    console.log(result);
})
.catch(error=>{    
    console.log(error);
})