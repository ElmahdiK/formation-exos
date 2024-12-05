const describeProduct = ({ name, price, category = "General", discount = 0 }) => {
    let finalPrice = (price - ((price * discount) / 100));
    return `Product: ${name}\nCategory: ${category}\nOriginal Price: ${price}€\nDiscount: ${discount}%\nFinal Price: ${finalPrice}€`;
}

console.log(describeProduct({ name: "citroën", price: 5000, category: "voiture", discount: 10 }));

let salut = 5;