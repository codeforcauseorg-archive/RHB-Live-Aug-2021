import logo from "./logo.svg";
import "./App.css";
import { useState } from "react";

function App() {
  let [prev, setPrev] = useState();
  let [answwer, setAnswer] = useState("");
  let [expression, setExpression] = useState("");

  let buttons = [
    "(",
    ")",
    "%",
    "CE",
    "7",
    "8",
    "9",
    "/",
    "4",
    "5",
    "6",
    "*",
    "1",
    "2",
    "3",
    "-",
    "0",
    ".",
    "=",
    "+",
  ];

  let isOp = function (action) {
    let ops = ["+", "-", "*", "/", "%"];
    return ops.includes(action);
  };

  return (
    <div className="App">
      <div className="calc">
        <div className="inputContainer">
          <h4>Ans = {answwer}</h4>
          <h2>{expression}</h2>
        </div>
        <div className="buttonContainer">
          {buttons.map(function (item, index) {
            return (
              <button
                className="buttonCalc"
                onClick={function () {
                  if (item === "CE") {
                    setExpression("");
                    setPrev(undefined);
                  } else if (item === "=") {
                    setAnswer(String(eval(expression)));
                    setExpression("");
                    setPrev(undefined);
                  } else {
                    if (!expression && isOp(item)) {
                      setExpression(answwer + item);
                    } else if (isOp(prev) && isOp(item)) {
                      setExpression(
                        expression.substring(0, expression.length - 1) + item
                      );
                    } else {
                      setExpression(expression + item);
                    }
                    setPrev(item);
                  }
                }}
              >
                {item}
              </button>
            );
          })}
        </div>
      </div>
    </div>
  );
}

export default App;
