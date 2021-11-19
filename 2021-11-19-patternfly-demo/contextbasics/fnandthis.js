let bello = () => {
    this.name = "Bello";
};

function hello() {
  bello();
  console.log(this);
}

hello();
console.log(this.name);
