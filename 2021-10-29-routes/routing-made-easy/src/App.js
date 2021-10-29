import logo from "./logo.svg";
import "./App.css";
import { Route, Switch, useLocation } from "react-router";

function App() {
  let location = useLocation();

  switch (location.pathname) {
    case "/":
      return <h1>This is Root location</h1>;
    case "/profile":
      return <h1>This is Profile location</h1>;
    case "/settings":
      return <h1>This is settings location</h1>;
    default:
      return <h1>404</h1>;
  }
}

export default App;
