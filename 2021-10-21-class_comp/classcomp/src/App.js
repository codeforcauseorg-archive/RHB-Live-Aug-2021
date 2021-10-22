import logo from "./logo.svg";
import "./App.css";
import React from "react";
import Square from "./Square";

class App extends React.Component {
  render() {
    return (
      <div className="App">
        <div>
          <Square/>
          <Square/>
          <Square/>
        </div>

        <div>
          <Square/>
          <Square/>
          <Square/>
        </div>

        <div>
          <Square/>
          <Square/>
          <Square/>
        </div>

      </div>
    );
  }
}

export default App;
