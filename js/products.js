function getProducts(){
    return new Promise((resolve, reject) => {
        setTimeout(() => {
            resolve([
                {title: "Laptop", price: 70000},
                {title: "Phone", price: 10000}
            ])
        }, 2000);
    })
}
getProducts().then(products => {
    console.log(products);
})