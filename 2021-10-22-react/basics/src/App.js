import logo from "./logo.svg";
import "./App.css";
import React from "react";


class Furher extends React.Component {

  render() {
    return <h1>World</h1>;
  }

}

class Deeper extends React.Component {

  render() {
    return <h1>Hello</h1>;
  }

}



class App extends React.Component {

  render() {
    return (<div style={{
      display: "flex",
    }}>
      <Deeper/>
      <Furher/>
    </div>)
  }

}

export default App;
