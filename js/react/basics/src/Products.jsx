import React, { use, useEffect } from 'react'

export default function Products() {
    function fetchProducts() {
        console.log("Fetching products...");
        setTimeout(() => {
            console.log("Products fetched!");
        }, 2000);
    }
    useEffect(() => {
        fetchProducts();
    }, []);

    const [products, setProducts] = React.useState([]);

    return (
        <>
            <ul>
                <li>Product 1</li>
                <li>Product 2</li>
                <li>Product 3</li>
            </ul>
            <button onClick={()=>{setProducts([])}}>Fetch Products</button>
        </>
    )
}
