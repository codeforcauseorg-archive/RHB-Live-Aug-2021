import logo from "./logo.svg";
import "./App.css";
import { useState } from "react";

function App() {
  let [counter, setCounter] = useState(0);

  let inc = function () {
    setCounter(counter + 1);
  };

  return (
    <div className="App">
      <h1> Counter is {counter} </h1>
      <h1> Counter is {counter} </h1>
      <h1> Counter is {counter} </h1>
      <h1> Counter is {counter} </h1>
      <h1> Counter is {counter} </h1>
      <h1> Counter is {counter} </h1>
      <h1> Counter is {counter} </h1>
      <button onClick={inc}>+</button>
    </div>
  );
}

export default App;
