const order = (() => {
    let items = [];
    return (item) => {
        items.push(item);
        return items;
    }
})()

let table23 = order("Mutton Soup");
table23 = order("Chicken Tandoori");
table23 = order("Roti");
table23 = order("Fish Curry");
table23 = order("Gulab Jamun");

console.log(table23);
