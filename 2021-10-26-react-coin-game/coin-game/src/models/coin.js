class Coin {
  constructor() {
    this.top = parseInt(Math.random() * window.innerHeight);
    this.left = parseInt(Math.random() * window.innerWidth);
    this.avail = true;
  }
}

export {Coin};
