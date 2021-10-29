// var hey;

// console.log(hey);

function useState(value=undefined){

    this.value = value;
    
    this.setValue = function(updated){
        this.value = updated;
    }

    return [this.value, this.setValue];
}

let [value, setValue] = useState(10);

console.log(value);

setValue(20);

console.log(value);




