import React from "react";
import ReactDOM from "react-dom";

class App extends React.Component {
  constructor(props) {
    super(props);

    this.state = {
      time: new Date(),
      line: "I was sad",
    };
  }

  componentDidMount() {
    this.interval = setInterval(() => {
      console.log("updated");
      this.setState({
        time: new Date(),
      });
    }, 1000);
  }

  componentWillUnmount() {
    clearInterval(this.interval);
  }

  render() {
    setTimeout(() => {
      this.setState({
        ...this.state,
        line: "Now I am happy",
      });
    }, 1000);

    return (
      <div>
        <h1>Hello, world!</h1>
        <h2>It is {this.state.time.toLocaleTimeString()}.</h2>
        <h2>{this.state.line}</h2>
        <button onClick={()=> clearInterval(this.interval)}>Stop</button>
      </div>
    );
  }
}

ReactDOM.render(<App />, document.getElementById("root"));
