import "./App.css";
import Routes from "./Routes";
import { Link } from "react-router-dom";
import { useHistory } from "react-router-dom";

function App() {
  let history = useHistory();

  return (
    <div className="App">
      <button
        onClick={function () {
          history.push("/");
        }}
      >
        Go to home
      </button>
      <button
        onClick={function () {
          history.push("/users");
        }}
      >
        Go to Users
      </button>
      <h1>
        <Link to="/about">About</Link>
      </h1>

      <Routes />
    </div>
  );
}

export default App;
